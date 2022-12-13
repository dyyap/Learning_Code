//Function declaration precedes main; function definition follows main
#include <iostream>

int twice(int);

int organization2() {
	std::cout << twice(5) << '\n';
}

int twice(int n) {
	return 2 * n;
}