package com.company;

import Product.Product;
public class PrintMethods {
    public void ID(int numbers, Product[] products) {
        System.out.printf("| ID: %-39d|\n", products[numbers].getId());
    }

    public void Name(int numbers, Product[] products) {
        System.out.printf("| Назва: %-29s|\n", products[numbers].getName());
    }

    public void Creator(int numbers, Product[] products) {
        System.out.printf("| Виробник: %-33s|\n", products[numbers].getCreator());
    }

    public void Price(int numbers, Product[] products) {
        System.out.printf("| Ціна: %-37.2f|\n", products[numbers].getPrice());
    }

    public void Date(int numbers, Product[] products) {
        products[numbers].Dates();
    }

    public void Num(int numbers, Product[] products) {
        System.out.printf("| Кількість: %-32d|\n", products[numbers].getNum());
    }
}
