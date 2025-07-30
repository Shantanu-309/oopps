package com.Skill;

import java.util.ArrayList;

class Autoboxing1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // autoboxing performed here
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("ArrayList: " + list);
    }
}