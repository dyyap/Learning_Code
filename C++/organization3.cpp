// Function declaration local to main; function definition follows main
#include <iostream>

int organization3() {
	int twice(int);
	std::cout << twice(5) << '\n';
}

int twice(int n) {
	return 2 * n;
}