package net.mytrofanov.stream_api.exercise.list_to_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapDemo {
    public static void main(String[] args) {
        String str = "bla blabla blabla blah bla blah blabla three one two three four";
        countWordsInStringAndSaveAsMap(str);
        convertListToMap();
    }

    private static void convertListToMap() {
        List<Hosting> hostings = new ArrayList<>();
        hostings.add(new Hosting(1, "digitalocean", 100000));
        hostings.add(new Hosting(2, "namecheap", 50000));
        hostings.add(new Hosting(3, "godaddy", 200000));
        hostings.add(new Hosting(4, "linode.com", 350000));
        hostings.add(new Hosting(5, "aws.com", 300000));

        Map<Integer, String> result1 = hostings.stream()
                                               .collect(Collectors.toMap(Hosting::getId, Hosting::getName));
        System.out.println("Result 1: " + result1);

        Map<String, Long> result2 = hostings.stream()
                                            .collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));
        System.out.println("Result 2: " + result2);

        Map<Integer, String> result3 = hostings.stream()
                                               .collect(Collectors.toMap(Hosting::getId, Hosting::getName));
        System.out.println("Result 3: " + result3);
    }

    private static void countWordsInStringAndSaveAsMap(String str) {
        List<String> wordsList = Arrays.asList(str.split(" "));
        Map<String, Long> wordsCount =  wordsList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordsCount);
    }

}
