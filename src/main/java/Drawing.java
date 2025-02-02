import java.util.Scanner;

public class Drawing {

    final static String SPACE = " ";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sizeText = "Kérlek add meg a kért idom méretét: ";
        String weightText = "Kérlek add meg a kért idom szélességét: ";
        String heightText = "Kérlek add meg a kért idom magasságát: ";
        String symbolText = "Kérlek add meg a kirajzoló szimbólumot: ";
        boolean userDrawControl = true;

        while (userDrawControl) {
            System.out.println("0 - Kilépés");
            System.out.println("1 - Négyzet");
            System.out.println("2 - Piramis");
            System.out.println("3 - Téglalap");
            System.out.println("Add meg a rajzoláshoz az idom számát: ");

            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                int size = getUserNumberInput(scanner, sizeText);
                String symbol = getUserTextInput(scanner, symbolText);
                drawSquare(size, symbol);
            } else if (userChoice == 2) {
                int size = getUserNumberInput(scanner, sizeText);
                String symbol = getUserTextInput(scanner, symbolText);
                drawPyramid(size, symbol);
            } else if (userChoice == 3) {
                int weight = getUserWeightInput(scanner, weightText);
                int height = getUserHeightInput(scanner, heightText);
                String symbol = getUserTextInput(scanner, symbolText);
                drawRectangle(weight, height, symbol);
            } else if (userChoice == 0) {
                userDrawControl = false;
            } else {
                System.out.println("A menüben nem szerepel ilyen szám, válassz olyat, ami létezik!");
            }
        }

    }

    private static int getUserNumberInput(Scanner scanner, String text) {
        System.out.println(text);
        return scanner.nextInt();
    }

    private static int getUserWeightInput(Scanner scanner, String text) {
        System.out.println(text);
        return scanner.nextInt();
    }

    private static int getUserHeightInput(Scanner scanner, String text) {
        System.out.println(text);
        return scanner.nextInt();
    }

    private static String getUserTextInput(Scanner scanner, String text) {
        System.out.println(text);
        return scanner.next();
    }

    private static void drawSquare(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(symbol + SPACE);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void drawPyramid(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = size - i - 1; j >= 1; j--)
                System.out.print(SPACE);
            for (int j = 0; j <= i ; j++)
                System.out.print(symbol + SPACE);
            System.out.println();
        }
        System.out.println();
    }

    private static void drawRectangle(int weight, int height, String symbol) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print(symbol + SPACE);
            }
            System.out.println();
        }
        System.out.println();
    }
}
