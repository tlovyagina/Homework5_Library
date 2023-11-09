package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в библиотеку!");
        System.out.println("Для выхода введите [*]");

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("*"))
                break;
        }

        System.out.println("До встречи! Приходите еще.");
    }
}