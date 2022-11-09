
import java.util.List;

/*Реализовать, с учетом ооп подхода, приложение
Для проведения исследований с генеалогическим древом.
Идея: описать некоторое количество компонент, например:
модель человека
компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
компонент для проведения исследований
дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека
Под “проведением исследования” можно понимать получение всех детей выбранного человека. */

public class App {
    public static void main(String[] args) throws Exception {
        FamilyTree familyTree = new FamilyTree();

        Person children = new Children("Сидоров", "Федор", "Генадьевич");
        Person person1 = new Father("Сидоров", "Генадий", "Петрович", null, null,
                children);
        Person person2 = new Mother("Сидорова", "Тамара", "Степанова", null, null,
                children);
        Person person = new Person("Сидоров", "Федор", "Генадьевич", person1, person2, null);
        // System.out.println(person);

        familyTree.addPerson(person);
        familyTree.printPerson("Сидоров", "Федор", "Генадьевич");// не выводится
        System.out.println(familyTree);// как переопределить

        System.out.println(familyTree.getPerson(person));// дает null

    }

}
