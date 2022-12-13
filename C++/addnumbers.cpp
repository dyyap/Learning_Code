
#include <iostream>
#include "Header.h"




int addnumbers() {
	int input, sum = 0;
	std::cout << "Enter numbers to sum, type 'q' to end the list:";
	while (std::cin >> input)
		sum += input;
	std::cout << "Sum = " << sum << '\n';
	return 0;
}