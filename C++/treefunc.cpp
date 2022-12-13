#include <iostream>

/*
tree (height)
	Draws a tree of a given height
	height is the height of the displayed tree
	*/

void tree(int height) {
	int row = 0;
	while (row < height) {
		int count = 0;
		while (count < height - row)
		{
			std::cout << " ";
			count++;
		}

		/*
		Print out stars, twice the current row plus one:
		1. number of stars on the left side of tree
		= current row value
		2. exactly one star in the center of tree
		3. number of stars on right side of tree
		= current row value
		
		*/
		count = 0;
		while (count < 2 * row + 1)
		{
			std::cout << "*";
			count++;
		}
		// Move cursor down to next line
		std::cout << '\n';
		//Change to the next row
		row++;
	}
}

int treefunc() {
	int height;
	std::cout << "Enter height of tree: ";
	std::cin >> height;
	tree(height);
}