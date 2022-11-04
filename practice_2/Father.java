
public class Father extends Person {

    public Father(String surname, String name, String patronymic, Person parent1, Person parent2) {
        super(surname, name, patronymic, parent1, parent2);
    }

    @Override
    public String toString() {
        return "Father [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", parent1=" + parent1
                + ", parent2=" + parent2 + "]";
    }

}
