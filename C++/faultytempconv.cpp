#include <iostream>
#include "Header.h"


int faultytempconv() {
	double degreesF = 0, degreesC = 0;
	//Define the relatonship between F and C
	degreesC = 5.0 / 9 * (degreesF - 32);
	// Prompt iser for degrees F
	std::cout << "Enter the temperature in degrees F: ";
	//Read in the user's input
	std::cin >> degreesF;
	//Report the result
	std::cout << degreesC << '\n';
	return 0;
}