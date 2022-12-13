#include <iostream>
#include "Header.h"

int badfloatcheck() {
	//Count to ten by tenths
	for (double i = 0.0; i != 1.0; i += .1)
		std::cout << "i = " << i << '\n';
	return 0;
}