public class Main {
    public static void main(String[] args) {
        // Задание №1.
        int nachKap = 0;
        int mes = 0;
        while (nachKap < 2459000) {
            nachKap = nachKap + 15000 + nachKap/100;
            mes = mes + 1;
            System.out.println("Месяц " + mes + ", сумма накоплений равна " + nachKap + " рублей");
        }

        // Задание №2.
        int num = 1;
        while (num < 11) {
            System.out.print(num + " ");
            num+=1;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание №3.
        int nas = 12000000;
        int smert = 8;
        int roz = 17;
        for (int i = 1; i < 11; i++) {
            nas = nas + (nas / 1000) * (roz - smert);
            System.out.println("Год " + i + ", численность населения составляет " + nas);
        }

        // Задание №4.
        long vkl = 15000L;
        int c = 0;
        while (vkl < 12000000) {
            vkl = vkl * 107 / 100;
            c += 1;
            System.out.println("Месяц " + c + ", сумма вклада равна " + vkl + " рублей");
        }

        // Задание №5.
        vkl = 15000;
        c = 0;
        while (vkl < 12000000) {
            vkl = vkl * 107 / 100;
            c += 1;
            if (c % 6 == 0) {
                System.out.println("Месяц " + c + ", сумма вклада равна " + vkl + " рублей");
            }
        }

        // Задание №6.
        vkl = 15000;
        c = 0;
        while (c <= 12*9) {
            vkl = vkl * 107 / 100;
            c += 1;
            if (c % 6 == 0) {
                System.out.println("Месяц " + c + ", сумма вклада равна " + vkl + " рублей");
            }
        }

        //Задание №7.
        int friday = 4;
        for (int i = 1; i < 32; i++) {
            if ((i - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }

        // Задание №8.
        int year = 2024;
        int yearDo = year - 200;
        int yearPosle = year + 100;
        while (yearDo <= yearPosle) {
            if (yearDo % 79 == 0) {
                System.out.println(yearDo);
            }
            yearDo++;
        }
    }
}