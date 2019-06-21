package com.example;

public class Main {

    public static void main(String[] args) {
        getDaysInMonth(2, 1990);
        getDaysInMonth(9, 2000);
        getDaysInMonth(13, 1988);
        getDaysInMonth(2, 1956);
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        if(year % 4 == 0){
            if(year % 100 != 0){
                return true;
            }
            if(year % 400 == 0){
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        boolean leapYear = isLeapYear(year);

        switch(month){
            case 1:
                return 31;

            case 2:
                if(leapYear){
                    return 29;
                }
                return 28;

            case 3:
                return 31;

            case 4:
                return 30;

            case 5:
                return 31;

            case 6:
                return 30;

            case 7:
                return 31;

            case 8:
                return 31;

            case 9:
                return 30;

            case 10:
                return 31;

            case 11:
                return 30;

            case 12:
                return 31;

            default:
                return -1;
        }

    }
}
