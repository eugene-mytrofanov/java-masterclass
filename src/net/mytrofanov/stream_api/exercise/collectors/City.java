package net.mytrofanov.stream_api.exercise.collectors;

public class City {
    private String name;
    private double temperature;

    public City(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "City{" +
               "name='" + name + '\'' +
               ", temperature=" + temperature +
               '}';
    }

}
