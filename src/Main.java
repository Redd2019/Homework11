public class Main {
    public static void main(String[] args) {
        printLeapYear(2039);
        task2();

    }

       public static void printLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год - вискосный год.");
        }else {
            System.out.println(year + " год -  не високосный год.");
        }
        }

        public static void task2() {
            System.out.println("Задача 2");
            int clientOs = 0;
            int clientDeviceYear = 2015;
            if (clientDeviceYear <= 2015) {
                if (clientOs == 1) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            } else if (clientDeviceYear > 2015) {
                if (clientOs == 1){
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                if (clientOs==0){
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            }
        }
    }