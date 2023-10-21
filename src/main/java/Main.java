import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to the calculator\nEnter a command:");
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);

        while(true) {
            String command = in.nextLine();
            String[] commandArgs = command.split(" ");
            switch (commandArgs[0]) {
                case "add":
                    System.out.println(calculator.add(Integer.parseInt(commandArgs[1]),Integer.parseInt(commandArgs[2])));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(Integer.parseInt(commandArgs[1]),Integer.parseInt(commandArgs[2])));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(commandArgs[1]),Integer.parseInt(commandArgs[2])));
                    break;
                case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(commandArgs[1]),Integer.parseInt(commandArgs[2])));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(Integer.parseInt(commandArgs[1])));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(commandArgs[1])));
                    break;
                default:
                    return;
            }
        }
    }
}
