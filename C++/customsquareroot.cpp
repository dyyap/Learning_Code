#include <iostream>
#include <iomanip>
#include <cmath>
#include "Header.h"
//compute an approximation of
//the square root of x
double square_root(double x) {
	double diff;
	//Compute a provisional square root
	double root = 1.0;

		do {
			root = (root + x / root) / 2.0;

			diff = root * root - x;

		} while (diff > 0.0001 || diff < -.001);
		return root;
}
