#include <iostream>

//Global declaration available to all function that follow declarations
int two_times(int);
int three_times(int);

int localfuncdef1() {
	std::cout << two_times(5) << '\n';
	std::cout << three_times(5) << '\n';
}

int three_times(int n) {
	return two_times(n) + n;
}

int two_times(int n) {
	return 2 * n;
}