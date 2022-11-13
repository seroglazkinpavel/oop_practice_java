package practice_4;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T extends Person> implements Iterable<T> {
    private List<T> bd;

    public FamilyTree() {
        bd = new ArrayList<>();
    }

    public void addPerson(T item) {
        if (bd.contains(item.parent1) || bd.contains(item.parent2)) {
            T p = getPerson((T) item.parent1);
            if (p != null) {
                p.getChildren().add(item);
            }
            T p1 = getPerson((T) item.parent2);
            if (p1 != null) {
                p1.getChildren().add(item);
            }
            bd.add(item);
        } else {
            bd.add(item);
        }
    }

    public T getPerson(T item) {
        for (T p : bd) {
            if (p.equals(item)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "FamilyTree" + bd;
    }

    public T get(int i) {
        return bd.get(i);
    }

    @Override
    public Iterator<T> iterator() {
        return new FamilyTreeIterator();
    }

    public class FamilyTreeIterator implements Iterator<T> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < bd.size();
        }

        @Override
        public T next() {
            return bd.get(index++);
        }

    }

    public List<T> getBd() {
        return bd;
    }
}
