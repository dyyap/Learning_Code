#include <iostream>
#include "Header.h"

int badequality() {
	int input;
	std::cout << "Please enter an integer:";
	std::cin >> input;
	if (input = 2)
		std::cout << "two\n";
	std::cout << "You entered " << input << '\n';
	return 0;
}