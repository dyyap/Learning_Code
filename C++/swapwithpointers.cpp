#include <iostream>	

/*

swap(a,b)
	Interchanges the values of memory
	references by its parameters a and b.
	It effectively interchanges the values
	of variables in teh caller's context
	*/

void swap(int *a, int *b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}

int swapwithpointers() {
	int var1 = 5, var2 = 19;
	std::cout << "var1 = " << var1 << ", var2 = " << var2 << '\n';
	swap(&var1, &var2);
	std::cout << "var1 = " << var1 << ",var2 = " << var2 << '\n';
}