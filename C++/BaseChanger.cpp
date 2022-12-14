// spp.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <stack>
#include <string>
#include <math.h>
std::string Base10to16(int a);
int Base8to10(int a);


int Base2to10(int a) {
	int answer = 0;
	int count = 0;
	int final = 0;
	std::stack <int> s;
	while (a != 0) { 
		if ((a % 2) != 0)
			s.push(pow(2,count++)*(a % 2));
		else
			s.push(a % 2); // populate the array
		a = a / 10;
	}

	while (!s.empty()) {
		final += s.top();
		s.pop();
		
	}
	return final;


}
void Base2to8(int a) {
	int answer = 0;
	int count = 0;
	int final = 0;
	std::stack <int> s;
	while (a != 0) {
		if ((a % 2) != 0)
			s.push(pow(8, count++) * (a % 2));
		else
			s.push(a % 2); // populate the array
		a = a / 10;
	}

	while (!s.empty()) {
		final += s.top();
		s.pop();

	}
	std::cout << final;


}

std::string Base2to16(int a) {

	std::cout << Base10to16(Base2to10(a));
	return Base10to16(Base2to10(a));

}

void Base10to2(int a) {

	std::string numb;
	std::stack <int> s; 
	while (a != 0) {
		s.push(a % 2); // populate the array
		a = a / 2;
	}

	while (!s.empty()) {
		std::cout <<  s.top();
		s.pop();
	}

	
	
}

int Base8to10(int a) {
	int answer = 0;
	int count = 0;
	int final = 0;
	std::stack <int> s;
	while (a != 0) {
		if ((a % 8) != 0)
			s.push(pow(8, count++) * (a % 8));
		else
			s.push(a % 8); // populate the array
		a = a / 10;
	}

	while (!s.empty()) {
		final += s.top();
		s.pop();

	}
	return final;

}
int HexChecker(char a) { //hex lexicon
	switch (a) {
	case '1': return 1;
		break;
	case '2': return 2;
		break;
	case '3': return 3;
		break;
	case '4': return 4;
		break;
	case '5': return 5;
		break;
	case '6': return 6;
		break;
	case '7': return 7;
		break;
	case '8': return 8;
		break;
	case '9': return 9;
		break;
	case 'a' : return 10;
		break;
	case 'b': return 11;
		break;
	case 'c': return 12;
		break;
	case 'd': return 13;
		break;
	case 'e': return 14;
		break;
	case 'f': return 15;
		break;

	}
}

char HexChecker(int a){ //hex lexicon
	switch (a) {
	case 1: return '1';
		break;
	case 2: return '2';
		break;

	case 3: return '3';
		break;
	case 4: return '4';
		break;

	case 5: return '5';
		break;
	case 6: return '6';
		break;

	case 7: return '7';
		break;
	case 8: return '8';
		break;

	case 9: return '9';
		break;
	case 10: return 'a';
		break;
	case 11: return 'b';
		break;
	case 12: return 'c';
		break;
	case 13: return 'd';
		break;
	case 14: return 'e';
		break;
	case 15: return 'f';
		break;
	
	}
}

std::string Base10to16(int a) {
	std::string numb;
	std::stack <char> s;
	while (a != 0) {
		s.push(HexChecker(a % 16));// populate the array
		a = a / 16;
	}

	while (!s.empty()) {
		numb += s.top();
		s.pop();
	}
	
	return numb;


}



void Base10to8(int a) {
	std::stack <int> s;
	while (a != 0) {
		s.push(a % 8);
		a = a / 8;

		
	}
	while (!s.empty()) {
		std::cout << s.top();
		s.pop();
	}
}

void Base8to2(int a) {
	 Base10to2(Base8to10(a));
}

void Base8to16(int a) {
	Base10to16(Base8to10(a));
}





int main()
{
	int aaaah;
	int j;
	int i;
	int count = 0;
	std::string sh;
	std::stack <int>* s;
	std::cout << "Please enter a number\n if hex press 2\n";
	std::cin >> aaaah;
	switch (aaaah) {
	case 2: std::cout << "Please enter a hex number";
		std::cin >> sh;
		for (int l = 0; l < sh.length(); l++) {
			 i += (( HexChecker(sh[l])) * pow(16, count++));
		}

	default: std::cin >> i;
	}
	
	std::cout << "What do you want to transfer:\n1 10-2\n2: 10-8\n3: 10-16\n4: 2-10\n5: 2-8\n6: 2-16\n7: 8-2\n8: 8-10\n9: 8-16\n10: 16-10\n11: 16-2";
	std::cin >> j;
	switch (j) {
	case 1: Base10to2(i); break;
	case 2: Base10to8(i); break;
	case 3: Base10to16(i); break;
	case 4: Base2to10(i); break;
	case 5: Base2to8(i); break;
	case 6: Base2to16(i); break;
	case 7: Base8to2(i); break;
	case 8: Base8to10(i); break;
	case 9: Base8to16(i); break;
	case 10: std::cout << i; break;
	case 11: Base10to2(i); break;
	case 12: Base10to8(i); break;
	





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
