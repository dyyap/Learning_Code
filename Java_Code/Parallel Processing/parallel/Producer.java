package parallel;

public class Producer {
	int hasproduced;
	int increment;
	public Producer() {
		increment = 0;
		hasproduced = 0;
	}
	
	public Integer Increment() {
		increment++;
		hasproduced++;
		return increment;
	}
	
	public synchronized Integer SynchronizedIncrement() {
		increment++;
		return increment;
		
	}
	
	public int getHasProduced() {
		return hasproduced;
	}

}
