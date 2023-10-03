public class Main {
    public static void main(String[] args) {
        //Задача№1
        int year = 2023;
        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        //Задача№2
        int system = 1;
        checkPhone(system, year);
        //Задача№3
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        if (deliveryDays != -1) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка невозможна");
        }
    }
    public static boolean isLeapYear (int year) {
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
    public static int calculateDeliveryDays (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

}