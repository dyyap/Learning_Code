#include <iostream>
#include "Header.h"
int add(int x, int y) {
	return x + y;
}

int multiply(int x, int y) {
	return x * y;
}

int evaluate(int(*f)(int, int), int x, int y) {
	return f(x, y);
}

int arithmeticval() {
	std::cout << add(2, 3) << '\n';
	std::cout << multiply(2, 3) << '\n';
	std::cout << evaluate(&add, 2, 3) << '\n';
	std::cout << evaluate(&multiply, 2, 3) << '\n';
	return 0;
}