
#include <iostream>
#include "Header.h"


int unsignedoverflow() {
	unsigned x = 4294967293;
	std::cout << x << " + 1 = " << x + 1 << '\n';
	std::cout << x << " + 2 = " << x + 2 << '\n';
	std::cout << x << " + 3 = " << x + 3 << '\n';
	return 0;
}