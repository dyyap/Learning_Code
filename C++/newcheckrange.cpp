
#include <iostream>
#include "Header.h"

int newcheckrange() {
	int value;
	std::cout << "Please enter an integer value in the range 0...10: ";
	std::cin >> value;
	if (value >= 0 && value <= 10) {
		std::cout << "In range\n";
	}
	return 0;
}