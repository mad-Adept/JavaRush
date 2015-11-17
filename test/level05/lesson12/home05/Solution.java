package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int x;
        int c = 0;
        String z;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i > 0; i++){
            z = reader.readLine();
            if (z.equals("сумма")){
                System.out.println(c);
                break;
            }
            x = Integer.parseInt(z);
            c = c + x;

        }
    }
}
