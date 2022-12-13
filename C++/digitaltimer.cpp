#include <iostream>
#include <iomanip>
#include <ctime>

// Some conversions from seconds
const clock_t SEC_PER_MIN = 60,
SEC_PER_HOUR = 60 * SEC_PER_MIN,
SEC_PER_DAY = 24 * SEC_PER_HOUR;

/*
print_time
	Displays the time in hr:min:sec format
	seconds is the number of seconds to display
	*/

void print_time(clock_t seconds) {
	clock_t hours = 0, minutes = 0;

	//Prepare to display time ======================
	std::cout << '\n';
	std::cout << "     ";

	// Compute and display hours ===============
	hours = seconds / SEC_PER_DAY;
	std::cout << std::setw(2) << std::setfill('0') << hours << ":";

	//Remove the hours from seconds
	seconds %= SEC_PER_HOUR;

	//Compute and display minutes ===================
	minutes = seconds / SEC_PER_MIN;
	std::cout << std::setw(2) << std::setfill('0') << minutes << ":";
	//Remove the minutes from seconds
	seconds %= SEC_PER_MIN;

	//Compute and display seconds ===================
	std::cout << std::setw(2) << std::setfill('0') << seconds << '\n';
}

int digitaltimer() {
	clock_t start = clock();
	clock_t elasped = (clock() - start) / CLOCKS_PER_SEC,
		previousElasped = elasped;
	//Counts up to 24hours (1 day), then stops
	while (elasped < SEC_PER_DAY) {
		if (elasped - previousElasped >= 1) {
			previousElasped = elasped;
			print_time(elasped);
		}
		elasped = (clock() - start) / CLOCKS_PER_SEC;
	}
		
}