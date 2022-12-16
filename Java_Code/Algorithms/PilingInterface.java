package sdfghjk;
//Daniel Yap
//CS240
//Assignment1
//4/19/2018

public interface PilingInterface<T>
{
	/** Adds a new book to the top of this pile.
		 @param newBook  An object to be added to the pile. */
	public void add(T newBook);

	/** Removes and returns this pile's top book.
		 @return  Either the book at the top of the pile or, if the
				    pile is empty before the operation, null. */
	
	public T remove();

	/** Retrieves this pile's top book.
		 @return  Either the book at the top of the pile or null if
				    the pile is empty. */
	public T getTopBook();

	/** Detects whether this pile is empty.
		 @return  True if the pile is empty. */
	public boolean isEmpty();

	/** Removes all books from this pile. */
	public void clear();
} // end PileInterface
