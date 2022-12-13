#include <iostream>
#include <vector>

int vectoroutofbounds() {
	const int SIZE = 3;
	std::vector<int> a{ 5, 5, 5 };
	//Print the contents of the vector
	std::cout << "a contains: ";
	for (int i = 0; i < SIZE; i++)
		std::cout << a[i] << " ";
	std::cout << '\n';
	//Change all the 5s in vector a to 8s
	for (int i = 0; i <= SIZE; i++)
		a[i] = 8;
	//Reprint the contents of the vector
	std::cout << "a contains ";
	for (int i = 0; i < SIZE; i++)
		std::cout << a[i] << " ";
	std::cout << '\n';
}