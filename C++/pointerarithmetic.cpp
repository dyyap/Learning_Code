#include <iostream>

int pointerarithmetic() {
	// Make an array
	int arr[] = { 10,20,30,40,50 };
	int *p = arr;
	std::cout << *p << '\n';
	std::cout << p[0] << '\n';
	std::cout << p[1] << '\n';
	std::cout << *p << '\n';
	p++;
	std::cout << *p << '\n';
	p += 2;
	std::cout << *p << '\n';
	std::cout << p[0] << '\n';
	std::cout << p[1] << '\n';
	p--;
	std::cout << *p << '\n';
}