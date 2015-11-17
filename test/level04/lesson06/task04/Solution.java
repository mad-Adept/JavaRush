package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        String v = reader.readLine();
        if (c.equals(v)) System.out.println("Имена идентичны");
        else if (c.length() == v.length()) System.out.println("Длины имен равны");
    }
}
