package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать,
 трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human man1 = new Human("Гриша", true, 65);
        Human man2 = new Human("Миша", true, 55);
        Human man3 = new Human("Катя", false, 45);
        Human man4 = new Human("Аня", false, 63);
        Human man5 = new Human("Игорь", true, 43, man1, man3);
        Human man6 = new Human("Аня", false, 26, man2, man4);
        Human man7 = new Human("Кирил", true, 16, man5, man6);
        Human man8 = new Human("Саша", true, 13, man5, man6);
        Human man9 = new Human("Аня", false, 14, man5, man6);


        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);
        System.out.println(man4);
        System.out.println(man5);
        System.out.println(man6);
        System.out.println(man7);
        System.out.println(man8);
        System.out.println(man9);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
