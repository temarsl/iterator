package мойВариант;

import java.util.Iterator;

public class CardiologyDepartmentIterator implements Iterator<Patient> {

    Patient[] patients;

    int position = 0; // текущая позиция перебора в массиве

    // конструктор получает массив объектов, для перебора которых создается итератор
    public CardiologyDepartmentIterator(Patient[] patients) {
        this.patients = patients;
    }

    // проверяем наличие элементов для перебора
    @Override
    public boolean hasNext() {
        if (position>=patients.length || patients[position] == null) { // из-за макс размера
            return false;
        } else {
            return true;
        }
    }

    // возвращает след элемент массива и увеличивает текущую позицию
    @Override
    public Patient next() {
        Patient patient = patients[position];
        position++;
        return patient;
    }
}
