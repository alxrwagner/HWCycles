import java.sql.SQLOutput;

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
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    public static void task1(){
        for(int count = 1; count <= 10; count++){
            System.out.println(count);
        }
    }

    public static void task2(){
        for(int count = 10; count >= 1; count--){
            System.out.println(count);
        }
    }

    public static void task3(){
        for(int count = 0; count <= 17; count++){
            if(count % 2 == 0){
                System.out.println(count);
            }
        }
    }

    public static void task4(){
        for(int count = 10; count >= -10; count--){
            System.out.println(count);
        }
    }

    public static void task5(){
        for (int year = 1904; year <= 2096; year++){
            if ((year % 4 == 0) && year % 100 != 0)
            {
                System.out.println(year + " год является високосным.");
            }
            else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
            {
                System.out.println(year + " год является високосным.");
            }
        }
    }

    public static void task6(){
        for (int count = 7; count <= 98; count +=7){
            System.out.println(count);
        }
    }

    public static void task7(){
        for (int count = 1; count <= 512; count += count){
            System.out.println(count);
        }
    }

    public static void task8(){
        float salary = 29000f;
        float total = 0;
        for (int count = 0; count < 12; count++){
            total += salary;
            System.out.println("Месяц " + (count+1) + " сумма накоплений равна: " + total + " рублей");
        }
    }

    public static void task9(){
        float salary = 29000f;
        float total = 0;
        for (int count = 0; count < 12; count++){
            total += total / 100;
            total += salary;
            System.out.println("Месяц " + (count + 1) + " сумма накоплений равна: " + total + " рублей");
        }
    }

    public static void task10(){
        int number = 0;
        int number1 = 1;
        int number2 = 1;

        System.out.println(number1);
        System.out.println(number2);
        for (int count = 2; count < 11; count++){
            number = number1 + number2;
            System.out.println(number);
            number1 = number2;
            number2 = number;
        }
    }

    public static void task11(){
        int monthCounter = 0;
        float accumulationPerMonth = 15000;
        float accumulatedAmount = 0;
        float total = 2459000;

        while (accumulatedAmount < total){
            accumulatedAmount += accumulationPerMonth;
            accumulatedAmount += accumulatedAmount/100;
            monthCounter++;

            System.out.println("Месяц " + monthCounter + ", сумма накоплений равна: " + accumulatedAmount);
        }
    }

    public static void task12(){
        int count = 1;

        while (count <= 10){
            System.out.print(count + " ");
            count++;
        }

        System.out.println();

        for(int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }
    }

    public static void task13(){
        int population = 12000000;
        int birthRate = 17;
        int birthRateInYear = 0;
        int mortalityRate = 8;
        int mortalityRateInYear = 0;

        for(int year = 1; year <= 10; year++){
            birthRateInYear = population / 1000 * birthRate;
            mortalityRateInYear = population / 1000 * mortalityRate;
            population = population + birthRateInYear - mortalityRateInYear;
            System.out.println("Год: " + year + " Популяция составляет: " + population);
        }
    }

    public static void task14(){
        float totalAccumulatedAmount = 15000f;
        float desiredAmount = 12000000f;
        float interestOnAccumulatedAmount = 7f;

        int monthCounter = 0;

        while(totalAccumulatedAmount < desiredAmount){
            totalAccumulatedAmount += totalAccumulatedAmount / 100 * interestOnAccumulatedAmount;
            monthCounter++;

            System.out.println("Месяц: " + monthCounter + " накопленная сумма: " + totalAccumulatedAmount);
        }
    }

    public static void task15(){
        float accumulatAmount = 15000f;
        float totalAccumulatedAmount = 0f;
        float desiredAmount = 12000000f;
        float interestOnAccumulatedAmount = 7f;

        int monthCounter = 0;

        while(totalAccumulatedAmount < desiredAmount){
            totalAccumulatedAmount += totalAccumulatedAmount / 100 * interestOnAccumulatedAmount;
            totalAccumulatedAmount += accumulatAmount;
            monthCounter++;

            if (monthCounter % 6 == 0){
                System.out.println("Месяц: " + monthCounter + " накопленная сумма: " + totalAccumulatedAmount);
            }

        }
    }

    public static void task16(){
        int yearsForAccumulated = 9;
        int monthsPerYear = 12;
        int monthsForAccumulated = yearsForAccumulated * monthsPerYear;
        int periodGetInformationInMonth = 6;
        int monthsCounter = 0;

        float interestOnAccumulatedAmount = 7f;
        float totalAccumulatedAmount = 0f;
        float accumulateAmount = 15000f;

        while(monthsCounter < monthsForAccumulated){
            totalAccumulatedAmount += totalAccumulatedAmount / 100 * interestOnAccumulatedAmount;
            totalAccumulatedAmount += accumulateAmount;
            monthsCounter++;

            if(monthsCounter % periodGetInformationInMonth == 0){
                System.out.println("Сумма накоплений за " + monthsCounter + " месяцев" + " составляет: " + totalAccumulatedAmount);
            }
        }
    }

    public static void task17(){
        int firstFriday = 3;
        int daysPerMonth = 31;
        int daysCounter = firstFriday;

        do{
            System.out.println("Сегодня пятница, " + daysCounter + "-е число. Необходимо подготовить отчет");
            daysCounter += 7;
        }
        while (daysCounter <= daysPerMonth);
    }

    public static void task18(){
        int currentYear = 2022;
        int periodAfterInYear = 100;
        int periodBeforeInYear = 200;
        int calculationYearBefore = currentYear - periodBeforeInYear;
        int calculationYearAfter = currentYear + periodAfterInYear;
        int counterYear = 0;
        int periodOfFlyComet = 79;

        while (counterYear <= calculationYearAfter){
            counterYear += periodOfFlyComet;

            if(counterYear >= calculationYearBefore && counterYear <= calculationYearAfter){
                System.out.println(counterYear);
            }
        }
    }
}