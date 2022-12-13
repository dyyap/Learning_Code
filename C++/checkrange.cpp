#include <iostream>
#include "Header.h"

int checkrange() {
	int value;
	std::cout << "Please enter an integer value in the range 0..10: ";
	std::cin >> value;
	if (value >= 0) {
		//First check
		if (value <= 10) {
			std::cout << "In range";
		}

	}
	std::cout << "Done\n";
	return 0;
}