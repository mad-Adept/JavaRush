package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(reader2.readLine());
        String x = reader2.readLine();
        System.out.println(x + " захватит мир через " + y + " лет. Му-ха-ха!");
    }
}