package org.calc;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MyApp
{
    public static void main( String[] args ) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean cont = true;
        while (cont) {
            String command;
            double num = 0;
            System.out.println("\n**************");
            System.out.println("* Calculator *");
            System.out.println("**************");
            System.out.printf("Sum: %f\n", calc.getSum());
            System.out.println("\nCommand options:");
            System.out.println("+ : add");
            System.out.println("- : sub");
            System.out.println("* : multiply");
            System.out.println("/ : divide");
            System.out.println("c : Clear/reset calculator");
            System.out.println("q : Quit program");
            System.out.print("Enter a command:");
            command = scan.nextLine();
            if (!command.equals("c") & !command.equals("q")) {
                while (true) {
                    System.out.print("Enter a double: ");
                    try {
                        num = Double.parseDouble(scan.nextLine().toLowerCase());
                        break;
                    }catch (NumberFormatException e) {
                        System.out.println("Wrong input format!");
                    }
                }
            }
            switch (command) {
                case "+":
                    calc.add(num);
                    break;
                case "-":
                    calc.sub(num);
                    break;
                case "*":
                    calc.multiply(num);
                    break;
                case "/":
                    if (num != 0)
                        calc.divide(num);
                    else
                        System.out.println("Cant divide with zero");
                    break;
                case "c":
                    calc.reset();
                    break;
                case "q":
                    cont = false;
                    break;
                default:
                    System.out.println("Not a valid command!");
                    break;
            }

        }
    }
}
