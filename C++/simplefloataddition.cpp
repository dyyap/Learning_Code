#include <iostream>

int simplefloataddition() {
	double x = .9;
	x += .1;
	if (x == 1)
		std::cout << "OK\n";
	else
		std::cout << "NOT OK\n";
	
}