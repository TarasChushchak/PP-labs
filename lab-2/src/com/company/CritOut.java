package com.company;

import Product.Product;

public class CritOut {
    void Criterii(int counter, int[] Arr, PrintMethods pm,int id_2,Product[] products) {
        System.out.println("----------------------------------------------");
        int i = 0;

        // Цикл виведення вибраних критеріїв
        while (i < counter) {
            if (Arr[i] == 1) {
                pm.ID(id_2 - 1, products);
                i++;
            }
            if (Arr[i] == 2) {
                pm.Name(id_2 - 1, products);
                i++;
            }
            if (Arr[i] == 3) {
                pm.Creator(id_2 - 1, products);
                i++;
            }
            if (Arr[i] == 4) {
                pm.Price(id_2 - 1, products);
                i++;
            }
            if (Arr[i] == 5) {
                pm.Date(id_2 - 1, products);
                i++;
            }
            if (Arr[i] == 6) {
                pm.Num(id_2 - 1, products);
                i++;
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("Щоб вийти з програми нажміть: 0(цифра)");
    }
}
