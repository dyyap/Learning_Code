// prime.cpp
#include <cmath>
#include "prime.h"

bool is_prime(int n) {
	bool result = true;
	double r = n, root = sqrt(r);

	for (int trial_factor = 2; result && trial_factor <= root; trial_factor++)
		result = (n % trial_factor != 0);
	return result;
}
