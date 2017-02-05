import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        System.out.println("Введите сумму зарплаты: ");
        Scanner in = new Scanner(System.in); // Объект класса Scanner для обработки ввода с клавиатуры.
        double  o = in.nextInt();
        System.out.println("Введите выслугу лет: ");
        double  p = in.nextInt();
        double s = 0;

        if (p > 100) { // 1-ый способ
            System.out.println("Не верно введен стаж, попробуйте ещё раз. ");
        } else {
            if (0 > p) {
                System.out.println("Не верно введен стаж, попробуйте ещё раз. ");
            } else {
                s = 0 <= p && p < 5 ? o * 0.1 : s;
                s = 5 <= p && p < 10 ? o * 0.15 : s;
                s = 10 <= p && p < 15? o * 0.25 : s;
                s = 15 <= p && p < 20? o * 0.35 : s;
                s = 20 <= p && p < 25? o * 0.45 : s;
                s = 25 <= p && p <= 100? o * 0.5 : s;
                System.out.println("Сумма премии = " + (s) + "$");
                System.out.println("Общая сумма зарплаты = " + (s + o) + "$");
            }
        }


//        if (p > 100) { // 2-ой способ
//            System.out.println("Не верно введен стаж, попробуйте ещё раз. ");
//        } else {
//            if (0 > p) {
//                System.out.println("Не верно введен стаж, попробуйте ещё раз. ");
//            } else {
//                s =(0<=p&&p<5)?o*0.1:((5<=p&&p<10)?o*0.15:(((10<=p&&p<15)?o*0.25:((15<=p&&p<20)?o*0.35:(20<=p&&p<25)?o*0.45:o*0.5))));
//                System.out.println("Сумма премии = " + (s) + "$");
//                System.out.println("Общая сумма зарплаты = " + (s + o) + "$");
//            }
//        }

    }
}
