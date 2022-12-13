#include <iostream>
#include <cctype>

int touppercase() {
	for (char lower = 'a'; lower <= 'z'; lower++) {
		char upper = toupper(lower);
		std::cout << lower << " => " << upper << '\n';

		return 0;
	}
}
/*
int toupper(int ch)
Returns the uppercase version of the given character; returns the original character if no
uppercase version exists (such as for punctuation or digits)
int tolower(int ch)
Returns the lowercase version of the given character; returns the original character if no
lowercase version exists (such as for punctuation or digits)
int isupper(int ch)
Returns a nonzero value (true) if ch is an uppercase letter (’A’–’Z’); otherwise, it returns
0 (false)
int islower(int ch)
Returns a nonzero value (true) if ch is an lowercase letter (’a’–’z’); otherwise, it returns
0 (false)
int isalpha(int ch)
Returns a nonzero value (true) if ch is a letter from the alphabet (’A’–’Z’ or ’a’–’z’);
otherwise, it returns 0 (false)
int isdigit(int ch)
Returns a nonzero value (true) if ch is a digit (’0’–’9’); otherwise, it returns 0 (false)*/