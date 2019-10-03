package animalkingdom;

import java.util.*;

public class Main {

    public static ArrayList<Animal> filteredAnimals = new ArrayList<Animal>();

    public static void filterAnimals(ArrayList<Animal> animals, CheckAnimal tester) {
        filteredAnimals.clear();

        for (Animal a : animals) {
            if (tester.test(a)) {
                filteredAnimals.add(a);
            }
        }
    }

    public static void printAnimals(ArrayList<Animal> animals, CheckAnimal tester) {
        for (Animal a : animals) {
            if (tester.test(a)) {
                System.out.println(a.toString());
            }
        }
    }

    public static void main(String[] args) {
        // Mammals
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        //Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        //Fish
        Fish salmon= new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<Animal> animalSort = new ArrayList<Animal>();
        
        // Mammals
        animalSort.add(panda);
        animalSort.add(zebra);
        animalSort.add(koala);
        animalSort.add(sloth);
        animalSort.add(armadillo);
        animalSort.add(raccoon);
        animalSort.add(bigfoot);

        // Birds
        animalSort.add(pigeon);
        animalSort.add(peacock);
        animalSort.add(toucan);
        animalSort.add(parrot);
        animalSort.add(swan);

        // Fish
        animalSort.add(salmon);
        animalSort.add(catfish);
        animalSort.add(perch);


        // Sorting by year animal was named
        System.out.println("\n*** List of animals by year they were named in descending order ***");
        animalSort.sort((a1, a2) -> a2.getTheYear() - a1.getTheYear());
        System.out.println(animalSort.toString());
        System.out.println();

        // Sorting animals alphabetically
        System.out.println("\n*** List of animals sorted alphabetically ***");
        animalSort.sort((a1, a2) -> a1.getTheName().compareToIgnoreCase(a2.getTheName()));
        System.out.println(animalSort.toString());
        System.out.println();

        // Sorting animals in order of how they move
        System.out.println("\n*** List of animals sorted by how they move ***");
        animalSort.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animalSort.toString());
        System.out.println();
        System.out.println();

        // Sorting animals by animals that breathe with breathes with lungs
        System.out.println("*** List of animals that breathes with lungs ***");
        printAnimals(animalSort, a -> a.breathe() == "breathes with lungs");
        System.out.println();
        System.out.println();

        // Sorting animals that breathe with breathes with lungs that were named in 1758
        System.out.println("*** List of animals that breathes with lungs that were named in 1758 ***");
        printAnimals(animalSort, a -> a.breathe() == "breathes with lungs" && a.breathe() == "breathes with lungs");
        System.out.println();
        System.out.println();

        // Sorting only animals that lays eggs & breathe with breathes with lungs
        System.out.println("*** List of only animals that lays eggs & breathes with lungs ***");
        printAnimals(animalSort, a -> (a.birth() == "lays eggs" && a.breathe() == "breathes with lungs"));
        System.out.println();
        System.out.println();

        // Sorting alphabetically only the animals that were named in 1758
        System.out.println("*** List of animals only named in 1758 sorted alphabetically ***");
        printAnimals(animalSort, a -> a.getTheYear() == 1758);
        System.out.println();
        
    }
}