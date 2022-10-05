package app;

import app.messages.Menu;

import java.io.IOException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws IOException {

        System.out.println(Menu.MAIN_MENU);
        System.out.print(Menu.printPrompt());
        Scanner in = new Scanner(System.in);
        int userOption = in.nextInt();

        System.out.println(userOption);
    }

}
