package net.mytrofanov.compare.comparator;

import net.mytrofanov.compare.comparable.House;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<House> myHouses = new ArrayList<>();

        House firstHouse = new House(100, 110000, "London", true);
        House secondHouse = new House(120, 100000, "Paris", true);
        House thirdHouse = new House(75, 80000, "Madrid", false);
        House fourthHouse = new House(110, 120000, "Rome", false);


        myHouses.add(firstHouse);
        myHouses.add(secondHouse);
        myHouses.add(thirdHouse);
        myHouses.add(fourthHouse);

        // Print the list without sorting
        System.out.println("--- Print the list of houses without sorting ---");
        myHouses.forEach(house -> System.out.println(house));

        // Sort the list according to the price comparator
        myHouses.sort(new PriceComparator());
        System.out.println("\n--- Sorted Houses by price comparator ---");
        myHouses.forEach(System.out::println);

        // Sort the list according to the apartment area comparator
        Comparator<House> areaComparator = (h1, h2) -> h1.getArea() - h2.getArea();
        myHouses.sort(areaComparator);
        System.out.println("\n --- Sorted Houses by apartment area comparator ---");
        myHouses.forEach(System.out::println);

        // Sort the list according to the city comparator
        Comparator<House> cityComparator = Comparator.comparing(House::getCity);
        myHouses.sort(cityComparator);
        System.out.println("\n --- Sorted Houses by city comparator ---");
        myHouses.forEach(System.out::println);
    }
}
