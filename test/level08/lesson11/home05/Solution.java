package com.javarush.test.level08.lesson11.home05;

import javax.xml.soap.SAAJResult;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/
/*
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] chars = new char[s.length()];
        String[] arrays = s.split(" ");
        for (String c : arrays){
        chars = c.toCharArray();
            int n = c.codePointAt(0);
        for (int i = 0; i < chars.length; i++){
           if (chars[0] = c.codePointAt(0));
        }
    }
            }

        }*/

