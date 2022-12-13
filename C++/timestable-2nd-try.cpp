#include <iostream>

int timestable2ndtry() {
	int size;
	std::cout << "Please enter the table size: ";
	std::cin >> size;
	// Print a size x size multiplication table
	int row = 1;
	while (row <= size) {
		int column = 1;
		while (column <= size) {
			int product = row * column;
			std::cout << product << " ";
			column++;
		}
		std::cout << '\n';
		row++;
	}
	return 0;
}