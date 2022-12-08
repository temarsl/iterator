package вариант2;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0; // текущая позиция перебора в массиве


    // конструктор получает массив объектов, для перебора которых создается итератор
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }



    // проверяем наличие элементов для перебора
    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) { // из-за макс размера
            return false;
        } else {
            return true;
        }
    }

    // возвращает след элемент массива и увеличивает текущую позицию
    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return  menuItem;
    }
}
