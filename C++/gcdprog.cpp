#include <iostream>
#include "Header.h"

int gcdprog() {
	// Prompt the user for input
	int num1, num2;
	std::cout << "Please enter two integers: ";
	std::cin >> num1 >> num2;

	//Determine the smaller of num1 and num2
	int min = (num1 < num2) ? num1 : num2;

	// 1 is definitely a common factor to all ints
	int largestFactor = 1;
	for (int i = 2; i <= min; i++) {
		if (num1 % i == 0 && num2 % i == 0)
			largestFactor = i; //Found larger factor
		std::cout << largestFactor << '\n';
	}
}

int gcd(int num3, int num2) {
	//Determine the smaller of num1 and num2
	int min = (num3 < num2) ? num3 : num2;
	// 1 is definitely a common factor to all ints
	int largestFactor = 1;
	for (int i = 2; i <= min; i++) {
		if (num3 % i == 0 && num2 % i == 0)
			largestFactor = i;
		return largestFactor;
	}

}