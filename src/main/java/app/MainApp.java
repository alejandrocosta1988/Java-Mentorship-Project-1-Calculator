package app;

import app.calculator.*;
import app.messages.Menu;
import app.messages.MessageToUser;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();
        MessageToUser messageToUser = new MessageToUser();

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
                    StandardCalculator calculator = new StandardCalculator();
                    System.out.println(messageToUser.printSelectedOption(userOption));
                    System.out.println(messageToUser.askForNumber());
                    calculator.add(in.nextDouble());
                }

                if (userOption == 2) {
                    BmiCalculator calculator = new BmiCalculator();
                    System.out.println(messageToUser.printSelectedOption(userOption));

                    try {
                        System.out.print(messageToUser.askForWeight());
                        calculator.setWeight(in.nextDouble());
                        System.out.print(messageToUser.askForHeight());
                        calculator.setHeight(in.nextDouble());
                        calculator.calculateBmi();
                        double bmiResult = calculator.getResult();
                        System.out.println(messageToUser.printBmiResult(bmiResult));
                    } catch (BmiException e) {
                        System.out.println(e.getMessage());
                    }
                }

                if (userOption == 3) {
                    AreaCalculator calculator = new AreaCalculator();
                    System.out.println(messageToUser.printSelectedOption(userOption));
                }

            } catch (InputMismatchException e) {
                System.out.println("You need to use a number from 1 to 3.");
            }


        } //while

    } //main method

}
