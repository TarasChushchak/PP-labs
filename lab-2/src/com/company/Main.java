package com.company;

import Product.Product;
import java.util.Scanner;

public class Main {
    // Оголошення Обєктів, Введення даних та Виведення
    public static void main(String[] args) {

        // Обявлення Обєктів та додаткових змін
        // Масив обєктів різних товарів
        Product[] products = new Product[10];
        Scanner scan = new Scanner(System.in);

        // Обєкт прінтів критеріїв
        PrintMethods pm = new PrintMethods();
        Main m = new Main();
        int id = 0;

        // Початок введення даних
        System.out.print("Введіть к-сть товару: ");
        id = scan.nextInt();
        for (int i = 0; i < id; i++) {
            products[i] = m.Input(scan, m, id);
        }

        // Для виведення
        while (true) {
            if (m.Print(scan, products, pm) == 1)
                break;
        }
    }

    public Product Input(Scanner scan, Main m, int id) {
        // Змінні терміну придатності
        int day, month, year;

        // Введення данних
        scan.nextLine();
        System.out.print("Введіть Назву: ");
        String name = scan.nextLine();
        System.out.print("Введіть Виробника: ");
        String creator = scan.nextLine();
        System.out.print("Введіть Ціну: ");
        double price = scan.nextDouble();

        // Введення та Перевірка на корректність терміну дії
        while (true) {
            System.out.println("Введіть к-сть днів, місяців та років терміну");
            System.out.printf("Введіть Термін: d-%d, m-%d, y-%d\n", day = scan.nextInt(), month = scan.nextInt(), year = scan.nextInt());
            if (day > 30 || day < 1 || month > 12 || month < 1 || year < 2020) {
                System.out.println("Значення введені не вірно, ведіть ще раз будь ласка(days не більше 30, month не більше 12, years не менше 2020) ⇙");
                continue;
            } else break;
        }

        // продовження введення данних
        System.out.print("Введіть Кількість: ");
        int num = scan.nextInt();
        System.out.println("");

        // Присвоєння даних через конструктор та повернення цього обєкту, щоб занести в масив
        Product product = new Product(id, name, creator, price, num, day, month, year);
        return product;
    }

    public int Print(Scanner scan, Product[] products, PrintMethods pm) {
        // ІD товар який ми хочемо вивести
        int id_2;
        // Масив для збереження критеріїв
        int[] Arr = new int[6];
        System.out.println("Критерії: ID, Name, Creator, Price, Date, Num");
        System.out.print("Введіть ID товару: ");
        // Ввід якого із товарів вибрати, якщо користувач вводе 0(цифра), програма завершується
        id_2 = scan.nextInt();
        if (id_2 == 0)
            return 1;

        System.out.println("______________________________________________");
        System.out.println("Введіть критерії, які хочете вивести: ");
        System.out.println("Якщо Хочете зупинити виведення, введіть - end");

        // виправлення проблем з буфером введення
        scan.nextLine();

        // Обєкт для обрання критерія
        CritIn ci = new CritIn();
        int counter = ci.Criterii(scan, Arr);

        // Обєкт для виведення криерія
        CritOut co = new CritOut();
        co.Criterii(counter, Arr, pm, id_2, products);
        return 0;
    }
}

