package com.telusko;

import java.util.Scanner;

public class TicTacToe {

	public static int place(char M[][], int x, int p) {
		switch (x) {
		case 1:
			if ((int)M[0][0] == 0)
			{
				if (p == 1)
					M[0][0] = 'X';
				else
					M[0][0] = 'O';
				return 1;
			} 
			else
				return 0;
		case 2:
			if ((int)M[0][1] == 0) {
				if (p == 1)
					M[0][1] = 'X';
				else
					M[0][1] = 'O';
				return 1;
			} else
				return 0;
		case 3:
			if ((int)M[0][2] == 0) {
				if (p == 1)
					M[0][2] = 'X';
				else
					M[0][2] = 'O';
				return 1;
			} else
				return 0;
		case 4:
			if ((int)M[1][0] == 0) {
				if (p == 1)
					M[1][0] = 'X';
				else
					M[1][0] = 'O';
				return 1;
			} else
				return 0;
		case 5:
			if ((int)M[1][1] == 0) {
				if (p == 1)
					M[1][1] = 'X';
				else
					M[1][1] = 'O';
				return 1;
			} else
				return 0;
		case 6:
			if ((int)M[1][2] == 0) {
				if (p == 1)
					M[1][2] = 'X';
				else
					M[1][2] = 'O';
				return 1;
			} else
				return 0;
		case 7:
			if ((int)M[2][0] == 0) {
				if (p == 1)
					M[2][0] = 'X';
				else
					M[2][0] = 'O';
				return 1;
			} else
				return 0;
		case 8:
			if ((int)M[2][1] == 0) {
				if (p == 1)
					M[2][1] = 'X';
				else
					M[2][1] = 'O';
				return 1;
			} else
				return 0;		
		case 9:
			if ((int)M[2][2] == 0) {
				if (p == 1)
					M[2][2] = 'X';
				else
					M[2][2] = 'O';
				return 1;
			} else
				return 0;
		default:
				return 0;
		}
	}
	
	public static boolean win(char M[][],char c)
	{
		for(int i=0;i<3;i++)
		{
			if(M[i][0]==c && M[i][1]==c && M[i][2]==c)
				return true;
			if(M[0][i]==c && M[1][i]==c && M[2][i]==c)
				return true;
		}
		if(M[0][0]==c && M[1][1]==c && M[2][2]==c)
			return true;
		if(M[0][2]==c && M[1][1]==c && M[2][0]==c)
			return true;
		return false;
	}

	public static void print(char M[][])
	{
		System.out.println("Board: ");
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" " + M[i][j]);
				if(j<2)
					System.out.print(" |");
			}
			System.out.println();
			if(i<2)
				System.out.println("-----------");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char M[][] = new char[3][3];
		System.out.println("Tic-Tac-Toe");
		System.out.println();
		int count = 0,p1,p2;
		do {
			System.out.println("Player 1");
			System.out.println("---------");
			do
			{
				System.out.print("Enter valid choice: ");
				p1 = sc.nextInt();
			}while(place(M,p1,1)==0);
			count++;
			print(M);
			if(count>=5)
			{
				if (win(M,'X')) 
				{
					System.out.println("Player 1 won !!!");
					break;
				}
			}
			if(count==9) 
			{
				System.out.println("Match Draw !!!");
				break;
			}
			System.out.println("Player 2");
			System.out.println("---------");
			do
			{
				System.out.print("Enter valid choice: ");
				p2 = sc.nextInt();
			}while(place(M, p2, 2)==0);
			count++;
			print(M);
			if(count>5)
			{
				if (win(M,'O')) 
				{
				System.out.println("Player 2 won!!!");
				break;
				}
			}
		} while (true);
		System.out.println("GAME OVER!");
	}
}
