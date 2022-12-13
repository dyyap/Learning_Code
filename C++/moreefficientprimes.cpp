#include <iostream>
#include <cmath>

int moreefficientprimes() {
	int max_value;
	std::cout << "Display primes up to what value? ";
	std::cin >> max_value;
	for (int value = 2; value <= max_value; value++) {
		// See if value is prime
		bool is_prime = true;
		double r = value, root = sqrt(r);
		for (int trial_factor = 2;
			is_prime && trial_factor <= root; trial_factor++)
			is_prime = (value % trial_factor != 0);
		if (is_prime)
			std::cout << value << " ";

	}
	std::cout << '\n';
}