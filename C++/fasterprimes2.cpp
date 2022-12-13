#include <iostream>
#include <vector>
#include <ctime>

//Display the prime numbers between 2 and 500,000 and
//time how long it takes

// Largest potential primes considered
const int MAX = 2000000;

// Each position in the Boolean vector indicates
// if the number of that position is not prime:
// false means "prime," and true means "composite."
// Initially all numbers are prime until proven otherwise

std::vector<bool> nonprimes(MAX);

void count_primes1() {
	int count = 0;
	clock_t start_time = clock();
	for (int value = 2; value <= MAX; value++) {
		// See if value is prime
		bool is_prime = true;
		//Try all possible factors from 2 to the value -1
		for (int trial_factor = 2; is_prime && trial_factor < value; trial_factor++)
			is_prime = (value % trial_factor != 0);
		if (is_prime)
			count++;

	}
	//Print the elapsed time
	std::cout << "Count =  " << count << " ";
	std::cout << "Elasped time: "
		<< static_cast<double>(clock() - start_time) / CLOCKS_PER_SEC
		<< "seconds\n";

}

void count_primes2() {
	int count = 0;
	clock_t start_time = clock();
	for (int value = 2; value <= MAX; value++) {
		// See if value is prime
		bool is_prime = true;
		double r = value, root = sqrt(r);

		for (int trial_factor = 2; is_prime && trial_factor <= root; trial_factor++)
			is_prime = (value % trial_factor != 0);
		if (is_prime)
			count++;

	}
	//Print the elasped time
	std::cout << "Count = " << count << " ";
	std::cout << "Elasped time: "
		<< static_cast<double>(clock() - start_time) / CLOCKS_PER_SEC
		<< " seconds\n";

}

void count_primes3() {
	int count = 0;
	clock_t start_time = clock();

	//First prime number is 2; 0 and 1 are not primes
	nonprimes[0] = nonprimes[1] = true;

	//Start at the first prime number, 2.
	for (int i = 2; i < MAX; i++) {
		// See if i is prime
		if (!nonprimes[i]) {
			count++;
			for (int j = 2 * i; j < MAX; j += i)
				nonprimes[j] = true;
		}
	}
	//Print the elasped time
	std::cout << "Count = " << count << " ";
	std::cout << "Elasped time: "
		<< static_cast<double>(clock() - start_time) / CLOCKS_PER_SEC
		<< " seconds\n";

}

int fasterprimes2() {
	count_primes1();
	count_primes2();
	count_primes3();
}