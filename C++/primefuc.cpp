#include <iostream>
#include <cmath>

/*

is_prime(n)
	Determines the promality of a given value
	n an integer to test for primality
	returns true if n is prime; otherwise, returns false
*/

bool is_prime(int n) {
	bool result = true; // Provisionally, n is prime
	double r = n, root = sqrt(r);
	//Try all possible factors from 2 to the square
	//root of n
	for (int trial_factor = 2;
		result && trial_factor <= root; trial_factor++)
		result = (n % trial_factor != 0);
	return result;
}