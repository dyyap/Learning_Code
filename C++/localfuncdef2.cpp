// Local declaration in main
#include <iostream>

int localfuncdef2() {
	//These function declarations are local to main
	int two_times(int);
	int three_times(int);
	std::cout << two_times(5) << '\n';
	std::cout << three_times(5) << '\n';
}

//The two_times function is not declared for three_times function!
int three_times(int n) {
	return two_times(n) + n;
}

int two_times(int n) {
	return 2 * n;
}