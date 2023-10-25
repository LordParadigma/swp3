package at.is.Grundlagen.Aufgaben;

import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {

        System.out.println("Es handelt sich hier um ein TicTacToe Spiel, indem Sie nacheinander die Zahl eingeben müssen, in der Sie ihr Zeichen platzieren wollen.");
        System.out.println("Der Spieler 1 hat das X und der Spieler 2 hat das O.\n Das Spielfeld ist wie folgt aufgebaut: \n1|2|3\n4|5|6\n7|8|9");

        int iSelection = ' ';
        int iCheck = 0;
        int iRunThrough = 0;
        int iwins = 0;
        int ities = 0;
        Scanner scanner = new Scanner(System.in);

        int[]  iConverted = new int[2];
        char[][] cField = new char[3][3];
        int[][] iAvailable = new int [3][3];

        for (int i = 0; i < cField.length; i++) {
            for (int j = 0; j < cField.length; j++) {
                cField[i][j] = ' ';
            }
        }

        for (int i = 0; i < iAvailable.length; i++) {
            for (int j = 0; j < iAvailable.length; j++) {
                iAvailable[i][j] = 0;
            }
        }

        do {
            ShowField(cField);

            System.out.println("Spieler 1: ");

            do {

                iSelection = scanner.nextInt();
                iCheck = isavailable(iAvailable, iSelection);

                if (iCheck == 0) {

                    iConverted = convert(iSelection);
                    iAvailable[iConverted[0]][iConverted[1]] = 1;
                    cField[iConverted[0]][iConverted[1]] = 'X';

                    ShowField(cField);
                    iRunThrough = 1;
                    ities += 1;
                }
                else if (iCheck == 1) {
                    System.out.println("In dem Feld ist bereits ein X");
                    System.out.println("Bitte wiederholen Sie ihre Eingabe");
                }
                else if (iCheck == 2) {
                    System.out.println("In dem Feld ist bereits ein O");
                    System.out.println("Bitte wiederholen Sie ihre Eingabe");
                }
            } while (iRunThrough != 1);
            iRunThrough = 0;

            iwins = gewonnen(iAvailable);
            if(iRunThrough == 9 | iwins == 1){


            }else {
                System.out.println("Spieler 2: ");
                do {
                    iSelection = scanner.nextInt();
                    iCheck = isavailable(iAvailable, iSelection);

                    if (iCheck == 0) {
                        iConverted = convert(iSelection);
                        iAvailable[iConverted[0]][iConverted[1]] = 2;
                        cField[iConverted[0]][iConverted[1]] = 'O';
                        iRunThrough = 1;
                        ities += 1;
                    }
                    else if (iCheck == 1) {
                        System.out.println("In dem Feld ist bereits ein X");
                        System.out.println("Bitte wiederholen Sie ihre Eingabe");
                    }
                    else if (iCheck == 2) {
                        System.out.println("In dem Feld ist bereits ein O");
                        System.out.println("Bitte wiederholen Sie ihre Eingabe");
                    }
                } while (iRunThrough != 1);
                iRunThrough = 0;

                iwins = gewonnen(iAvailable);
            }
        }while(iwins == 0 && ities < 9);

        if(iwins == 1){
            System.out.println("Spieler 1 hat gewonnen");
        }
        else if (iwins == 0){
            System.out.println("Spieler 2 hat gewonnen");
        }
        else {
            System.out.println("Es ist Unentschieden");
        }
    }


    public static void ShowField(char[][] Field){
        for ( int i = 0; i < Field.length; i ++){
            System.out.println("|" +  Field[i][0] + "|" +  Field[i][1] +  "|" +  Field[i][2] + "|");
        }
    }


    public static int isavailable (int[][] Spielfeld, int Zahl) {
        int iZahl = Zahl;
        int iResult = 0;
        int[] iArray = new int[2];
        iArray = convert(iZahl);

        if (Spielfeld[iArray[0]][iArray[1]] == 0) {
            iResult = 0;
        }
        else if (Spielfeld[iArray[0]][iArray[1]] == 1) {
            iResult = 1;
        }
        else {
            iResult = 2;
        }

        return iResult;
    }


    public static int[] convert(int Zahl){
        int iZeile = 0;
        int iSpalte = 0;
        int[] iConverted = new int[2];

        switch (Zahl) {
            case 1:
                iZeile = 0;
                iSpalte = 0;
                break;
            case 2:
                iZeile = 0;
                iSpalte = 1;
                break;
            case 3:
                iZeile = 0;
                iSpalte = 2;

                break;
            case 4:
                iZeile = 1;
                iSpalte = 0;
                break;
            case 5:
                iZeile = 1;
                iSpalte = 1;
                break;
            case 6:
                iZeile = 1;
                iSpalte = 2;
                break;
            case 7:
                iZeile = 2;
                iSpalte = 0;
                break;
            case 8:
                iZeile = 2;
                iSpalte = 1;
                break;
            case 9:
                iZeile = 2;
                iSpalte = 2;
                break;
        }
        iConverted[0] = iZeile;
        iConverted[1] = iSpalte;
        return  iConverted;
    }


    public static int gewonnen (int[][] iAvailable){
        int iGewonnen = 0;

        if(iAvailable[0][0] == 1 && iAvailable[1][1] == 1 && iAvailable[2][2] == 1){
            iGewonnen = 1;
        }
        else if (iAvailable[0][2] == 1 && iAvailable[1][1] == 1 && iAvailable[2][0] == 1) {
            iGewonnen = 1;
        }
        else if (iAvailable[0][0] == 1 && iAvailable[0][1] == 1 && iAvailable[0][2] == 1) {
            iGewonnen = 1;
        }
        else if (iAvailable[1][0] == 1 && iAvailable[1][1] == 1 && iAvailable[1][2] == 1) {
            iGewonnen = 1;
        }
        else if (iAvailable[2][0] == 1 && iAvailable[2][1] == 1 && iAvailable[2][2] == 1) {
            iGewonnen = 1;
        }
        else if (iAvailable[0][0] == 1 && iAvailable[1][0] == 1 && iAvailable[2][0] == 1) {
            iGewonnen = 1;
        }
        else if (iAvailable[0][1] == 1 && iAvailable[1][1] == 1 && iAvailable[2][1] == 1) {
            iGewonnen = 1;
        }
        else if (iAvailable[0][2] == 1 && iAvailable[1][2] == 1 && iAvailable[2][2] == 1) {
            iGewonnen = 1;
        }

        if(iAvailable[0][0] == 2 && iAvailable[1][1] == 2 && iAvailable[2][2] == 2){
            iGewonnen = 2;
        }
        else if (iAvailable[0][2] == 2 && iAvailable[1][1] == 2 && iAvailable[2][0] == 2) {
            iGewonnen = 2;
        }
        else if (iAvailable[0][0] == 2 && iAvailable[0][1] == 2 && iAvailable[0][2] == 2) {
            iGewonnen = 2;
        }
        else if (iAvailable[1][0] == 2 && iAvailable[1][1] == 2 && iAvailable[1][2] == 2) {
            iGewonnen = 2;
        }
        else if (iAvailable[2][0] == 2 && iAvailable[2][1] == 2 && iAvailable[2][2] == 2) {
            iGewonnen = 2;
        }
        else if (iAvailable[0][0] == 2 && iAvailable[1][0] == 2 && iAvailable[2][0] == 2) {
            iGewonnen = 2;
        }
        else if (iAvailable[0][1] == 2 && iAvailable[1][1] == 2 && iAvailable[2][1] == 2) {
            iGewonnen = 2;
        }
        else if (iAvailable[0][2] == 2 && iAvailable[1][2] == 2 && iAvailable[2][2] == 2) {
            iGewonnen = 2;
        }

        return  iGewonnen;
    }
}