package net.mytrofanov.stream_api.exercise.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectorsDemo {
    public static void main(String[] args) {
        List<City> cities = initCitiesWithTemperature();
        // 1. Filter and save as List
//        List<String> filteredCities = filterCitiesByTemperature(cities, 16.4);
        // 2. Filter and save as Set
//        Set<String> filteredCities = filterCitiesByTemperatureWithoutDuplicates(cities, 17.4);
        // 3. Filter ans save as Map
//        Map<String, Double> filteredCities = filterCitiesByTemperaruteAndSaveAsMap(cities, 16.4);
        // 4. Convert List to Map and count City occurances, applying Long -> Int function to the result
//        Map<String, Integer> collectedCities = convertToMapAndCountOccurrences(cities);
        // 5. Convert List to Map and count City names occurances
//        Map<String, Long> collectedCities = groupAndCountListOfCitiesToMap(cities);
        // 6. Cities are groupped by City name in the format Map <String, List<City>>
        Map<String, List<City>> collectedCities = groupingBy(cities);

        //        System.out.println(filteredCities);
        System.out.println(collectedCities);
    }

    private static List<City> initCitiesWithTemperature() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Kyiv", 16.5));
        cities.add(new City("Minsk", 14));
        cities.add(new City("Sofia", 20.5));
        cities.add(new City("Riga", 18));
        cities.add(new City("Paris", 17.5));
        cities.add(new City("Praha", 16.0));
        cities.add(new City("Praha", 16.0));
        cities.add(new City("Kyiv", 16.5));
        return cities;
    }

    private static List<String> filterCitiesByTemperature(List<City> cities, double temp) {
        return cities.stream()
                     .filter(city -> city.getTemperature() > temp)
                     .map(city -> city.getName())
                     .collect(Collectors.toList());
    }

    private static Set<String> filterCitiesByTemperatureWithoutDuplicates(List<City> cities, double temp) {
        return cities.stream()
                     .filter(city -> city.getTemperature() > temp)
                     .map(City::getName)
                     .collect(Collectors.toSet());
    }

    private static Map<String, Double> filterCitiesByTemperaruteAndSaveAsMap(List<City> cities, double temp) {
        return cities.stream()
                     .filter(city -> city.getTemperature() > temp)
                     .collect(Collectors.toMap(City::getName, City::getTemperature, (key, identicalKey) -> key));
    }

    private static Map<String, Integer> convertToMapAndCountOccurrences(List<City> cities) {
        return cities.stream()
                     .collect(Collectors.groupingBy(
                             City::getName, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)
                     ));
    }

    private static Map<String, Long> groupAndCountListOfCitiesToMap(List<City> cities) {
        return cities.stream()
                     .collect(Collectors.groupingBy(City::getName,
                                                    Collectors.counting()));
    }

    private static Map<String, List<City>> groupingBy(List<City> cities) {
        return cities.stream()
                     .collect(Collectors.groupingBy(City::getName));
    }

}
