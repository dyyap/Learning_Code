#include <iostream>

int Pointerprint() {
	int a[] = { 2,4,6,8,10,12,14,16,18,20 },
		*p;

	p = &a[0]; // p points to first element of array a 

	// Print out the contents of the array
	for (int i = 0; i < 10; i++) {
	std::cout << *p << ' ';
	p++;
}
std::cout << '\n';
}