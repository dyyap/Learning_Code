#include <iostream>
#include <ctime>
#include <cmath>

//Display the prime numbers between 2 ad 500,000 and 
//time how long it takes

int measureprimespeed() {
	clock_t start_time = clock(), //record start time
		end_time;
	for (int value = 2; value <= 50000; value++) {
		bool is_prime = true;
		for (int trial_factor = 2; is_prime && trial_factor < value; trial_factor++) {
			is_prime = (value % trial_factor != 0);
			if (is_prime)
				std::cout << value << " "; //dislay the prime number

		}
		std::cout << '\n';
		end_time = clock();
		//Print the elapsed time
		std::cout << "Elapse time:"
			<< static_cast<double>(end_time - start_time) / CLOCKS_PER_SEC
			<< " sec. " << '\n';

	}
}