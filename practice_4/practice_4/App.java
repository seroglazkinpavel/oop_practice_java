package practice_4;

public class App {
    public static void main(String[] args) throws Exception {
        FamilyTree<Person> familyTree = new FamilyTree<>();

        Person parent1 = new Father("Сидоров", "Генадий", "Петрович", null, null, 40);
        Person parent2 = new Mother("Сидорова", "Тамара", "Степанова", null, null, 35);
        Person person = new Person("Сидоров", "Федор", "Геннадьевич", parent1, parent2, 12);

        familyTree.addPerson(parent1);
        familyTree.addPerson(parent2);
        familyTree.addPerson(person);
        System.out.println(familyTree);

        PersonService service = new PersonService();
        service.sort(familyTree.getBd(), TypeForSort.age);

        for (Person item : familyTree) {
            System.out.println(item);
        }

    }
}
