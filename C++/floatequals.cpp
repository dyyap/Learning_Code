#include <iostream>
#include <cmath>

/*
equals (a,b, tolerance
	Returns true if a=b or | a-b| < tolerance.
	If a and b differe by only a small amount
	(specified by tolerange), a and b are sonsidere 
	"equal." Useful to account for floating-point 
	round-off error.
	the == operator is checked first since some special
	floating-point vaules such as HUGE_VAL require an exact 
	equality check
	*/

bool equals(double a, double b, double tolerance) {
	return a == b || fabs(a - b) < tolerance;
}

int floatequals() {
	for (double i = 0.0; !equals(i, 1.0, .0001); i += .1)
		std::cout << "i = " << i << '\n';
}