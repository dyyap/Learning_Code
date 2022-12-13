#include <iostream>
#include "Header.h"

int iterativecountoffive() {
	int count = 1;
	while (count <= 5) {
		std::cout << count << '\n';
		count++;
	}
	return 0;
}