import java.util.List;

public class Father extends Person {

    public Father(String surname, String name, String patronymic, Person parent1, Person parent2,
            Person children) {
        super(surname, name, patronymic, parent1, parent2, children);

    }

    @Override
    public String toString() {
        return "Father [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", parent1=" + parent1
                + ", parent2=" + parent2 + ", children=" + children + "]";
    }

}
