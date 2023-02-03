public class Main {
    public static void main(String[] args) {
        printLeapYear(2039);
        getAppLink(2022,1);
        int deliveryDays = getDeliveryDays(44);
        if (deliveryDays < 0) {
            System.out.println("Доставка не осуществляется.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }

    }

       public static void printLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год - вискосный год.");
        }else {
            System.out.println(year + " год -  не високосный год.");
        }
        }

        public static void getAppLink (int manufactureYear, int os) {
            System.out.printf(
                    "Установите %s версию приложения для %s по ссылке%n",
                    getAppVariant(manufactureYear), getOsString(os)
            );
        }

        public static String getOsString(int os) {
        if (os == 0) {
            return "iOs";
        } else {
            return "Android";
        }
        }

        public static String getAppVariant(int year) {
        if (year > 2015) {
            return "полную";
        } else {
            return "облегченную";
        }
    }

    public static int getDeliveryDays(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance < 100) {
            return 3;
        }

        return -1;
    }
}