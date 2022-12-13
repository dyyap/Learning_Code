#include <iostream>

/*
increment (x)
	Illustrates pass by value protocol
*/

void increment(int x) {
	std::cout << "Beginning execution of increment, x = "
		<< x << '\n';
	x++;
	std::cout << "Ending execution of increment, x = "
		<< x << '\n';

}