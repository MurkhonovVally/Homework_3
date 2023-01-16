public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
        //Задача 1
    public static void task1() {
        System.out.println("Задача 1");
        int first = 100;
        byte second = 10;
        short third = 50;
        long fourth = 1000L;
        float fifth = 4.55f;
        double sixth = 5.75f;
        System.out.println("Значение переменной first с типом int равно " + first);
        System.out.println("Значение переменной second с типом byte равно " + second);
        System.out.println("Значение переменной third с типом short равно " + third);
        System.out.println("Значение переменной fourth с типом long равно " + fourth);
        System.out.println("Значение переменной fifth с типом float равно " + fifth);
        System.out.println("Значение переменной sixth с типом double равно " + sixth);
    }
        //Задача 2
        public static void task2() {
            float one = (float)27.12;
            long two = 987678965549L;
            float three = (float)2.786;
            long four = 569;
            long five = -159;
            long six = 27897;
            long seven = 67;
        }

        //Задача 3
        public static void task3() {
            System.out.println("Задача 3");
            int lp = 23;
            int as = 27;
            int ea = 30;
            int paper = 480;
            int sheet = paper / (lp + as + ea);
            System.out.println("На каждого ученика рассчитано " + sheet + " листов бумаги");
        }

        //Задача 4
        //Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
        public static void task4() {
            System.out.println("Задача 4");
            int productivity = 16;
            int oneMin = productivity / 2; //За 1 минуту
            int twentyMin = oneMin * 20;   //За 20 минут
            int day = oneMin * 60 * 24;    //За сутки
            int threeDays = day * 3;       //За 3 дня
            int month = day * 30;          //За месяц
            System.out.println("За 20 минут машина произвела " + twentyMin + " штук бутылок");
            System.out.println("За сутки машина произвела " + day + " штук бутылок");
            System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
            System.out.println("За 1 месяц машина произвела " + month + " штук бутылок");
        }

        //Задача 5
        /*На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        На один класс уходит 2 банки белой и 4 банки коричневой краски.
        Сколько банок каждой краски было куплено?
         */
        public static void task5() {
            System.out.println("Задача 5");
            int totalPaint = 120;
            int whitePaint = 2;
            int brownPaint = 4;
            int office = totalPaint / (whitePaint + brownPaint);
            int totalWhite = office * whitePaint;
            int totalBrown = office * brownPaint;
            System.out.println("В школе, где " + office + " классов, нужно " + totalWhite + " банок белой краски и "
                    + totalBrown + " банок коричневой краски");
        }


        //Задача 6
        public static void task6() {
            System.out.println("Задача 6");
            int oneBanana = 80;
            int banana = oneBanana * 5;
            int oneMilk = 105;
            int milk = oneMilk * 2;
            int oneIce = 100;
            int iceCream = oneIce * 2;
            int oneEgg = 70;
            int eggs = oneEgg * 4;
            int coctail = banana + milk + iceCream + eggs;
            int kg = coctail / 1000;
            System.out.println(coctail);
            System.out.println(kg);
        }

        //Задача 7
        public static void task7() {
            System.out.println("Задача 7");
            int totalKg = 7;
            int totalGram = totalKg * 1000;
            int firstExample = 250;
            int secondExample = 500;
            int firstResult = totalGram / firstExample;
            int secondResult = totalGram / secondExample;
            int averageResult = (firstResult + secondResult) / 2;
            System.out.println(firstResult);
            System.out.println(secondResult);
            System.out.println(averageResult);
        }

        //Задача 8
        public static void task8() {
            System.out.println("Задача 8");
            int mari = 67760;
            int den = 83690;
            int kris = 76230;
            int increaseMary = (mari / 10) + mari;
            int increaseDen = (den / 10) + den;
            int increaseKris = (kris / 10) + kris;
            int yearSalaryMary = mari * 12;
            int yearSalaryDen = den * 12;
            int yearSlaryKris = kris * 12;
            int yearIncreaseMary = increaseMary * 12;
            int yearIncreaseDen = increaseDen * 12;
            int yearIncreaseKris = increaseKris * 12;
            int diffMary = yearIncreaseMary - yearSalaryMary;
            int diffDen = yearIncreaseDen - yearSalaryDen;
            int diffKris = yearIncreaseKris - yearSlaryKris;
            System.out.println("Маша теперь получает " + increaseMary + " рублей. Годовой доход вырос на " + diffMary + " рублей");
            System.out.println("Денис теперь получает " + increaseDen + " рублей. Годовой доход вырос на " + diffDen + " рублей");
            System.out.println("Кристина теперь получает " + increaseKris + " рублей. Годовой доход вырос на " + diffKris + " рублей");
            //Можно было бы и проще, но я захотел больше печатать.}
            
        }
}