#include <iostream>
#include "Header.h"



int precise8th() {
	double one = 1.0,
		one_eighth = 1.0 / 8.0,
		zero = one - one_eighth - one_eighth - one_eighth
		- one_eighth - one_eighth - one_eighth
		- one_eighth - one_eighth;

	std::cout << "one= " << one << ", one_eighth = " << one_eighth
		<< ", zero = " << zero << '\n';
	return 0;
}