#include <iostream>
#include "timermodule.h"
#include "Header.h"

int bettertimeit() {
	char letter;
	std::cout << "Enter a character: ";
	start_timer();
	std::cin >> letter;
	stop_timer();
	std::cout << elasped_time() << "seconds" << '\n';
	return 0;
}