#include <iostream>
#include "Header.h"

int enhancedcheckrange() {
	int value;
	std::cout << "Please enter an integer value in the range 0...10: ";
	std::cin >> value;
	if (value >= 0) {
		//First Check
		if (value <= 10) {
			std::cout << value << "is acceptable\n";
		}
		else {
			std::cout << value << " is too large\n";
		}

	}
	else std::cout << value << "is too small\n";
	return 0;
}
