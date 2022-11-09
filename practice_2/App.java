
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

        Person parent1 = new Father("Сидоров", "Генадий", "Петрович", null, null);
        Person parent2 = new Mother("Сидорова", "Тамара", "Степанова", null, null);
        Person person = new Person("Сидоров", "Федор", "Геннадьевич", parent1, parent2);

        familyTree.addPerson(parent1);
        familyTree.addPerson(parent2);
        familyTree.addPerson(person);
        System.out.println(familyTree);

        Person person3 = new Person("Сидоров", "Федор", "Генадьевич", " немецком, английском, французком языках.");
        Robot poet = new Robot();
        List<Could> list = new ArrayList<>();
        list.add(person3);
        list.add(poet);
        couldAll(list);
    }

    static void couldAll(List<Could> list) {
        for (Could item : list) {
            item.could();
        }
    }
}
