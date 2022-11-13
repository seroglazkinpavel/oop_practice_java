package practice_4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService implements Sortable<Person> {

    @Override
    public void sort(List<Person> list, TypeForSort typeForSort) {
        switch (typeForSort) {
            case age:
                Collections.sort(list, new PersonComparatorByAge());
                break;
        }
    }

    class PersonComparatorByAge implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

    }
}
