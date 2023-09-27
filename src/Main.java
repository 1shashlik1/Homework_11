public class Main {
    public static void main(String[] args) {
        //Задача№1
        int year = 2023;
        if (leapYearChecker(year)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        //Задача№2
        int system = 1;
        checkPhone(system, year);
        //Задача№3
        int deliveryDistance = 95;
        delivery(deliveryDistance);
    }
    public static boolean leapYearChecker (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void checkPhone (int system, int year) {
        int thresholdYear = 2015;
        if (year > thresholdYear) {
            System.out.print("Скачать для: ");
        } else {
            System.out.print("Скачать облегчённую версию для: ");
        }
        if (system == 0) {
            System.out.println("IOS.");
        } else {
            System.out.println("Android.");
        }
    }
    public static void delivery (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней для доставки: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней для доставки: 2");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней для доставки: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

}