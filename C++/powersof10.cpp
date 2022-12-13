#include <iostream>
#include "Header.h"
int powersof10() {
	int power = 1;
	while (power <= 1000000000) {
		std::cout << power << '\n';
		power *= 10;
	}
	return 0;
}