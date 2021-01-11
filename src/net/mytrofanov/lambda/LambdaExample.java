package net.mytrofanov.lambda;

public class LambdaExample {
    public static void main(String[] args) {
        String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.concat(s2).toUpperCase();
            }
        }, "Bob", "Alice");

        System.out.println(sillyString);

        UpperConcat uc = (s1, s2) -> s1.concat(s2).toUpperCase();

        String sillyString2 = doStringStuff(uc, "Bob", "Alice");

        System.out.println(sillyString2);
    }

    public static final String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

interface UpperConcat {
    String upperAndConcat(String s1, String s2);
}
