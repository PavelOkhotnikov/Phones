package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(final String[] args) {
        final String[] namesOfFrodoFriends = { "Боромир", "Арагорн", "Леголас", "Гимли", "Гендальф", "Фродо", "Мэри", "Пипин", "Сэм", "Голум", "Фродо", "Арагорн", "Древень", "Саруман", "Саурон", "Леголас" };
        printUnique(namesOfFrodoFriends);
    }

    private static void printUnique(final String[] arr) {
        final Map<String, Integer> nameAndCount = new HashMap<String, Integer>();
        for (final String name : arr) {
            Integer count = nameAndCount.get(name);
            if (count == null) {
                nameAndCount.put(name, 1);
            }
            else {
                nameAndCount.put(name, ++count);
            }
        }
        System.out.println(nameAndCount);
    }
}