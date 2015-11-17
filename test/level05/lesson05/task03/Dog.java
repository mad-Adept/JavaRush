package com.javarush.test.level05.lesson05.task03;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
*/

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

public class Dog {
   String name;
    int age;

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String a){
        this.name = a;
    }
    public void setAge(int x){
        this.age = x;
    }
}
