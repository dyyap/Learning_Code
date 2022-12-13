#include <iostream>
#include <vector>
#include <cstdlib>

/*
print(v)
	Prints the contents of an int vector
	v is the vector to print;  v is not modified
	*/

void print(const std::vector<int>& v) {
	for (int elem : v)
		std::cout << elem << " ";
	std::cout << '\n';

}

/*
make_random(v)
	Fills and int vector with pseudorandom numbers
	v is the vector to fill; v is modified
	size is the maximum size of the vector
	*/
void make_random(std::vector<int>& v, int size) {
	v.clear();
	int n = rand() % size + 1;
	for (int i = 0; i < n; i++)
		v.push_back(rand());

}
int makerandomvector() {
	srand(2);
	std::vector<int> list;
	//Print the contents of the vector
	std::cout << "Vector initially: ";
	print(list);
	make_random(list, 20);
	std::cout << "1st random vector: ";
	print(list);
	make_random(list, 5);
	std::cout << "2nd random vector: "; print(list);
	make_random(list, 10);
	std::cout << "3rd random vector: ";
	print(list);
}