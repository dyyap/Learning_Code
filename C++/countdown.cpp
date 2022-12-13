#include <iostream>
#include "Header.h"

//Prints a countdown fron n to zero. The default 
//starting value it 10

void countdown(int n = 10) {
	while (n >= 0) //Count down from n to zero
		std::cout << n-- << '\n';


}

int countdown() {
	countdown(5);
	std::cout << "------------------" << '\n';
	return 0;
}