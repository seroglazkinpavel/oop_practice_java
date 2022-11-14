package practice_4;

public class Father extends Person {
    private String gender = "male";

    public Father(String surname, String name, String patronymic, Person parent1, Person parent2, int age) {
        super(surname, name, patronymic, parent1, parent2, age);

    }

    public void add(Person person) {
        children.add(person);
    }

    @Override
    public String toString() {
        return "Father [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", parent1=" + parent1
                + ", parent2=" + parent2 + ", age=" + age + ", children=" + children
                + "]";
    }

    public String getGender() {
        return gender;
    }

}
