#include <iostream>
#include <cmath>

int standardsquareroot() {
	double input;

	//Get value from the user
	std::cout << "Enter number: ";
	std::cin >> input;

	// Compute the square root
	double root = sqrt(input);

	//Report result
	std::cout << "Square root of " << input << " = " << root << '\n';
	return 0;
}