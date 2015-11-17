package com.javarush.test.level08.lesson11.home01;




import java.util.HashSet;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
     //   cats.remove(cat2);
//        for (Cat c : cats){
//            cats.remove(c);
//            break;
//        }
        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> set = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat s : cats) System.out.println(s);
    }

    public static class Cat {

    }
}
