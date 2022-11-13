package practice_4;

import java.util.List;

public interface Sortable<T extends Person> {
    void sort(List<T> list, TypeForSort typeForSort);
}
