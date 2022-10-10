package app;

import app.calculator.*;
import app.messages.Menu;
import app.messages.MessageToUser;
import app.shapes.Circle;
import app.shapes.GeometricShape;
import app.shapes.Rectangle;
import app.shapes.Square;

import java.awt.*;
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
                    System.out.print(messageToUser.askForNumber());
                    calculator.add(in.nextDouble());
                    System.out.println(menu.getStandardCalculatorMenu());
                    System.out.print(menu.printPrompt());
                    int userOperationOption = in.nextInt();

                    if (userOperationOption == 1) {
                        System.out.print(messageToUser.askForNumber());
                        calculator.add(in.nextDouble());
                        System.out.println(calculator.getResult());
                    }

                    if (userOperationOption == 2) {
                        System.out.print(messageToUser.askForNumber());
                        calculator.subtract(in.nextDouble());
                        System.out.println(calculator.getResult());
                    }

                    if (userOperationOption == 3) {
                        System.out.print(messageToUser.askForNumber());
                        calculator.multiply(in.nextDouble());
                        System.out.println(calculator.getResult());
                    }

                    if (userOperationOption == 4) {
                        System.out.print(messageToUser.askForNumber());
                        calculator.divide(in.nextDouble());
                        System.out.println(calculator.getResult());
                    }

                    if (userOperationOption == 5) {
                        System.out.print(messageToUser.askForNumber());
                        calculator.exponentiate(in.nextDouble());
                        System.out.println(calculator.getResult());
                    }

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
                    GeometricShape userShape;
                    System.out.println(messageToUser.printSelectedOption(userOption));
                    System.out.println(menu.getAreaCalculatorMenu());
                    System.out.print(menu.printPrompt());
                    int userAreaCalculatorOption = in.nextInt();

                    if (userAreaCalculatorOption == 1) {
                        System.out.print(messageToUser.askForRadius());
                        double radius = in.nextDouble();
                        userShape = new Circle(radius);
                        calculator.changeShape(userShape);
                        System.out.println(calculator.getResult());
                    }

                    if (userAreaCalculatorOption == 2) {
                        System.out.print(messageToUser.askForSideLength());
                        double userSideLength = in.nextDouble();
                        userShape = new Square(userSideLength);
                        calculator.changeShape(userShape);
                        System.out.println(calculator.getResult());
                    }

                    if (userAreaCalculatorOption == 3) {
                        System.out.print(messageToUser.askForLength());
                        double userLength = in.nextDouble();
                        System.out.print(messageToUser.askForWidth());
                        double userWidth = in.nextDouble();
                        userShape = new Rectangle(userLength, userWidth);
                        calculator.changeShape(userShape);
                        System.out.println(calculator.getResult());
                    }

                }

            } catch (InputMismatchException e) {
                System.out.println("You need to use a number from 1 to 3.");
            }


        } //while

    } //main method

}
