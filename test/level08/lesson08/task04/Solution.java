package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Никонов", new Date("December 14 1987"));
        map.put("kksbk", new Date("JUNE 12 1981"));
        map.put("lkvjwvv", new Date("August 15 1974"));
        map.put("bs", new Date("November 20 1956"));
        map.put("srtn", new Date("October 11 1989"));
        map.put("eraye", new Date("April 8 1999"));
        map.put("araqqqwrqw", new Date("March 19 1990"));
        map.put("oqwoqkjf", new Date("May 26 1920"));
        map.put("qowoqwflmmq", new Date("JUNE 16 1950"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        int Month;
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Date> p = iterator.next();
            Month = p.getValue().getMonth();
            if (Month == 5 || Month == 6 || Month == 7) iterator.remove();
            }
    }
}
