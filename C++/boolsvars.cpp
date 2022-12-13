#include <iostream>
#include "Header.h"

int boolsvars() {
	bool a = true, b = false;
	std::cout << "a = " << a << ", b =" << b << '\n';
	//Reassign a 
	a = false;
	std::cout << "a = " << a << ", b =" << b << '\n';
	//Mix integers and Booleans
	a = 1;
	b = 1;
	std::cout << "a= " << a << ", b =" << b << '\n';
	//Assign Boolean value to an integer
	int x = a, y = true;
	std::cout << "a = " << a << ", b = " << b
		<< ", x = " << x << ", y = " << y << '\n';
	// More mixing
	a = 1725;
	b = -19;
	std::cout << "a = " << a << ", b = " << b << '\n';
	return 0;
}