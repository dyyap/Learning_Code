#include <iostream>
#include "Header.h"



int addnonnegatives() {
	int input = 0, sum = 0;
	// Request input from the user

	std::cout << "Enter numbers to sum, negatice numbers ends list";

	while (input >= 0) { // A negative number exits the loop
		std::cin >> input; // gets the value
		if (input >= 0)
			sum += input; // Only add it if it is nonnegative

	}
	std::cout << "Sum = " << sum << '\n'; // Display the sum
	return 0;
}