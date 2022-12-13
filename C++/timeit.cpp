#include <iostream>
#include <ctime>

int timeit() {
	char letter;
	std::cout << "Enter a character: ";
	clock_t seconds = clock();
	std::cin >> letter;
	clock_t other = clock();
	std::cout << static_cast<double>(other - seconds) / CLOCKS_PER_SEC << " seconds\n";
	return 0;
}