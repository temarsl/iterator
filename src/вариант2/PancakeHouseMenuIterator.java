package вариант2;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    ArrayList<MenuItem> items;
    int position = 0;

    // конструктор получает массив объектов, для перебора которых создается итератор
    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    // проверяем наличие элементов для перебора
    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    // возвращает след элемент массива и увеличивает текущую позицию
    @Override
    public MenuItem next() {
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
    }

}
