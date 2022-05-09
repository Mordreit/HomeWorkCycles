public class Main {
    public static void main(String[] args) {

        // Задание 1
        int i = 1;
        while (i <11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int e = 10; e >= 1; e--) {
            System.out.print(e + " ");
        }
        System.out.println();

        // Задание 2

        for (int friday = 5; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + ". Необходимо подготовить отчет.");
        }

        // Задание 3

        int year = 2021;
        int a = year - 200;
        int b = year + 100;
        for (; a < b; a++) {
            if (a % 79 == 0) {
                System.out.println(a);
            }
        }




    }
}