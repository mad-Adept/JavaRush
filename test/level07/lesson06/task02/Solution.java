package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        // ArrayList<String> mini = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        String max = "";
        String s;

        for(int i = 0; i < list.size(); i++)
        {
            s = list.get(i);
            if (s.length() > max.length()) max = s;
        }
        //System.out.println(max);

        for (int i = 0; i < list.size(); i++)
        {
            s = list.get(i);
            if (s.length() == max.length()) System.out.println(s);
        }

        //for (int i = 0; i < mini.size(); i++)System.out.println(mini.get(i)); //напишите тут ваш код

    }
}

