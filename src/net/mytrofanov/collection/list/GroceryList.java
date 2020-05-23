package net.mytrofanov.collection.list;

import java.util.ArrayList;

public class GroceryList {

    // Incompleted exercise, should be finished

    private ArrayList<String> groceriesList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceriesList.add(item);
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceriesList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String item = groceriesList.get(position);
        groceriesList.remove(position);
    }

    public String findItem(String searchItem) {
        int position = groceriesList.indexOf(searchItem);
        if(position >= 0) {
            return groceriesList.get(position);
        }
        return null;
    }
}
