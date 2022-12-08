package вариант2;

public interface Iterator<P> {
    boolean hasNext(); // остались ли в коллекции элементы для перебора
    MenuItem next(); // возвращает след элемент
}
