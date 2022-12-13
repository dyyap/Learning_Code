#include <iostream>
#include "Header.h"


int countup() {
	char input;
	int count = 0;
	bool done = false;

	while (!done) {

		//Print the current value of count
		std::cout << count << '\n';
		std::cout << "Please enter \"Y\" to contunue or \"N\" to quit: ";
		std::cin >> input;
		// Check for "Bad" input
		if (input != 'Y' && input != 'y' && input != 'N' && input != 'n')
			std::cout << "\"" << input << "\""
			<< " is not a valid choice" << '\n';
		else if (input == 'Y' || input == 'y')
			count++;
		else if (input == 'N' || input == 'n')
			done = true;
		//Quit the loop
	}
	return 0;
}