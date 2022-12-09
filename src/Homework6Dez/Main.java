package Homework6Dez;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {

        System.out.println("\nЗадача_1");

        int clientOS = 20;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Выберите вашу версию приложения");
        }
    }


    public static void task2() {

        System.out.println("\nЗадача_2");

        int clientOS = 0;
        int clientDeviceYear = 2010;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOS == 1) {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }
    }



    public static void task3() {

        System.out.println("\nЗадача_3");

        int year=2020;

        if (year % 4 ==0 && year % 100!= 0 || year % 400==0) {
            System.out.println(year+ " год является высокосным");
        } else  {
            System.out.println(year+ " год не является высокосным");
        }

    }

    public static void task4() {

        System.out.println("\nЗадача_4");

        int deliveryDistance = 130;
        if (deliveryDistance <20) {
                System.out.println("На доставку "+ deliveryDistance + " км потребуются 1 сутки");
        } else if (deliveryDistance >20 && deliveryDistance <60){
            System.out.println("На доставку "+ deliveryDistance + " км потребуются 2 суток");
        } else if (deliveryDistance >60 && deliveryDistance <100){
            System.out.println("На доставку "+ deliveryDistance + " км потребуются 3 суток");
        } else
            System.out.println("Нет доставки");




    }

    public static void task5() {

        System.out.println("\nЗадача_5");

        int monthNumber = 15;

        switch (monthNumber) {
            case 1:
                System.out.println("Зима.Январь");
                break;
            case 2:
                System.out.println("Зима.Февраль");
                break;
            case 3:
                System.out.println("Весна.Март");
                break;
            case 4:
                System.out.println("Весна.Апрель");
                break;
            case 5:
                System.out.println("Весна.Май");
                break;
            case 6:
                System.out.println("Лето.Июнь");
                break;
            case 7:
                System.out.println("Лето.Июль");
                break;
            case 8:
                System.out.println("Лето.Август");
                break;
            case 9:
                System.out.println("Осень.Сентябрь");
                break;
            case 10:
                System.out.println("Осень.Октябрь");
                break;
            case 11:
                System.out.println("Осень.Ноябрь");
                break;
            case 12:
                System.out.println("Зима.Декабрь");
                break;

            default:
                System.out.println("Такого месяца не существует");

        }

    }

}

    
