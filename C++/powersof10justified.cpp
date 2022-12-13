#include <iostream>
#include "Header.h"
#include <iomanip>



int powersof10justified() {
	int power = 1;
	while (power <= 1000000000) {
		//Right justify each number in a field 10 wide
		std::cout << std::setw(10) << power << '\n';
		power *= 10;
	}
	return 0;
}