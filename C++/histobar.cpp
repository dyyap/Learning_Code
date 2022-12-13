#include <iostream>

//Draws a bar n segments long
// using iteration
void segments(int n) {
	while (n > 0) {
		std::cout << "*";
			n--;
	}
	std::cout << '\n';
}

//Draws a bar n segments long
// using recursion
void segments2(int n) {
	if (n > 0) {
		std::cout << "*";
		segments2(n - 1);
	}
	else
		std::cout << '\n';
