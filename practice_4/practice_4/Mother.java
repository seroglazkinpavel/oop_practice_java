package practice_4;

//import java.util.List;

public class Mother extends Person {
    private String gender = "female";

    public Mother(String surname, String name, String patronymic, Person parent1, Person parent2, int age) {
        super(surname, name, patronymic, parent1, parent2, age);
    }

    public void add(Person person) {
        children.add(person);
    }

    @Override
    public String toString() {
        return "Mother [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", age=" + age
                + ", children=" + children
                + "]";
    }

    public String getGender() {
        return gender;
    }
}
