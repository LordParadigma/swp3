package INFI;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DatensätzeFaker {
    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));

        //String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton
        String name = firstName + " " + lastName;

        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

        System.out.println(name + " " + firstName + " " + lastName + " " + streetAddress);

    }
}
