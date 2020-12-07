package com.company;

import java.util.Scanner;

public class CritIn {
    String timeless;
    int i = 0;
    int counter = 0;

    int Criterii(Scanner scan, int[] Arr) {

        // Цикл запису вибраних критерій в масив
        do {
            System.out.print("ВВедіть: ");
            timeless = scan.nextLine();
            if (timeless.equals("ID") || timeless.equals("id")) {
                Arr[i] = 1;
                i++;
                counter++;
//                ID(id_2, products);
            }
            if (timeless.equals("Name") || timeless.equals("name")) {
                Arr[i] = 2;
                i++;
                counter++;
//                Name(id_2, products);
            }
            if (timeless.equals("Creator") || timeless.equals("creator")) {
                Arr[i] = 3;
                i++;
                counter++;
//                Creator(id_2, products);
            }
            if (timeless.equals("Price") || timeless.equals("price")) {
                Arr[i] = 4;
                i++;
                counter++;
//                Price(id_2, products);
            }
            if (timeless.equals("Date") || timeless.equals("date")) {
                Arr[i] = 5;
                i++;
                counter++;
//                Date(id_2, products);
            }
            if (timeless.equals("Num") || timeless.equals("num")) {
                Arr[i] = 6;
                i++;
                counter++;
//                Num(id_2, products);
            }
        } while (!timeless.equals("end"));
        return counter;
    }
}
