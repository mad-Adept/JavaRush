package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name, color;
    int longer;

    Dog(String name){
        this.name = name;
    }
    Dog(String name, int longer){
        this.name = name;
        this.longer = longer;
    }
    Dog(String name, int longer, String color){
        this.name = name;
        this.longer = longer;
        this.color = color;
    }
}
