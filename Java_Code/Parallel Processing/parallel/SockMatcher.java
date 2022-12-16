package parallel;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

import parallel.SockMatcher.Sock.Color;

import java.lang.Runnable; 


public class SockMatcher {
	
    static class Sock {
    	ReentrantLock lock = new ReentrantLock();
        enum Color{RED, BLUE, GREEN, ORANGE};
        private final int NumOfSocks;
        private int sockCounter;
        private int SockMade;
        private String Name;
    
        
        public synchronized void ResetSockCounter() {
        	sockCounter = 0;
        }
        public Sock(final int NumOfSocks,final String name) {
            this.NumOfSocks = NumOfSocks; // Initialize Sock Object
            sockCounter = 0; 
            this.Name = name;

        }

        public int getSockMade() { // 
            return this.SockMade;
        }

        public synchronized void ProduceSock() {
            sockCounter++;
            SockMade++;
            System.out.println(Name + ": Produced " + this.SockMade + " of " + NumOfSocks);
            if(sockCounter == 2) {
            	
            }
        }
 
    }

    	 static class Matcher {

    		Queue<Color> trash = new LinkedList<>();
    		public synchronized void Match(Sock a, Sock b, Sock c, Sock d) {
    			if (a.sockCounter == 2) {
                    trash.add(Color.RED);
                    System.out.println("Send Red Socks to Washer.");
                }
    			if (b.sockCounter == 2) {
    				trash.add(Color.BLUE);
    				System.out.println("Send Blue Socks to Washer");
    				
    			}
    			if (c.sockCounter == 2) {
    				trash.add(Color.GREEN);
    				System.out.println("Send Green Socks to Washer");
    				
    			}
    			if (d.sockCounter == 2) {
    				trash.add(Color.ORANGE);
    				System.out.println("Send Orange Socks to Washer");
    				
    			}

            }
    	 	
    		
    		public Queue<Color> getSocks() {
    			return this.trash;
    		}
    		
    		
    		public void TrashSocks() {
    			trash.poll();
    		}
        
    }
    	 
    	 static class Washer {
    		 
    		 public void WashSocks(Queue<Color> a) {
    			 System.out.println("Washer Destroyed " + a.poll() + " socks ");
    		 }
    		 
    		 
    	 
    }


    public static void main(String[] args) {
    	
    
        final Random r = new Random();
        final Matcher match = new Matcher();
        final Washer washer = new Washer();
   
        final Sock Red = 
            new Sock(r.nextInt(100)+1, "Red Sock"); // red sock count rand 100
        final Sock Blue = 
            new Sock(r.nextInt(100)+1, "Blue Sock"); //blue sock count rand 100
        final Sock Green =
            new Sock(r.nextInt(100)+1, "Green Sock"); //green sock count rand 100
        final Sock Orange =
            new Sock(r.nextInt(100)+1, "Orange Sock"); //orange sock count rand 100


       Thread t1 =  new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < Red.NumOfSocks; i++) {
                    Red.ProduceSock();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }

            }
        }});
        
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < Blue.NumOfSocks; i++) {
                    Blue.ProduceSock();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                     
                
                    
                }
            };
        });

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < Green.NumOfSocks; i++) {
                    Green.ProduceSock();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                     
                
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < Orange.NumOfSocks; i++) {
                    Orange.ProduceSock();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    
                }
            }
        });

       Thread matcher =  new Thread(new Runnable() {
            public void run() {
            	
            	while(true) {
            	//System.out.println(Red.sockCounter + "" + Blue.sockCounter +"" +  Green.sockCounter + ""+ Orange.sockCounter);
            	 match.Match(Red, Blue, Green, Orange);
            	 if (Red.sockCounter == 2) {
            		 Red.ResetSockCounter();
            	 }
            	 if (Blue.sockCounter == 2) {
            		 Blue.ResetSockCounter();
            	 }
            	 if (Green.sockCounter == 2) {
            		 Green.ResetSockCounter();
            	 }
            	 if (Orange.sockCounter == 2) {
            		 Orange.ResetSockCounter();
            	 }
            	 
            	 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException ie) {
                     Thread.currentThread().interrupt();
                 }
            	}
            	
            	
            }
        });
       
       Thread wash =  new Thread(new Runnable() {
           public void run() {
        	   
        	   try { 
                   Thread.sleep(1000);
               } catch (InterruptedException ie) {
                   Thread.currentThread().interrupt();
               }
        	   while(true) {
        	   if(match.getSocks().peek() != null) {
        	   washer.WashSocks(match.getSocks());
        	   match.TrashSocks();
        	   
        	   }
           	}
           }
       
       });
    
       matcher.start();
       wash.start(); 
       t1.start();
       t2.start();
       t3.start();
       t4.start();
      
       
    }   
    
    }
