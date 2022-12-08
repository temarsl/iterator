package вариант2;

public class main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        // передаем созданные меню для вывода
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        // выводим
        waitress.printMenu();
    }
}
