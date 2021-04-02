package net.mytrofanov.compare.comparable;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<House> myHouseSet = new TreeSet<>();
        House firstHouse = new House(100, 110000, "London", true);
        House secondHouse = new House(120, 100000, "Paris", true);
        House thirdHouse = new House(75, 80000, "Madrid", false);

        myHouseSet.add(firstHouse);
        myHouseSet.add(secondHouse);
        myHouseSet.add(thirdHouse);

        myHouseSet.forEach(house -> System.out.println(house));
    }

}
