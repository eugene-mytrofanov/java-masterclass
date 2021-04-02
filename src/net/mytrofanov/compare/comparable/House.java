package net.mytrofanov.compare.comparable;

public class House implements Comparable<House> {

    private int area;
    private int price;
    private String city;
    boolean hasFurniture;

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    @Override
    public int compareTo(House anotherHouse) {
        if (this.area == anotherHouse.area) {
            return 0;
        } else if (this.area < anotherHouse.area) {
            return -1;
        } else {
            return 1;
        }
    }

    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }

    public String getCity() {
        return city;
    }

    public boolean isHasFurniture() {
        return hasFurniture;
    }

    @Override
    public String toString() {
        return "House{" +
               "area=" + area +
               ", price=" + price +
               ", city='" + city + '\'' +
               ", hasFurniture=" + hasFurniture +
               '}';
    }

}
