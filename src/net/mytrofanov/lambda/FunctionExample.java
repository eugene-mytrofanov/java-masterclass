package net.mytrofanov.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionExample {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Suzy", "female"),
                new Student("Alice", "female"),
                new Student("Bob", "male"),
                new Student("Den", "male"));

        List<Student> girls = students.stream()
                                      .filter(student -> student.getGender() == "female")
                                      .collect(Collectors.toList());
        girls.forEach(girl -> System.out.print(girl.getName() + ", "));
        // Suzy, Alice,
    }

}

class Student {
    private String name;
    private String gender;

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

}


