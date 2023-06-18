public class Main {
    public static void main(String[] args) {
        // task1
        System.out.println("task1");

        int currentMoney = 0;
        int moneyPerMonth = 15000;
        int totalMoney = 2_459_000;

        int monthCount = 0;
        while (currentMoney <= totalMoney) {
            currentMoney += moneyPerMonth;
            System.out.println("месяц" + monthCount + ", СУММА накоплений =" + currentMoney);

            ++monthCount;
        }


        // task2
        System.out.println("task2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");

        }


        // task3
        System.out.println("task3");
        int population = 12_000_000;
        int birth = 17;
        int dead = 8;
        int yearCount = 10;

        int year = 0;
        while (year < yearCount) {
            population += (population / 1000) * (birth - dead);
            year++;
            System.out.println("Год" + year + " численность населения составляет " + population);

        }
        // task4
        System.out.println("task4");
        int goal = 12_000_000;
        int sum = 15_000;
        int monthPercent = 7;

        int monthCoun = 1;

        while (sum <= goal) {
            System.out.println("Месяц" + monthCoun + " сумма накоплений равна " + sum + "рублей ");
            sum += sum * monthPercent / 100;
            monthCoun++;


            System.out.println("Итоговая сумма: " + sum + ". Потребовалось месяцев :" + monthCoun);
            System.out.println(" ");
        }
        // task5
        System.out.println("task5");

        int goaly = 12_000_000;
        int sumy = 15_000;
        int monthPercentd = 7;

        int monthCounk = 0;

        while (sumy <= goaly) {
            sumy += sumy * monthPercent / 100;
            monthCounk++;
            if (monthCounk % 6 == 0) {
                System.out.println("Месяц" + monthCounk + " сумма накоплений равна " + sumy + "рублей ");
            }
        }
        System.out.println("Итоговая сумма: " + sumy + ". Потребовалось месяцев :" + monthCounk);
        {
        }

        // task6
        System.out.println("task6");
        double sume = 15_000;
        int monthPercentm = 7;
        int yearCounts = 9;

        int monthCountt = 0;
        while (monthCountt < yearCounts * 12) {
            sume += sume * monthPercentm / 100;
            monthCountt++;
            if (monthCountt % 6 == 0) {
                System.out.println("Месяц" + monthCountt + " сумма накоплений равна " + sume + "рублей ");

            }
            System.out.println("Итоговая сумма: " + sume + ". Потребовалось месяцев :" + monthCountt);
        }

        // task7
        System.out.println("task7");
        int fridayCount = 1;
        int dayInMonth = 31;

        while (fridayCount<=dayInMonth){
            System.out.println("Сегодня пятница " + fridayCount + "число. Необходимо подготовить отчет " + fridayCount);
            fridayCount+=7;

        }

        // task8
        System.out.println("task8");
        int currentYear = 2023;
        int yearsBefore = 200;
        int yearsAfter = 100;

        for (int j = 0; j < currentYear + yearsAfter; j+= 79) {
            if (j> currentYear-yearsBefore){
                System.out.println(j);
            }

        }

        }
    }