package com.javarush.test.level08.lesson08.task01;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();
        Collections.addAll(set, "Лом", "Лес", "Лывмы", "Лыфсф", "Лсыфс", "Лур", "Лиуиу", "Лкуиул", "Лмрлол", "Лдуиул", "Лукиукил", "Лилкуилулки", "Ллилиуи", "Ллулкиш", "Ллдиулид", "Ллдули",
                "Лилдукиод", "Ллййай", "Ллмрцпумг", "Лммцлм");
        return set;
    }
}
