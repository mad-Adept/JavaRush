package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        String date = "JANUARY 8 2015";
        System.out.println(isDateOdd(date));
    }

    public static boolean isDateOdd(String date)
    {
        Date newdata = new Date(115, 0, 1);
        Date data = new Date(date);
        long t = data.getTime() - newdata.getTime();
        int day = (int) (t / (24 * 60 * 60 * 1000)) + 1;
        if (day % 2 == 0) return false;
        else return true;
    }
}
