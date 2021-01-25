package com.company;
import java.util.ArrayList;
import java.util.TreeMap;

public class Phones {

        public static void main(final String[] args) {
            final Phones pb = new Phones();

            Person Kancler = new Person("Палпатин");
            Person Lord = new Person("Волдеморт");
            Person Mag = new Person("Саурон");

            pb.add(Lord, "098");
            pb.add(Lord, "928");
            pb.add(Mag, "132");
            pb.add(Kancler, "555");
            pb.add(Kancler, "123");


            System.out.println(pb);
            pb.get(Lord);
            pb.get(Kancler);

        }

    private void get(Person Lord) {
    }

    private void add(Person Lord, String s) {
    }

}

