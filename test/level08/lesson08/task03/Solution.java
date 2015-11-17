package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Никонов","Антон");
        map.put("Князев","Дмитрий");
        map.put("Копытов","Никита");
        map.put("Семенов","Николай");
        map.put("Карпенков","Дмитрий");
        map.put("Карпенко","Дмитрий");
        map.put("Гусев","Павел");
        map.put("Сагитов","Александр");
        map.put("Третенников","Василий");
        map.put("Главзов","Павел");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
       for (Map.Entry<String, String> p : map.entrySet()){
           if (p.getValue().equals(name)) count++;
       }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (Map.Entry<String, String> p : map.entrySet()){
            if (p.getKey().equals(familiya)) count++;
        }
        return count;
    }
}
