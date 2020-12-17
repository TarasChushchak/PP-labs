package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstAmount, secondAmount;
        ArrayList<Droid> firstTeamOfDroid = new ArrayList<>();
        ArrayList<Droid> secondTeamOfDroid = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть кількість дроїдів в першій команді:\t");
        firstAmount = in.nextInt();
        for (int i = 0; i < firstAmount; i++){
            System.out.print("Виберіть тип дроїда:\n" +
                    "1 - Berserk\n" +
                    "2 - Medic\n" +
                    "3 - KINGKONG\n" +
                    "4 - Sniper\n");
            int type = in.nextInt();
            if (type == 1){
                firstTeamOfDroid.add(new DroidBerserk());
            }
            else if (type == 2){
                firstTeamOfDroid.add(new DroidMedic());
            }
            else if (type == 3){
                firstTeamOfDroid.add(new DroidKINGKONG());
            }
            else if (type == 4){
                firstTeamOfDroid.add(new DroidSniper());
            }
            else{
                System.out.print("Ви вибрали неправильний вид дроїда:\n");
                firstTeamOfDroid.add(new Droid());
            }
        }
        System.out.print("Введіть кількість дроїдів в другій команді:\t");
        secondAmount = in.nextInt();
        for (int i = 0; i < secondAmount; i++){
            System.out.print("Виберіть тип дроїда:\n" +
                    "1 - Berserk\n" +
                    "2 - Medic\n" +
                    "3 - KINGKONG\n" +
                    "4 - Sniper\n");
            int type = in.nextInt();
            if (type == 1){
                secondTeamOfDroid.add(new DroidBerserk());
            }
            else if (type == 2){
                secondTeamOfDroid.add(new DroidMedic());
            }
            else if (type == 3){
                secondTeamOfDroid.add(new DroidKINGKONG());
            }
            else if (type == 4){
                secondTeamOfDroid.add(new DroidSniper());
            }
            else{
                System.out.print("Ви вибрали неправильний вид дроїда:\n");
                secondTeamOfDroid.add(new Droid());
            }
        }
        Battle battle = new Battle(firstTeamOfDroid, secondTeamOfDroid);
        System.out.println("|\tName\t|\tType\t|\tWeapon\t|\tHealth\t|\tDamage\t|\tProtection\t|");
        battle.startBattle();


    }
}









