import java.util.Scanner;

public class Calculator { // God Class
    public static void main(String[] args) {
        // Long Method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer het eerste getal in:");
        double a = scanner.nextDouble(); // No Error Handling

        System.out.println("Voer het tweede getal in:");
        double b = scanner.nextDouble();

        System.out.println("Kies een bewerking (1=+, 2=-, 3=*, 4=/):");
        int operation = scanner.nextInt();

        if (operation == 1) {
            System.out.println("Resultaat: " + (a + b) + " Bogos Binted"); // Duplicated Code
        } else if (operation == 2) {
            System.out.println("Resultaat: " + (a - b) + " Bogos Binted"); // Duplicated Code
        } else if (operation == 3) {
            System.out.println("Resultaat: " + (a * b) + " Bogos Binted"); // Duplicated Code
        } else if (operation == 4) {
            System.out.println("Resultaat: " + (a / b) + " Bogos Binted"); // No Error Handling (division by zero)
        } else if (operation == 69) {
            System.out.println("Ik ga je likken");
        } else {
            System.out.println("Ongeldige keuze.");
        }

        // Magic Numbers

    }
}
