package parralel;
import java.io.*; 
import java.util.*; 


public class SockMatcher {
    static class Sock {
        enum Color{RED, BLUE, GREEN, ORANGE};
        private final Object lock1 = new Object();
        private final int NumOfSocks;
        private int sockCounter;
        private int SockMade;
        private String Name;

        public void Print(){
            System.out.println(Name + ": Produced " + this.SockMade + " of " + NumOfSocks);
        }
        public Sock(final int NumOfSocks,final String name) {
            this.NumOfSocks = NumOfSocks; // Initialize Sock Object
            sockCounter = 0;
            this.Name = name;

        }

        public String getSockMade() { // 
            return this.SockMade;
        }

        public synchronized void ProduceSock() {
            sockCounter++;
            SockMade++;
          
        }
    }

    public class Matcher {

        
        private Queue trash;
        public synchronized void Match(final Sock a, final Sock b, final Sock c, final Sock d) {
            if (a.sockCounter == 2) {
                    trash.add(Color.RED);
                }
             

            }
        
    }

    public static void main(String[] args) {

        
        final Random r = new Random();
        final Matcher match = new Matcher();
    
        final Sock Red = 
            new Sock(r.nextInt(100)+1, "Red Sock"); // red sock count rand 100
        final Sock Blue = 
            new Sock(r.nextInt(100)+1, "Blue Sock"); //blue sock count rand 100
        final Sock Green =
            new Sock(r.nextInt(100)+1, "Green Sock"); //green sock count rand 100
        final Sock Orange =
            new Sock(r.nextInt(100)+1, "Orange Sock"); //orange sock count rand 100


        new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < Red.NumOfSocks; i++) {
                    Red.ProduceSock();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < Blue.NumOfSocks; i++) {
                    Blue.ProduceSock();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < Green.NumOfSocks; i++) {
                    Green.ProduceSock();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < Orange.NumOfSocks; i++) {
                    Orange.ProduceSock();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                match.Match(Red, Blue, Green, Orange);
            }
        }).start();


}
}