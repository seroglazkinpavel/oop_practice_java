
import java.util.HashSet;

public class FamilyTree {
    private HashSet<Person> bd;

    public FamilyTree() {
        bd = new HashSet<>();

    }

    /*
     * public void printPerson(String surname, String name, String patronymic) {
     * 
     * for (Person p : bd) {
     * if (bd.contains(p.surname) && bd.contains(p.name) &&
     * bd.contains(p.patronymic))
     * System.out.println(p);
     * }
     * }
     */

    public void addPerson(Person person) {
        if (person.parent1 != null) {
            if (bd.contains(person.parent1)) {
                Person p = getPerson(person.parent1);
                p.children.add(person);
            }
        }
        if (person.parent2 != null) {
            if (bd.contains(person.parent1)) {
                Person p = getPerson(person.parent2);
                p.children.add(person);
            }
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
        return "FamilyTree [bd=" + bd + "]";// как переопределить
        /*
         * return "FamilyTree [surname=" + surname + ", name=" + name + ", patronymic="
         * + patronymic + ", parent1=" + parent1
         * + ", parent2=" + parent2 + ", children=" + children + "]"
         */
    }

}
