#include  <iostream>

int resizearray() {
	double sum = 0.0, // Sum of the elements in the list
		*numbers, // Dynamic array of numbers
		input; // Current user entry

	//Initial size of array and amount to expand full array
	const int CHUNK = 3;
	int size = 0, // Current number of entries
		capacity = CHUNK; //Initial size of array

	//Allocate a modest-sized array to begin with
	numbers = new double[capacity];

	std::cout << "Please enter any number of nonnegative values "
		<< "(negative value ends the list): ";
	std::cin >> input;

	while (input >= 0) {
		if (size >= capacity) {
			capacity += CHUNK;
			double *temp = new double[capacity];
			for (int i = 0; i < size; i++)
				temp[i] = numbers[i];
			delete[] numbers;
			numbers = temp;
			std::cout << "Expanding by " << CHUNK << '\n';

		}
		numbers[size] = input;
		size++;
		sum += input;
		std::cin >> input;

	}
	if (size > 0) {
		std::cout << "The average of ";
		for (int i = 0; i < size; i++)
			std::cout << numbers[i] << ", ";
		//No comma following last element
		std::cout << numbers[size - 1] << " is "
			<< sum / size << '\n';

	}
	else
		std::cout <<  " no numbers to average\n";
	delete[] numbers;
}