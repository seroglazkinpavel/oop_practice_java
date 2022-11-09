
import java.util.ArrayList;
import java.util.List;

public class Person implements Could {
    protected String surname;// фамилия
    protected String name;
    protected String patronymic;// отчество
    protected Person parent1;
    protected Person parent2;
    protected String language;
    protected List<Person> children; // List<Person> children

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person(String surname, String name, String patronymic, String language) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.language = language;
    }

    public Person(String surname, String name, String patronymic, Person parent1, Person parent2) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.parent1 = parent1;
        this.parent2 = parent2;
        children = new ArrayList<>();
    }

    public void could() {
        System.out.println("Говорит на" + language);
    }

    @Override
    public String toString() {
        return "Person [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
        result = prime * result + ((parent1 == null) ? 0 : parent1.hashCode());
        result = prime * result + ((parent2 == null) ? 0 : parent2.hashCode());
        // result = prime * result + ((children == null) ? 0 : children.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (patronymic == null) {
            if (other.patronymic != null)
                return false;
        } else if (!patronymic.equals(other.patronymic))
            return false;
        if (parent1 == null) {
            if (other.parent1 != null)
                return false;
        } else if (!parent1.equals(other.parent1))
            return false;
        if (parent2 == null) {
            if (other.parent2 != null)
                return false;
        } else if (!parent2.equals(other.parent2))
            return false;

        /*
         * if (children == null) {
         * if (other.children != null)
         * return false;
         * } else if (!children.equals(other.children))
         * return false;
         */

        return true;
    }

}