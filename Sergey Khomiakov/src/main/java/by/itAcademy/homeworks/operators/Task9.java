package by.itAcademy.homeworks.operators;
/*
> Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату
> следующего дня.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Task9 {

    static boolean  leapYear;
    static int dayX,  monthX, yearX;

    public static void main(String[] args)  {

        System.out.println("Input your Date in according to next rule: dd mm yyyy");

        try { BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            dayX = Integer.parseInt(reader.readLine());
            monthX = Integer.parseInt(reader.readLine());
            yearX = Integer.parseInt(reader.readLine());
            System.out.println("Your Date is " + dayX + " " + monthX + " " + yearX);
        } catch (Exception ex){
            System.out.println("You input incorrect Date");

        }



        leapYear=isLeapYear(yearX);
        getDate(dayX,  monthX, yearX);

    }

    private static void getDate(int day, int month, int year){


                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10){

                    if(day>0 && day<=30){
                        day++;
                        System.out.println("Next day is... " + day + " " + month + " " + year);
                    } else if (day==31) {
                        day = 1;
                        month++;
                        System.out.println();
                        System.out.println(day + " " + month + " " + year);
                    } else {
                        System.out.println("Please, use Date in according to Gregorian Calendar");
                    }

                } else if(month == 2 ){
                    if(day>0 && day <= 27 ){
                        day++;
                        System.out.println("Next day is... " + day + " " + month + " " + year);
                    } else if (day==28 &&leapYear) {
                        day++;
                        System.out.println("Next day is... " + day + " " + month + " " + year);
                    } else if (day==28 ) {
                        day=1;
                        month++;
                        System.out.println("Next day is... " + day + " " + month + " " + year);
                    }
                    else if(day==29 && leapYear){
                        day = 1;
                        month++;
                        System.out.println("Next day is... " + day + " " + month + " " + year);
                    } else {
                        System.out.println("Please, use Date in according to Gregorian Calendar");
                    }

                } else if(month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day>0 && day <= 29) {
                        day++;
                        System.out.println("Next day is... " + day + " " + month + " " + year);
                    } else if (day == 30) {
                        day = 1;
                        month++;
                        System.out.println("Next day is... " + day + " " + month + " " + year);
                    } else {
                        System.out.println("Please, use Date in according to Gregorian Calendar");
                    }
                } else if(month == 12){
                    if (day>0 && day <= 30) {
                        day++;
                        System.out.println("Next day is... " + day + " " + month + " " + year);
                    } else if (day == 31) {
                        day = 1;
                        month = 1;
                        year++;
                        System.out.println("Next day is... " + day + " " + month + " " + year);
                }

            }else{  System.out.println("Please, use Date in according to Gregorian Calendar");

            }

    }

        private static boolean isLeapYear(int yearCh){
            if(yearCh%400==0){
                return true;}

                else if (yearCh%100==0){
                    return false;
                }
                else if (yearCh%4==0){
                return true;
                }
                else{
                    return  false;
            }
        }
    }