package com.javarush.test.level08.lesson11.home02;

import com.javarush.test.level05.lesson09.task03.Dog;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Collections.addAll(result, cat1, cat2,  cat3, cat4);
        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result = new HashSet<Dog>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Collections.addAll(result, dog1, dog2, dog3);
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        HashSet<Object> result = new HashSet<Object>();
        for (Cat c : cats){
            result.add(c);
        }
        for (Dog d : dogs){
            result.add(d);
        }

        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        HashSet<Object> copy = new HashSet<Object>(pets);
        for (Object o : copy){
            if (o.getClass().equals(Cat.class)) pets.remove(o);
        }
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object o : pets) System.out.println(o);
    }

    public static class Cat{};
    public static class Dog{};
    }