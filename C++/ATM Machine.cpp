// ATM Machine.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>

double Savings = 1000.00;
double Checking = 1000.00;
int chi;
double withdraw;



void TransfertoChecking(double checking)
{

	Checking += checking;
	Savings -= checking;

}

double DisplaySavingsBalance(double hi) {
	return hi;

}

double DisplayCheckingBalance(double hi) {
	return hi;

}

void TransfertoSavings(double savings)
{
	Checking -= savings;
	Savings += savings;

} 

void Withdraw(double withdraw, int choice) {
	switch (choice) {
	case 1:
		Checking -= withdraw;
		break;
	case 2:
		Savings -= withdraw;
		break;
	}




}
void menu() {
	int choice = 0;
	while (choice != 6) {
		std::cout << "  *** Welcome to Cal Poly's ATM ****\n"
			<< "(1) Transfer from checking account to savings account\n"
			<< "(2) Transfer from savings account to checking account;\n"
			<< "(3) Savings Account Balance\n"
			<< "(4) Checking Account Balance\n"
			<< "(5) Withdraw Cash from Either Account\n"
			<< "(6) Exit\n";
		std::cin >> choice;
		switch (choice) {
		case 1:
			double answer1;
			std::cout << "How much do you want to transfer into your account";
			std::cin >> answer1;
			if (answer1 <= Savings) {
				TransfertoChecking(answer1);
				break;
			}
		case 2:
			double answer2;
			std::cout << "How much do you want to transfer into your account";
			std::cin >> answer2;
			if (answer2 <= Checking) {
				TransfertoSavings(answer2);
				break;
			}
		case 3:
			std::cout << DisplaySavingsBalance(Savings);
			break;
		case 4:
			std::cout << DisplayCheckingBalance(Checking);
			break;
		case 5:
			chi = 0;
			withdraw = 0;
			while (chi != 1) {
				while (chi != 2) {
					std::cout << "Which account do you want to withdraw from?\n(1)Checking\n(2)Savings\n";
					std::cin >> chi;

				}

			}

			std::cout << "How Much Do You want to Withdraw";
			std::cin >> withdraw;

			while (withdraw > Checking)
			{
				while (withdraw > Savings) {
					Withdraw(withdraw, chi);
				}
			}

			break;

		case 6:
			break;
		}

	}
}


int main()
{
	int Password;
	
	bool flag = false;
    std::cout << "  *** Welcome to Cal Poly's ATM ****"; 
	
	for (int i = 0; i < 2; i++) {
		std::cout << "\nPlease enter your PIN :";
		std::cin >> Password;
	
		if (Password == 111) {
			flag = true;
			break;
		}
		
	}

	if (flag == true)
	{
		menu();
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
