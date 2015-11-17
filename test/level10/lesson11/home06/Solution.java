 package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        boolean sex;
        String color;
        int lengtch;
        boolean home;

        Human(String name){
            this.name = name;
        }
        Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }
        Human(String name, boolean sex, boolean home){
            this.name = name;
            this.sex = sex;
            this.home = home;
        }
        Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        Human(String name, int age, int lengtch){
            this.name = name;
            this.age = age;
            this.lengtch = lengtch;
        }
        Human(String name, int age, boolean sex, String color, int lengtch){
            this.name = name;
            this.age = age;
            this.lengtch = lengtch;
            this.sex = sex;
            this.color = color;
        }
        Human(String name, int age, boolean sex, String color, int lengtch, boolean home)
        {
            this.name = name;
            this.age = age;
            this.lengtch = lengtch;
            this.sex = sex;
            this.color = color;
            this.home = home;
        }
        Human(String name, int age, boolean sex, int lengtch)
        {
            this.name = name;
            this.age = age;
            this.lengtch = lengtch;
            this.sex = sex;
        }
        Human(String name, int age, String color, int lengtch)
        {
            this.name = name;
            this.age = age;
            this.lengtch = lengtch;
            this.color = color;
        }
        Human()
        {

        }
    }

}
