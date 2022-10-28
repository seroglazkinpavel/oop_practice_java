
import java.util.ArrayList;
import java.util.List;

/*Реализовать, с учетом ооп подхода, приложение
Для проведения исследований с генеалогическим древом.
Идея: описать некоторое количество компонент, например:
модель человека
компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
компонент для проведения исследований
дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека
Под “проведением исследования” можно понимать получение всех детей выбранного человека. 

В проекте из прошлого дз про гениалогическое дерево подумайте есть ли необходимость где то использования 
интерфейса, если такой необходимости вы не видите, то добавьте какой то функционал, в котором использование 
интерфейсов было бы полезно
*/

public class App {
    public static void main(String[] args) throws Exception {
        FamilyTree familyTree = new FamilyTree();

        Person person1 = new Father("Сидоров", "Генадий", "Петрович", null, null);
        Person person2 = new Mother("Сидорова", "Тамара", "Степанова", null, null);
        Person person = new Person("Сидоров", "Федор", "Генадьевич", person1, person2);
        familyTree.addPerson(person);
        familyTree.addPerson(person1);
        familyTree.addPerson(person2);

        System.out.println(familyTree);
        System.out.println(familyTree.getPerson(person));

        Person person3 = new Person("Сидоров", "Федор", "Генадьевич");
        Poet poet = new Poet("Пушкин", "Александр", "Сергеевич");
        List<Ontogenez> list = new ArrayList<>();
        list.add(person3);
        list.add(poet);
        emergeAll(list);
    }

    static void emergeAll(List<Ontogenez> list) {
        for (Ontogenez ontogenez : list) {
            ontogenez.emerge();
        }
    }
}
