package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

    public class Main{
        ArrayList<Integer> AllInterval= new ArrayList<Integer>();
        ArrayList<Integer> ParniElements = new ArrayList<Integer>();
        ArrayList<Integer> NeparniElements = new ArrayList<Integer>();

        public static void main (String[]args) {

            Main main = new Main();
            Scanner scan = new Scanner(System.in);
            int[] intervals = main.GetInterval(scan);
            main.intervals(intervals);
            System.out.println(main.AllInterval);
            main.Parni();
            Collections.sort(main.ParniElements, Collections.reverseOrder());
            System.out.println(main.ParniElements);

            main.Neparni();
            System.out.println(main.NeparniElements);

            main.sumparni();
            main.sumneparni();

            Fibonachi fibonachi = new Fibonachi(main.NeparniElements.get(main.NeparniElements.size()-1),
                    main.ParniElements.get(main.ParniElements.size() - 1));
            int lenght = main.lengthfib(scan);
            fibonachi.CreatNumber(lenght);
            fibonachi.resultfibonachi();
            ArrayList<Integer> Fibper = fibonachi.resultfibonachi();
            main.fibper(Fibper);
        }
        /***
         * Метод у якому ми зчитуємо з клавіатури інтервал
         * return Повертає інтервал
         */
        public int[] GetInterval(Scanner in){
            int intervals[]= new int[2];
            System.out.print("Enter Intervals ");
            intervals[0]= in.nextInt();
            System.out.print("Enter second number or intervals ");
            intervals[1]= in.nextInt();
            return intervals;
        }
        /***
         * Метод який додає числа у список
         */
        public void intervals (int intervals[]){
            for(int i= intervals[0]; i<= intervals[1]; i++){
                AllInterval.add(i);
            }
        }
        /***
         * Метод який витягує з списку парні числа
         */
        public void Parni(){
            System.out.print("Parni");
            for(int e: AllInterval  ){
                if(e%2==0){
                    ParniElements.add(e);
                }
            }
        }
        /***
         * Метод який витягує з списку непарні числа
         */
        public void Neparni() {
            System.out.print("NEParni ");
            for (int e : AllInterval) {
                if (e % 2 != 0) {
                    NeparniElements.add(e);
                }
            }
        }
        /***
         * Метод,який шукає суму парних
         */
        public void sumparni(){
            int sum = 0;
            for(int i = 0; i<ParniElements.size(); i++){
                sum +=ParniElements.get(i);
            }
            System.out.println("Sum parni: " + sum);
        }
        /***
         * Метод,який шукає суму непарних
         */
        public void sumneparni(){
            int sum=0;
            for(int e : NeparniElements) {
                sum += e;

            }
            System.out.println("Sum neparni: " + sum);
        }
        /***
         * Метод в якому користувач вводить довжину з клавіатури
         */
        public int lengthfib(Scanner lenfib){
            System.out.println("Enter length ");
            int length = lenfib.nextInt();
            return length;

        }

        /***
         * Метод,що виводить відсоток парних і непарних чисел ряду фібоначчі
         *  percent відсоток парних і непарних чисел
         */
        public void fibper(ArrayList<Integer>percent){
            double neparni = 0;
            double parni = 0;
            for (int e : percent ) {
                if (e % 2 != 0) {
                    neparni++;
                }
                else {
                    parni++;
                }
            }
            System.out.println("Neparni: "+neparni/percent.size()*100+"%");
            System.out.println("Parni: "+parni/percent.size()*100+"%");

        }

    }
    ////////////////////////////////////////////////////////
//fib
    class Fibonachi{
        /**Поле Фібоначчі**/
        ArrayList<Integer> fibonachi = new ArrayList<Integer>();

        /***
         * Конструктор з двома параметрами
         * Два перші числа ряду фібоначчі
         *  number1 перше число
         *  number2 друге число
         */
        Fibonachi(int number1, int number2 ){
            this.fibonachi.add(number1);
            this.fibonachi.add(number2);
        }

        /***
         * Метод в якому ми генеруємо ряд фібоначчі і записуємо туди два перші числа
         */
        public void CreatNumber(int length){
            for(int i=0; i<length; i++){
                this.fibonachi.add(this.fibonachi.get(this.fibonachi.size()-1)+this.fibonachi.get(this.fibonachi.size()-2));
            }
        }

        /***
         * Метод,який виводить ряд згенерований ряд фібоначчі
         * return повертає ряд фібоначчі
         */
        public ArrayList<Integer> resultfibonachi() {
            ArrayList<Integer> result = new ArrayList(this.fibonachi);
            System.out.println(result);
            return result;
        }

    }






