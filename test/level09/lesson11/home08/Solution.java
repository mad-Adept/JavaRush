package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] q = {25, 47, 1, 369, 54};
        int[] r = {25, 47};
        int[] e = {25, 47, 1, 369};
        int[] w = {25, 47, 1, 369, 54, 4, 7};
        int[] t = {};
        Collections.addAll(list, q, r, e, w, t);
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
