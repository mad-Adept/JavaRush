package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i = 0; i < alphabet.size(); i++)
        {
            count.put(alphabet.get(i), 0);
        }
        char[] c;
        for (String s : list)
        {
            c = s.toCharArray();
            for (int i = 0; i < c.length; i++)
            {
                for (int j = 0; j < alphabet.size(); j++)
                {
                    if (alphabet.get(j).equals(c[i]))
                    {
                        count.put(alphabet.get(j), count.get(alphabet.get(j)) + 1);
                    }
                }
            }
        }
        for (int i = 0; i < alphabet.size(); i++)
        {
            for (Map.Entry<Character, Integer> p : count.entrySet())
            {
                if (alphabet.get(i).equals(p.getKey())){
                    System.out.println(p.getKey() + " " + p.getValue());
                }
            }
        }
    }

}
