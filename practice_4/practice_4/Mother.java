package practice_4;

//import java.util.ArrayList;
import java.util.List;

public class Mother extends Person {
    // private List<Person> children;

    public Mother(String surname, String name, String patronymic, Person parent1, Person parent2, int age) {
        super(surname, name, patronymic, parent1, parent2, age);
        // children = new ArrayList<>();
    }

    public void add(Person person) {
        children.add(person);
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Mother [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", age=" + age
                + ", children=" + children
                + "]";
    }
}
