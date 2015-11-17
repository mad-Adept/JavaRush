package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.Collections;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String> list1 = new ArrayList();
        Collections.addAll(list1, "cascasc", "cascefwe");
        ArrayList<String> list2 = new ArrayList();
        Collections.addAll(list2, "cascasc", "cascefwe", "cascascascrh");
        ArrayList<String> list3 = new ArrayList();
        Collections.addAll(list3, "cascasc", "cascefwe", "cascascascrh", "vwweqwq");
        ArrayList<String> list4 = new ArrayList();
        Collections.addAll(list4, "cascasc", "cascefwe", "cascascascrh", "qweqeqwr", " tuo");
        ArrayList<String> list5 = new ArrayList();
        Collections.addAll(list5, "cascasc", "cascefwe", "cascascascrh", "cqw");
        ArrayList<String>[] list = new ArrayList[5];
        list[0] = list1;
        list[1] = list2;
        list[2] = list3;
        list[3] = list4;
        list[4] = list5;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}