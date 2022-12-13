#include <iostream>
#include <cstdlib>
#include <ctime>

/*
initialize_die
	Initialize the randomness of the die

*/

void initialize_die() {
	// Set the random seed value
	srand(static_cast<unsigned>(time(0)));
}
/*

show_die(spots)
	draws a picture of a die with number of spots
	indicated
	spots is the number of spots on the top face*/

void show_die(int spots) {
	switch (spots) {
	case 1: 
		std::cout << "Congrats you got a one";
		break;
	case 2:
		std::cout << "Congrats you got a two";
		break;
	case 3:
		std::cout << "Congrats you got a three";
		break;
	case 4:
		std::cout << "Congrats you got a four";
		break;
	case 5: 
		std::cout << "Congrats you got a five";
		break;
	case 6:
		std::cout << "Congrats you got a six";
		break;
	default:
		std::cout << "You are dumb roll a damn dice number";
		break;
	}
}

/*
roll
	Returns a pseudorandom number in the range 1...6

*/
int roll() {
	return rand() % 6 + 1;
}

int betterdie() {
	initialize_die();
	for (int i = 1; i < 3; i++)
		show_die(roll());
	return 0;
}


