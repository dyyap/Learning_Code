#include <ctime>

double elasped;
clock_t start_time;
bool running;
void reset_timer() {
	elasped = 0.0;
	running = false;
}

void start_timer() {
	if (!running) {
		running = true;
		start_time = clock();

	}
}

void stop_timer() {
	if (running) {
		clock_t stop_time = clock();
		running = false;
		elasped += static_cast<double> ((stop_time - start_time)) / CLOCKS_PER_SEC;


	}
}

double elasped_time() {
	if (running) {
		clock_t current_t = clock();
		return elasped + static_cast<double> ((current_t - start_time)) / CLOCKS_PER_SEC;

	}
	else
		return elasped;

	} 