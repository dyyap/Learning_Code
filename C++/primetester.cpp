#include <iostream>
#include "prime.h"

int primetester() {
	int max_value;
	std::cout << "Display primes up to what value?";
	std::cin >> max_value;
	for (int value = 2; value <= max_value; value++)
		if (is_prime(value)) // See if value is prime
			std::cout << value << " ";
	std::cout << '\n';
}