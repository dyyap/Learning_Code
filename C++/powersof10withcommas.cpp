#include <iostream>
#include <iomanip>
#include "Header.h"

int powersof10withcommas() {
	int power = 1;
	std::cout.imbue(std::locale(""));
	while (power <= 1000000000)
	{// Right justify each number in a field 10 wide
		std::cout << std::setw(13) << power << '\n';
	}
	return 0;
}