#include <iostream>
#include <cstdlib>
#include <ctime>

int die() {
	//Set the random seed value
	srand(static_cast<unsigned>(time(0)));

	// Roll the die three times
	for (int i = 0; i < 3; i++) {
		//Generate random number in the range 1...6
		int value = rand() % 6 + 1;

		// Show the die
		switch (value) {
		case 1: std::cout << "You got a 1!"; break;
		case 2: std::cout << "You got a 2!"; break;
		case 3: std::cout << "You got a 3!"; break;
		case 4: std::cout << "You got a 4!"; break;
		case 5: std::cout << "You got a 5!"; break;
		case 6: std::cout << "You got a 6!"; break;
		default: std::cout << "You ain't rolling no die!";  break;

		}
	}
	return 0;
}