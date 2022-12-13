#include <iostream>
#include "Header.h"

/*
factorial(n)
Computes n!
Returns the factorial of n.
*/

int factorial(int n) {
	if (n == 0)
		return 1;
	else
		return n * factorial(n - 1);

}
