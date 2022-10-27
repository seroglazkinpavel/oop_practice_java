public class Poet {
    private String surname;// фамилия
    private String name;
    private String patronymic;// отчество

    public Poet() {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public void emerge() {
        surname = "Пушкин";
        name = "Александр";
        patronymic = "Сергеевич";
        System.out.println(name + " " + patronymic + " " + surname + " Родился 6 июня 1799 года в Москве.");
    }

    public static void main(String[] args) {
        Poet poet = new Poet();
        poet.emerge();
    }
}
