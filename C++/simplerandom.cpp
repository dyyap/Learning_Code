#include <iostream>
#include <cstdlib>

int simplerandom() {
	srand(23);
	for (int i = 0; i < 100; i++) {
		int r = rand();
		std::cout << r << " ";

	}
	std::cout << '\n';
}