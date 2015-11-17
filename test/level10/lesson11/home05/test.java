package com.javarush.test.level10.lesson11.home05;

/**
 * Created by NikonovAA on 13.11.2015.
 */
public class test
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; j++){
                if (j == 2){
                    System.out.println(j);
                    continue;
                }
                System.out.println(4);
            }
        }
    }
}
