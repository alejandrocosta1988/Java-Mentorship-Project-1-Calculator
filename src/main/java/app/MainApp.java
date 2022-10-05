package app;

import app.calculator.AreaCalculator;
import app.calculator.BmiCalculator;
import app.calculator.Calculator;
import app.calculator.StandardCalculator;
import app.messages.Menu;
import app.messages.MessageToUser;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();
        MessageToUser messageToUser = new MessageToUser();
        Calculator calculator;

        boolean run = true;

        while(run) {
            System.out.println(menu.printMainMenu());
            System.out.print(menu.printPrompt());

            Scanner in = new Scanner(System.in);

            try {

                int userOption = in.nextInt();

                if (userOption > 3 || userOption < 1)
                    System.out.println("Selected option does not exist. Choose between 1 and 3.");

                if (userOption == 1) {
                    calculator = new StandardCalculator();
                    System.out.println(messageToUser.printSelectedOption(userOption));
                }

                if (userOption == 2) {
                    calculator = new BmiCalculator();
                    System.out.println(messageToUser.printSelectedOption(userOption));
                }

                if (userOption == 3) {
                    calculator = new AreaCalculator();
                    System.out.println(messageToUser.printSelectedOption(userOption));
                }

            } catch (InputMismatchException e) {
                System.out.println("You need to use a number from 1 to 3.");
            }


        } //while

    } //main method

}
