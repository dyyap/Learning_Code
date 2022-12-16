package sdfghjk;
//Daniel Yap
//CS240
//Assignment1
//4/19/2018


public final class PileOfTextbooks<T> implements PilingInterface<T>
{
	
	private T[] pile;
	private int NumberofTextbooks = 0;
	
 
	public void add(T newBook) {
		pile[NumberofTextbooks] = newBook;
		NumberofTextbooks++;
		
		
	}


	public T remove() {
		if (NumberofTextbooks != 0) {
			pile[NumberofTextbooks] = null;
			NumberofTextbooks--;
			return pile[NumberofTextbooks];
		}
		else {
		return null;
		}
	}


	public T getTopBook() {
		if (NumberofTextbooks != 0) {
			return pile[NumberofTextbooks];
		}
		else {
		return null;
		}

	}


	public boolean isEmpty() {
		if (NumberofTextbooks == 0) {
			return true;
		}
		else {
		return false;
	}
	}


	public void clear() {
		while (isEmpty() == false) {
			remove();
		}
		
	}


	}


