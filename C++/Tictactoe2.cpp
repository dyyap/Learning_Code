// Tictactoe2.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>


int main()
{
	const int row = 3, col = 3;
	int row1 = 0, row2 = 0, row3 = 0, col1 = 0, col2 = 0, col3 = 0, diag1 = 0, diag2 = 0;
    std::cout << "Welcome to Tic Tac Toe\nPlayer One is X\nPlayer 2 is O\n";
	char board[row][col]; //front end
	bool gameover = false;
	bool player = true, a = true, b = true, c = true, d = true, e = true, f = true, g = true, h = true, i = true; // Player 1 true , Player 2 false
	char token;
	int win;
	int	turncount = 0;
	


	
	
	


	for (int i = 0; i < row; i++) { //clear the board
		for (int j = 0; j < col; j++)
		board[i][j] = '*';
	}

	



	std::cout << board[0][0] << "|" << board[0][1] << "|" << board[0][2] << "\n";
	std::cout << "--------" << "\n";
	std::cout << board[1][0] << "|" << board[1][1] << "|" << board[1][2] << "\n";
	std::cout << "--------" << "\n";
	std::cout << board[2][0] << "|" << board[2][1] << "|" << board[2][2] << "\n";

	while (gameover != true) {
		if (player == true) {
			token = 'X';
			win = 10;
		}
		else {
			token = 'O';
			win = 1;
		}

		int answer;
		std::cout << "Player, Pick a number 1-9\n";
		std::cin >> answer;

		switch (answer) {
		case 1:
			if (a == true) {
				board[0][0] = token;
				row1 += win;
				diag1 += win;
				col1 += win;
				a = false;
			}
		

			break;


		case 2:
			if (b == true) {
				board[0][1] = token;
				row2 += win;
				col2 += win;
				b = false;
			}
			break;


		case 3:
			if (c == true) {
				board[0][2] = token;
				row2 += win;
				col2 += win;
				diag2 += win;
				c = false;
			}
			break;

		case 4:
			if (d == true) {
				board[1][0] = token;
				row2 += win;
				col1 += win;
				d = false;
			}
			break;

		case 5:
			if (e == true) {
				board[1][1] = token;
				row2 += win;
				col2 += win;
				diag1 += win;
				diag2 += win;
				e = false;
			}
			break;

		case 6:
			if (f == true) {
				board[1][2] = token;
				row2 += 0;
				col3 += 0;
				f = false;
			}
			break;


		case 7:
			if (g == true) {
				board[2][0] = token;
				row3 += win;
				col1 += win;
				diag2 += win;
				g = false;
			}
			break;

		case 8:
			if (h == true) {
				board[2][1] = token;
				row3 += win;
				col2 += win;
				h = false;
			}
			break;

		case 9:
			if (i == true) {
				board[2][2] = token;
				row3 += win;
				col3 += win;
				diag1 += win;
				i = false;
			}
			break;

		}

		turncount++;

		if (row1 == 3 || row2 == 3 || row3 == 3 || col1 == 3 || col2 == 3 || col3 == 3 || diag1 == 3 || diag2 == 3) {
			std::cout << "Player 2 wins\n";
			gameover = true;
		}
		if (row1 == 30 || row2 == 30 || row3 == 30 || col1 == 30 || col2 == 30 || col3 == 30 || diag1 == 30 || diag2 == 30) {
			std::cout << "Player 1 wins\n";
			gameover = true;
		}

		if (turncount % 2 != 0) {
			player = false;
		}
		else {
			player = true;
		}

		if (turncount == 9 && gameover == false) {
			std::cout << "tie";
			gameover = true;
		}

		
		

		
		 
	}

	std::cout << board[0][0] << "|" << board[0][1] << "|" << board[0][2] << "\n";
	std::cout << "--------" << "\n";
	std::cout << board[1][0] << "|" << board[1][1] << "|" << board[1][2] << "\n";
	std::cout << "--------" << "\n";
	std::cout << board[2][0] << "|" << board[2][1] << "|" << board[2][2] << "\n";

		
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
