package app;

import app.messages.Menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();
        boolean run = true;

        while(run) {
            System.out.println(menu.printMainMenu());
            System.out.print(menu.printPrompt());

            Scanner in = new Scanner(System.in);

            try {
                int userOption = in.nextInt();
                if (userOption > 3 || userOption < 1)
                    System.out.println("Selected option does not exist. Choose between 1 and 3.");
            } catch (InputMismatchException e) {
                System.out.println("You need to use a number from 1 to 3.");
            }


        }

    }

}
