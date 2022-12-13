#include <iostream>
#include "Header.h"

int betterprompt() {
	int result;
	std::cout << "Please enter an integer value";
	std::cin >> result;
	return result;
}