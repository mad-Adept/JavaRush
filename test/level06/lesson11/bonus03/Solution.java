package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Integer> mas = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++)
        {
            mas.add(Integer.parseInt(reader.readLine()));
        }

        for (int  i = 0; i < mas.size(); i++){
            for (int j = 0; j < mas.size() - 1; j ++){
                if(mas.get(j) > mas.get(j +1)){
                        mas.set(j, mas.get(j) + mas.get(j + 1));
                        mas.set(j + 1, mas.get(j) - mas.get(j + 1));
                        mas.set(j, mas.get(j) - mas.get(j + 1));
                }
            }
        }

        for (int i = 0; i < mas.size(); i++){
            System.out.println(mas.get(i));
        }

/*
        for (int i = 0; i < mas.size(); i ++){
            for (int j = 0; j < i; j ++){
                if (mas.get(j) > mas.get(j + 1)){
                   mas.set(mas.get(j), mas.get(j) + mas.get(j + 1));
                    mas.set(mas.get(j + 1), mas.get(j) - mas.get(j + 1));
                    mas.set(mas.get(j), mas.get(j) - mas.get(j + 1));

                    mas[j] = mas[j] + mas[j+1];
                    mas[j+1] = mas[j] - mas[j+1];
                    mas[j] = mas[j] - mas[j+1];
                }
                }
            }
        }
        */
    }
}
