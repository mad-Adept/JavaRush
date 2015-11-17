package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        ArrayList<Integer> masint = new ArrayList<Integer>();
        ArrayList<String> masString = new ArrayList<String>();

        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i])) masint.add(Integer.parseInt(array[i]));
            else masString.add(array[i]);
        }
        int k;
        for (int i = 0; i < masint.size(); i++){
            for (int j = 0; j < masint.size()- i - 1; j++){
                if(masint.get(j) < masint.get(j + 1)){
                  k = masint.get(j);
                  masint.set(j, masint.get(j + 1));
                  masint.set(j + 1, k);
                }
            }
        }
        String x;
        for (int i = 0; i < masString.size(); i++){
          for (int j = 0; j < masString.size() - i - 1; j++){
              if (isGreaterThan(masString.get(j), masString.get(j + 1))){
                  x = masString.get(j);
                  masString.set(j, masString.get(j + 1));
                  masString.set(j + 1, x);
              }
          }
        }
        int j = 0;
        int l;
        int p = 0;
        for (int i = 0; i < array.length; i++){
            if (isNumber(array[i])){
                l = masint.get(j);
                array[i] = Integer.toString(l);
                j++;
            }
            else {
                array[i] = masString.get(p);
                p++;
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
