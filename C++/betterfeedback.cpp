#include <iostream>
#include "Header.h"

int betterfeedback() {
	int dividend, divisor;

	// Get two integers from the user
	std::cout << "Please enter two integers to divide: ";
	std::cin >> dividend >> divisor;
	// If possible, divide them and report the result
	if (divisor != 0) {
		std::cout << dividend << "/" << divisor << " = "
			<< dividend / divisor << '\n';
	}
	else {
		std::cout << "Division by zero is not allowed\n";

	}
	return 0;

}