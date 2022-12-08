package вариант3;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 3; // ограничение на максимальный размер меню
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "bacon with lettuce ", true, 2.99);
        addItem("BLT",
                "bacon with lettuce", false, 2.99);
        addItem("soup of the day",
                "soup of the day, with a side of potato salad", false, 3.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Извините, меню переполнено!  Не удается добавить элемент в меню! :( ");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }


    // клиенту не нужно знать ни то, как коллекция menuItems хранится
    // ни то как реализован просто вызываем итератор
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
