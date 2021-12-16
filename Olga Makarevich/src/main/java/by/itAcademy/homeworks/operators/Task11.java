package by.itAcademy.homeworks.operators;

// Написать метод, который выводит расписание на неделю.
// Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.

import java.util.Scanner;
//public class Task11 {
//        private String Mon = "Mon - Gym";
//        private String Tue = "Tue - Swimmingpool";
//        private String Wed = "Wed - Tennis";
//        private String Thu = "Thu - Basketball";
//        private String Fri = "Fri - Soccer";
//        private String Sat = "Sat - Chess";
//        private String Sun = "Sun - Relax";
//
//        public void setDay (String dayOfWeek) {
//
//        }
//
//        public static void main(String[] args) {
//                System.out.println(Mon);
//                System.out.println(Tue);
//                System.out.println(Wed);
//                System.out.println(Thu);
//                System.out.println(Fri);
//                System.out.println(Sat);
//                System.out.println(Sun);
//                Scanner timeTable = new Scanner(System.in);
//                System.out.println("Введите порядковый номер дня недели");
//                int numbDay = timeTable.nextInt();
//                if (numbDay == 1) {
//                        System.out.println(Mon);
//                } else if (numbDay == 2) {
//                        System.out.println(Tue);
//                } else if (numbDay == 3) {
//                        System.out.println(Wed);
//                } else if (numbDay == 4) {
//                        System.out.println(Thu);
//                } else if (numbDay == 5) {
//                        System.out.println(Fri);
//                } else if (numbDay == 6) {
//                        System.out.println(Sat);
//                } else if (numbDay == 7) {
//                        System.out.println(Sun);
//                } else {
//                        System.out.println("Нет такого дня недели!");
//                }
//        }
//}

// Second try
public class Task11 {
        public static void main(String[] args) {
                int numberOfDay = (int) (Math.random()*7+1);
                System.out.println(numberOfDay);
                System.out.println(plansForDay(numberOfDay));
        }

        static String plansForDay (int a) {
                String plans = null;
                switch (a) {
                        case 1:
                                plans = "Mon - Gym";
                                break;
                        case 2:
                                plans = "Tue - Swimmingpool";
                                break;
                        case 3:
                                plans = "Wed - Tennis";
                                break;
                        case 4:
                                plans = "Thu - Basketball";
                                break;
                        case 5:
                                plans = "Fri - Soccer";
                                break;
                        case 6:
                                plans = "Sat - Chess";
                                break;
                        case 7:
                                plans = "Sun - Relax";
                                break;
                }
                return plans;
        }
}