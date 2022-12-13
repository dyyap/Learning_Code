#include <iostream>
#include "Header.h"

int timeconvcond1() {
	const int SECONDS_PER_MINUTE = 60,
		SECONDS_PER_HOUR = 60 * SECONDS_PER_MINUTE; //3600
	int hours, minutes, seconds;
	std::cout << "Please enter the number of seconds:";
	std::cin >> seconds;
	//First, computer the number of hours in the given number
	//of seconds
	hours = seconds / SECONDS_PER_HOUR;
	// 3600 seconds = 1 hours
	// Compute the remaining seconds after the hours are 
	// accounted for
	seconds = seconds % SECONDS_PER_HOUR;
	// Next, compute the number of minutes in the remaining 
	// number of seconds
	minutes = seconds / SECONDS_PER_MINUTE;
	// 60 seconds = 1 minute
	// Compute the remaining seconds after the minutes are
	// accounted for
	seconds = seconds % SECONDS_PER_MINUTE;
	// Report the results
	std::cout << hours;
	// Decide between singular and plural form of hours
	if (hours == 1) {
		std::cout << " hour ";
	}
	else {
		std::cout << minutes;
	}
	std::cout << seconds;
	// Decide between singular and plural form of seconds
	if (seconds == 1) {
		std::cout << " second";
	}
	else {
		std::cout << " seconds";
	}
	std::cout << '\n';
	return 0;
}