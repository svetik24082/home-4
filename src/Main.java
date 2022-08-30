public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.printf("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            System.out.printf("Установите версию приложения для iOS по ссылке");
        }

        System.out.println(" Задание 2");

        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.printf(" Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println(" Вы можете установить приложение");
        }

        System.out.println(" Задание 3 ");
        int jear = 2022;
        if (jear % 4 == 0 && jear % 100 != 0 || jear % 400 == 0) {
            System.out.println(jear + " является високосным ");
        } else {
            System.out.println(jear + " Не является високосным");
        }
        System.out.println(" задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            deliveryDays++;
        }
        System.out.println(" Потребуется дней " + deliveryDays);







        System.out.println(" задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1 :
                System.out.println(" Зима");
                break;
            case 2:
                System.out.println(" Зима");
            case 3 :
                System.out.println(" Весна");
                break;
            case 4 :
                System.out.println(" Весна");
                break;
            case 5 :
                System.out.println(" Весна");
                break;
            case 6 :
                System.out.println(" Лето");
                break;
            case 7 :
                System.out.println(" Лето");
                break;
            case 8 :
                System.out.println(" Лето");
                break;
            case 9 :
                System.out.println(" Осень");
                break;
            case 10 :
                System.out.println(" Осень");
                break;
            case 11 :
                System.out.println(" Осень");
                break;
            case 12 :
                System.out.println(" Зима");
                break;
            default:
                System.out.println(" Такого месяца не существует");


        }


    }

        }







