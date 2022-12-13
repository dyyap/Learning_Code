#include <array>
#include <iostream>

int stdarray() {
	std::array<int, 10> arr;
	std::cout << arr.size() << '\n';
}