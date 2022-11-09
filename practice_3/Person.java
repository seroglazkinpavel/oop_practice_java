import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Создайте класс, который представляет из себя коллекцию, добавьте 2 метода add
 * и get для работы с коллекцией.
 * Реализуйте возможность использования цикла for-each для работы с данной
 * коллекцией.
 * Для этого реализуйте интерфейс Iterable и создайте итератор
 */
public class Person implements Iterable<String> {
    public List<String> abilities;
    int index;

    public Person() {
        abilities = new ArrayList<>();
        index = 0;
    }

    public void addAbility(String ability) {
        abilities.add(ability);
    }

    @Override
    public Iterator<String> iterator() {

        Iterator<String> it = new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < abilities.size();
            }

            @Override
            public String next() {
                return abilities.get(index++);
            }
        };
        return it;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.addAbility("Наблюдательность для писателя, врача, педагога, детектива");
        person.addAbility("Эмоциональная память для творческих профессий");
        person.addAbility("Музыкальный слух для артиста, композитора, музыкального критика");
        for (var ability : person) {
            System.err.println(ability);
        }
    }

}
