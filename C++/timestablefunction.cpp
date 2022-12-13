#include <iostream>
#include <iomanip>

//Print the column labels for an n x n multiplication table
void col_numbers(int n) {
	std::cout << "   ";
	for (int column = 1; column <= n; column++) 
		std::cout << std::setw(4) << column;
	std::cout << '\n';
	
}

//Print the table's horizontal line at the top of the table
//beneath the column labels
void col_line(int n) {
	std::cout << "   +";
	for (int column = 1; column <= n; column++) 
		std::cout << "----";
	std::cout << '\n';
	
}
void col_header(int n) {
	//Print column titles
	col_numbers(n);

	//Print line separator
	col_line(n);
}

//Print the title that appears before each row of the table's 
//body
void row_header(int n) {
	std::cout << std::setw(4) << n << " |"; //Print the row label

}
//Print the line of text for row n
//This includes the row number and the 
//contents of each row
void print_row(int row, int columns) {
	row_header(row);
	for (int col = 1; col <= columns; col++) {
		std::cout << std::setw(4) << row * col;
	std::cout << '\n';
	}
}

void print_contents(int n) {
	for (int current_row = 1; current_row < +n; current_row++)
		print_row(current_row, n);
}

//Print a multiplicatio table of size n x n
void timestable(int n) {
	//First, print the column heading
	col_header(n);

	//Print table contents
	print_contents(n);
}

/*
Forces the user to enter an integer withing a 
specified range first is either a minimum or maximum
accetable value last is the corresponding other end 
of the range, either a maximum or minimum value 
Returns an acceptable value from the user*/

int get_int_range(int first, int last) {
	// If the larger number is provided first,
	// switch the parameters
	if (first > last) {
		int temp = first;
		first = last;
		last = temp;

	}
	//Insist on values in teh range first...last
	std::cout << "Please enter a value in the range " <<
		first << "..." << last << ": ";
	int in_value;
	bool bad_entry;
	do {
		std::cin >> in_value;
		bad_entry = (in_value < first || in_value > last);
		if (bad_entry) {
			std::cout << in_value << " is not in the range "
				<< first << "..." << last << '\n';
			std::cout << "Please try again: ";

		}
	} while (bad_entry);
	// in_value at this point is guaranteed to be within range
	return in_value;

}

int timestablefunction() {
	//Get table size from user; allow values in teh 
	// range 1...18
	int size = get_int_range(1, 18);

	//Print a size x size multiplication table
	timestable(size);
}