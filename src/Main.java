import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Capture data for 5 persons
        Person[] persons = capturePersons();

        // Display the first names and genders of the persons
        for (Person person : persons) {
            System.out.println("First Name: " + person.getFirstName() + ", Gender: " + person.getGender());
        }

        // Display the average age
        System.out.println("Average Age: " + calculateAverageAge(persons));

        // Display the count of persons by gender
        System.out.println("Number of persons with Male gender: " + countGender(persons, "Male"));
        System.out.println("Number of persons with Female gender: " + countGender(persons, "Female"));
    }

    public static Person[] capturePersons() {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[5];  // Array to store 5 persons

        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Gender (Male/Female): ");
            String gender = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            // Create a new Person and store it in the array
            persons[i] = new Person(firstName, lastName, gender, age);
        }

        return persons;
    }

    public static double calculateAverageAge(Person[] persons) {
        int sum = 0;
        for (Person person : persons) {
            sum += person.getAge();  // Sum all ages
        }
        return (double) sum / persons.length;  // Average
    }

    public static int countGender(Person[] persons, String searchedGender) {
        int count = 0;
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase(searchedGender)) {
                count++;  // Increment if the gender matches
            }
        }
        return count;
    }
}