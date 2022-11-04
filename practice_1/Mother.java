import java.util.List;

public class Mother extends Person {

    public Mother(String surname, String name, String patronymic, Person parent1, Person parent2,
            Person children) {
        super(surname, name, patronymic, parent2, parent2, children);
    }

    @Override
    public String toString() {
        return "Mother [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", parent1=" + parent1
                + ", parent2=" + parent2 + ", children=" + children + "]";
    }
}
