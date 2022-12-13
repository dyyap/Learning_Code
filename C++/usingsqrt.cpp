#include <iostream>
#include <cmath>

int usingsqrt() {
	double x = 16.0;
	//Pass a literal value and display the result
	std::cout << sqrt(16.0) << '\n';
	// Pass a variable adn display the result
	std::cout << sqrt(x) << '\n';
	// Pass an expression
	std::cout << sqrt(2 * x - 5) << '\n';
	// Assign result to variable
	double y = sqrt(x);
	// Use result in an expression
	y = 2 * sqrt(x + 16) - 4;
	// Use result as argument to a function cell
	y = sqrt(sqrt(256.0));
	std::cout << y << '\n';

}
/*double sqrt(double x)
Computes the square root of a number: sqrt(x) =
√
x
double exp(double x)
Computes e raised a power: exp(x) = e
x
double log(double x)
Computes the natural logarithm of a number: log(x) = loge
x = lnx
double log10(double x)
Computes the common logarithm of a number: log(x) = log10 x
double cos(double)
Computes the cosine of a value specified in radians: cos(x) = cos x; other trigonometric
functions include sine, tangent, arc cosine, arc sine, arc tangent, hyperbolic cosine, hyperbolic
sine, and hyperbolic tangent
double pow(double x, double y)
Raises one number to a power of another: pow(x, y) = x
y
double fabs(double x)
Computes the absolute value of a number: fabs(x) = |x|
*/