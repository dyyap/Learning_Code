#include <iostream>
#include "Header.h"


int imprecise5th() {
	double one = 1.0,
		one_fifth = 1.0 / 5.0,
		zero = one - one_fifth - one_fifth - one_fifth
		- one_fifth - one_fifth;
	std::cout << "one = " << one << ", one_fifth = " << one_fifth
		<< ", zero = " << zero << '\n';
	return 0;
}