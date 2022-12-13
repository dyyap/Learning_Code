#include <iostream>

void swap(int a, int b) {
	int temp = a;
	a = b;
	b = temp;

}

int faultyswap() {
	int var1 = 5, var2 = 19;
	std::cout << "var1 = " << var1 << ", var2 =" << var2 << '\n';
	swap(var1, var2);
	std::cout << "var1 =" << var1 << ", var2 = " << var2 << '\n';
}