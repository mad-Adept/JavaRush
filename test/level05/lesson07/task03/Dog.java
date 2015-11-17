package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    int longer;
    String color;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int longer){
        this.name = name;
        this.longer = longer;
    }
    public void initialize(String name, int longer, String color){
       this.name = name;
       this.longer =longer;
       this.color = color;
    }
}
