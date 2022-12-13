// PNumb.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <fstream>

int main()
{
	std::ofstream outfile;
	int answer;
	int Pnumb = 0;
	outfile.open("output.txt");
	
		std::cout << "Please enter a number between 1 - 100000\n";
		std::cin >> answer;
		while (answer < 1 || answer > 100000) {
			std::cout << "Please enter a number between 1 - 100000\n";
			std::cin >> answer;
			//verify

		}
		
		for (int a = 1; a < answer; a++) {
			if (answer % a == 0) {
				Pnumb += a;
			}
			
		}
		if (Pnumb == answer) {
			std::cout << answer << " = " << " 1 " ;
			outfile << answer << " = " << " 1 ";

			for (int a = 2; a < answer; a++) {
				if (answer % a == 0) {

					std::cout << " + "<< a;
					outfile << " + " << a;

				}

			}
		}


		

		

		
		

		
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
