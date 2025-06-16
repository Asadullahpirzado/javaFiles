public class a {
    // Parent Class: Animal
    static class Animal {
        protected String name;
        protected int age;
        protected String gender;
        protected int animalType;


        // Constructor
        public Animal(String name, int age, String gender, int animalType) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.animalType = animalType;
        }

        // Method to be overridden
        public void produceSound() {
            System.out.println("Generic animal sound");
        }

        // Getters
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getGender() {
            return gender;
        }
        public int getAnimalType() {
            return animalType;
        }
    }

    // Child Class: Dog
    static class Dog extends Animal {
        public Dog(String name, int age, String gender) {
            super(name, age, gender, 0); // 0 for Dog
        }

        @Override
        public void produceSound() {
            System.out.println(name + " says: Bow wow");
        }
    }

    // Child Class: Frog
    static class Frog extends Animal {
        public Frog(String name, int age, String gender) {
            super(name, age, gender, 1); // 1 for Frog
        }

        @Override
        public void produceSound() {
            System.out.println(name + " says: Ribbit");
        }
    }

    // Child Class: Kitten (female cat)
    static class Kitten extends Animal {
        public Kitten(String name, int age) {
            super(name, age, "female", 2); // 2 for Kitten
        }

        @Override
        public void produceSound() {
            System.out.println(name + " says: Meow");
        }
    }

    // Child Class: Tomcat (male cat)
    static class Tomcat extends Animal {
        public Tomcat(String name, int age) {
            super(name, age, "male", 3); // 3 for Tomcat
        }

        @Override
        public void produceSound() {
            System.out.println(name + " says: Meow");
        }
    }

    // Main method to test and calculate average age
    public static void main(String[] args) {
        // Create an array of different animals
        Animal[] animals = new Animal[6];
        animals[0] = new Dog("Rex", 5, "male");
        animals[1] = new Frog("Fred", 2, "male");
        animals[2] = new Kitten("Luna", 1);
        animals[3] = new Tomcat("Tom", 3);
        animals[4] = new Dog("Buddy", 4, "male");
        animals[5] = new Frog("Greeny", 3, "female");

        // Display animal sounds using polymorphism
        System.out.println("Animal Sounds at 01:58 PM PKT, Tuesday, May 20, 2025:\n");
        for (Animal animal : animals) {
            animal.produceSound();
        }

        // Calculate average age for each type using animalType
        int[] typeCounts = new int[4]; // Counts for Dog, Frog, Kitten, Tomcat
        int[] typeTotalAges = new int[4]; // Total ages for each type

        for (Animal animal : animals) {
            int type = animal.getAnimalType();
            typeCounts[type]++;
            typeTotalAges[type] += animal.getAge();
        }

        // Calculate and display average ages
        System.out.println("\nAverage Ages:");
        if (typeCounts[0] > 0) System.out.println("Dogs: " + (typeTotalAges[0] / typeCounts[0]) + " years");
        if (typeCounts[1] > 0) System.out.println("Frogs: " + (typeTotalAges[1] / typeCounts[1]) + " years");
        if (typeCounts[2] > 0) System.out.println("Kittens: " + (typeTotalAges[2] / typeCounts[2]) + " years");
        if (typeCounts[3] > 0) System.out.println("Tomcats: " + (typeTotalAges[3] / typeCounts[3]) + " years");
    }
}