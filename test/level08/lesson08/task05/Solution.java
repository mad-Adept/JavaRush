package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Никонов", "Антон");
        map.put("Князев", "Дмитрий");
        map.put("Копытов", "Никита");
        map.put("Семенов", "Николай");
        map.put("Карпенков", "Дмитрий");
        map.put("Карпенко", "Дмитрий");
        map.put("Гусев", "Павел");
        map.put("Сагитов", "Александр");
        map.put("Третенников", "Василий");
        map.put("Главзов", "Павел");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        int c = -1;
        int count;
        for (Map.Entry<String, String> p : copy.entrySet())
        {
            c++;
            count = 0;
            for (Map.Entry<String, String> r : copy.entrySet())
            {
                if (p.getValue().equals(r.getValue()) && count > c)
                {
                    removeItemFromMapByValue(map, r.getValue());
                }
                count++;
            }
        }
        //return map;
    }



    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

/*    public static void print(HashMap<String, String> map)
    {
        for (Map.Entry<String, String> p : map.entrySet())
        {
            System.out.println(p.getKey() + " " + p.getValue());
        }
    }

    public static void main(String[] args)
    {
        print(removeTheFirstNameDuplicates(createMap()));
    }*/
}