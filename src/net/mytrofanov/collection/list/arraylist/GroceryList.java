package net.mytrofanov.collection.list.arraylist;

import java.util.ArrayList;

public class GroceryList {

    // Incompleted exercise, should be finished

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
        int position = findItem(oldItem);
        if(position >=0) {
            modifyGroceryItem(position, newItem);
        }
    }
    
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >=0) {
            removeGroceryItem(position);
            System.out.println("Grocery item " + item + " has been removed");
        } 
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);

    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean isItemExist(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }
}
