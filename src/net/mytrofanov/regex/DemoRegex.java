package net.mytrofanov.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {

    public static void main(String[] args) {
        String phone = " + 38 (066) 364-65-66";
        String regex = "[\\s-+()]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        String normalizedPhone = matcher.replaceAll("");
        System.out.println(normalizedPhone);

        testPhoneNumbersList();
    }

    private static void testPhoneNumbersList() {
        List<String> phoneNumbers = Arrays.asList("7495) 995-0595abv",
                "795 268 8621bas",
                "324-51-44ba",
                "&7 (495) 995-05-95",
                "%7 495 995 05 95",
                "$7 (495) 995-0595",
                "+7 (495) 995-05-95",
                "+7 (495)925-34-89",
                "7(495)9253489",
                "7(495)925-34-89",
                "74959950595",
                "+38 abc (066) 364-65-66,./");

        List<String> formattedPhones = new ArrayList<>();
        for (String ph : phoneNumbers) {
            formattedPhones.add(ph.replaceAll("\\D+", ""));
        }
        formattedPhones.forEach(System.out::println);
    }

}
