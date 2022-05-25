package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {

    static char[] board = new char[10];
    static char computer;
    static char player;
    public static Scanner scannerObject = new Scanner(System.in);

    static void createBoard(){
        for(int index = 1 ; index<10 ; index++) {
            board[index] = ' ';
        }
    }

    public static void getPlayerChoice() {

        System.out.print("Choose X or O : ");
        player = Character.toUpperCase(scannerObject.next().charAt(0));

        if (player == 'X')
            computer = 'O';
        else
            computer = 'X';
        System.out.println("You have selected : " + player);
        System.out.println("Computer's choice is : " + computer);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        TicTacToeGame t1 = new TicTacToeGame();
        getPlayerChoice();
        createBoard();
    }
}
