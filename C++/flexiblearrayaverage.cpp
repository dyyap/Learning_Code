#include <iostream>

int flexiblearrayaverage() {
	double sum = 0.0;
	double *numbers;
	int size;

	std::cout << "Please enter number of values to process: ";
	std::cin >> size;

	if (size > 0) {
		std::cout << "Please enter " << size << " numbers: ";
		//Allocate the exact size needed
		numbers = new double[size];
		// Dynamically allocated array 
		// Allow the user to enter in the values
		for (int i = 0; i < size; i++) {
			std::cin >> numbers[i];
			sum += numbers[i];

		}
		std::cout << numbers[size - 1] << " is "
			<< sum / size << '\n';
		delete [] numbers; // Free up the space held by numbers
	}
}