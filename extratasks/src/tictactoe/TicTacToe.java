package tictactoe;

import tictactoe.exception.MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    private static String[][] inputDataContainer = null;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter cells: ");
        inputDataContainer = new String[3][3];
        inputDataContainer = TicTacToe.InnerClass.fillingTheGrid();
        TicTacToe.InnerClass.gridOutput();
        do {
            point : {
                System.out.print("Enter the coordinates: ");
                try {
                    inputDataContainer = TicTacToe.InnerClass.gridChange(sc.nextInt(), sc.nextInt());
                } catch (MyException e) {
                    break point;
                } catch (InputMismatchException e) {
                    System.out.println("You should enter numbers!");
                    sc.nextLine();
                    break point;
                }
                TicTacToe.InnerClass.gridOutput();
                System.out.println(TicTacToe.InnerClass.currentGameState());
                return;
            }
        } while (true);
    }

    private static class InnerClass {
        private static final StringBuilder TEMP_STORAGE = new StringBuilder();
        private static final String X_SEQUENCE = "XXX";
        private static final String O_SEQUENCE = "OOO";
        public static boolean xSequence = false;
        public static boolean oSequence = false;

        public static String[][] gridChange(int a, int b) throws MyException {
            if (inputDataContainer[a-1][b-1].equals("X") || inputDataContainer[a-1][b-1].equals("O")) {
                System.out.println("This cell is occupied! Choose another one!");
                throw new MyException();
            }
            inputDataContainer[a-1][b-1] = "X";
            return inputDataContainer;
        }




        public static String[][] fillingTheGrid() {
            String inputLine = sc.nextLine();
            char[] inputLineCharContainer = inputLine.toCharArray();
            int arrayColumnIterator = 0;
            int arrayLineIterator = 0;
            int inputLineContainerIterator = 0;
            do {
                do {
                    inputDataContainer[arrayLineIterator][arrayColumnIterator] = inputLineCharContainer[inputLineContainerIterator] + "";
                    arrayColumnIterator++;
                    inputLineContainerIterator++;
                } while (arrayColumnIterator != 3);
                arrayColumnIterator = 0;
                arrayLineIterator++;
            } while (arrayLineIterator < 3);
            return inputDataContainer;
        }
        public static void gridOutput() {
            System.out.println("---------");
            System.out.print("| ");
            for (int i = 0; i < inputDataContainer.length; i++) {
                for (int j = 0; j < inputDataContainer[i].length; j++) {
                    System.out.print(inputDataContainer[i][j] + " ");
                }
                System.out.print("|");
                if (i != inputDataContainer.length - 1) {
                    System.out.println();
                    System.out.print("| ");
                } else {
                    break;
                }
            }
            System.out.println();
            System.out.println("---------");
        }
        public static String currentGameState() {
            StringBuilder result = new StringBuilder();
            do {
                if (impossibleCheck()) {
                    result.append("Impossible");
                    break;
                }
                if (xWinsCheck()) {
                    result.append("X wins");
                    break;
                }
                if (oWinsCheck()) {
                    result.append("O wins");
                    break;
                }
                if (drawCheck()) {
                    result.append("Draw");
                    break;
                }
                if (gameNotFinishedCheck()) {
                    result.append("Game not finished");
                    break;
                }
            } while (true);
            return result.toString();
        }
        public static boolean sequenceChecker() {
            boolean checkState = false;
            switch (TEMP_STORAGE.toString()) {
                case (X_SEQUENCE) -> {
                    xSequence = true;
                    checkState = true;
                }
                case (O_SEQUENCE) -> {
                    oSequence = true;
                    checkState = true;
                }
            }
            TEMP_STORAGE.delete(0, 3);
            return checkState;
        }
        public static boolean rowsElementsSequenceCheck() {
            boolean checkState = false;
            for (String[] strings : inputDataContainer) {
                for (String string : strings) {
                    TEMP_STORAGE.append(string);
                }
                if (sequenceChecker()) {
                    checkState = true;
                }
            }
            return checkState;
        }
        public static boolean columnsElementsSequenceCheck() {
            boolean checkState = false;
            for (int i = 0; i < inputDataContainer.length; i++) {
                for (int j = 0; j < inputDataContainer[i].length; j++) {
                    TEMP_STORAGE.append(inputDataContainer[j][i]);
                }
                if(sequenceChecker()){
                    checkState = true;
                }
            }
            return checkState;
        }
        public static boolean mainDiagElementSequenceCheck() {
            boolean checkState;
            int tempIterator = 0;
            do {
                TEMP_STORAGE.append(inputDataContainer[tempIterator][tempIterator]);
                tempIterator++;
            } while (tempIterator < 3);
            checkState = sequenceChecker();
            return checkState;
        }
        public static boolean supDiagElementSequenceCheck() {
            boolean checkState;
            for (int i = 0; i < inputDataContainer.length; i++) {
                TEMP_STORAGE.append(inputDataContainer[i][inputDataContainer.length - 1 - i]);
            }
            checkState = sequenceChecker();
            return checkState;
        }
        public static boolean emptyCellsCheck() {
            boolean checkState = false;
            String tempContainer;
            point : {
                for (String[] strings : inputDataContainer) {
                    for (String string : strings) {
                        tempContainer = string;
                        if (tempContainer.equals("_")) {
                            checkState = true;
                            break point;
                        }
                    }
                }
            }
            return checkState;
        }
        public static boolean checkingTheSequenceOfThree() {
            boolean checkState;
            int magicalNum = 0;
            do {
                checkState = rowsElementsSequenceCheck();
                if (checkState) {
                    break;
                }
                checkState = columnsElementsSequenceCheck();
                if (checkState) {
                    break;
                }
                checkState = mainDiagElementSequenceCheck();
                if (checkState) {
                    break;
                }
                checkState = supDiagElementSequenceCheck();
                if (checkState) {
                    break;
                }
            } while (magicalNum != 0);
            return checkState;
        }
        /*Game States Checks*/
        public static boolean gameNotFinishedCheck() {
            boolean checkState = false;
            if (!checkingTheSequenceOfThree()) {
                checkState = emptyCellsCheck();
            }
            return checkState;
        }
        public static boolean drawCheck() {
            return !checkingTheSequenceOfThree() && !emptyCellsCheck();
        }
        public static boolean xWinsCheck() {
            return checkingTheSequenceOfThree() && xSequence;
        }
        public static boolean oWinsCheck() {
            return checkingTheSequenceOfThree() && oSequence;
        }
        public static boolean impossibleCheck() {
            int xCounter = 0;
            int oCounter = 0;
            boolean checkState = xWinsCheck() && oWinsCheck();
            for (String[] strings : inputDataContainer) {
                for (String string : strings) {
                    if (string.equals("X")) {
                        xCounter++;
                    }
                    if (string.equals("O")) {
                        oCounter++;
                    }
                }
            }
            if (Math.abs(xCounter - oCounter) >= Math.abs(2)) {
                checkState = true;
            }
            return checkState;
        }
    }
}
