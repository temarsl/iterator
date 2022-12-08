package вариант3;

public class main {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        // передаем созданные меню для вывода
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        // выводим
        waitress.printMenu();
    }
}
