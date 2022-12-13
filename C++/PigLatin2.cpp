// PigLatin2.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>
#include <istream>
#include <vector>

void PIGLATIN(std::string a) {

}

int main()
{
	int wordcounter = 0;
	std::string a;
	std::string word;
	std::cout << "Hello Please enter a phrase\n";
	std::getline(std::cin, a);
	for (int i = 0; i < a.length(); i++) {
		std::cout << a[i];
	}

	a += " ";
	std::cout << "\n";

	

	for (int i = 0; i < a.length(); i++) {
		
		if (isspace(a[i]))
		{
			word.insert(word.end(), 1, word[0]);
			word.erase(0, 1);
			std::cout << word << "ay ";
			word.clear();
			
		}
		else {
			word += a[i];
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
