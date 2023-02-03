public class Main {
    public static void main(String[] args) {
        printLeapYear(2039);
        getAppLink(2022,1);

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




        }