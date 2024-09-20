public class Person {
    private final String firstName;
    private final String gender;
    private final int age;

    public Person(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}