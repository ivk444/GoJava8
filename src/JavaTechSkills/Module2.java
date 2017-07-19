package JavaTechSkills;

import java.util.Scanner;

/**
 * Created by john on 18.07.2017.
 */
public class Module2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = in.nextLine();

        System.out.print("Enter city: ");
        String city = in.nextLine();

        System.out.print("Enter age: ");
        int age = in.nextInt();

        System.out.print("Enter hobby: ");
        in.nextLine();
        String hobby = in.nextLine();

        System.out.println("\n var.#1 - table");
        System.out.println("name: " + name + "\n city: " + city + "\n age: " + age + "\n hobby: " + hobby);

        System.out.println("\n var.#2 - text");
        System.out.println("Человек по имени " + name + " живет в городе " + city + ".\n Этому человеку " + age + " лет и хобби у него " + hobby + ".");

        System.out.println("\n var.#3 - other");
        System.out.println(name + " - name \n" + city + " - city \n" + age + " - age \n" + hobby + " - hobby \n");

    }

}
