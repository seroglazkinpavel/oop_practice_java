package practice_4;

//import java.util.ArrayList;
import java.util.List;

public class Father extends Person {
    // private List<Person> children;

    public Father(String surname, String name, String patronymic, Person parent1, Person parent2, int age) {
        super(surname, name, patronymic, parent1, parent2, age);
        // children = new ArrayList<>();
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
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

}
