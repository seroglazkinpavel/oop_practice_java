public class Poet extends Person implements Ontogenez {

    public Poet(String surname, String name, String patronymic) {
        super(surname, name, patronymic);
    }

    public void emerge() {
        System.out.println(name + " " + patronymic + " " + surname + " Родился 6 июня 1799 года в Москве.");
    }
}
