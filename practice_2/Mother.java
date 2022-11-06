//import java.util.ArrayList;
//import java.util.List;

public class Mother extends Person {
    // private List<Person> children;

    public Mother(String surname, String name, String patronymic, Person parent1, Person parent2) {
        super(surname, name, patronymic, parent1, parent2);
        // children = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Mother [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", parent1=" + parent1
                + ", parent2=" + parent2 + "]";
    }

}
