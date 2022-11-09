
//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;

public class FamilyTree {
    private HashSet<Person> bd;

    public FamilyTree() {
        bd = new HashSet<>();
    }

    public void printPerson(String surname, String name, String patronymic) {
        for (Person p : bd) {
            if (p.surname.equals(surname) && p.name.equals(name) && p.patronymic.equals(patronymic))
                System.out.println(p);
        }
    }

    public void addPerson(Person person) {
        if (bd.contains(person.parent1) || bd.contains(person.parent2)) {
            Person p = getPerson(person.parent1);
            if (p != null) {
                p.children.add(person);
            }
            Person p1 = getPerson(person.parent2);
            if (p1 != null) {
                p1.children.add(person);
            }
            bd.add(person);
        } else {
            bd.add(person);
        }
    }

    public Person getPerson(Person person) {
        for (Person p : bd) {
            if (p.equals(person)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "FamilyTree" + bd;
    }

}
