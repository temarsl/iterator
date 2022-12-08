package мойВариант;

import java.util.Iterator;

// Кардиологическое отделение
public class CardiologyDepartment implements Department {

    static final int max_size = 5;
    int positions;
    Patient[] patients;

    public CardiologyDepartment() {
        patients = new Patient[max_size];
        add("Alena", "arrhythmia", 43332, 5674);
        add("Dmitry", "atrial fibrillation", 56565, 8754);
        add("Ilya", "sinus tachycardia", 87667, 9876);
        add("Galina", "pain in the left breast", 98989, 5422);
        add("Vasiliy", "sinus bradycardia", 90986, 7647);
    }

    public void add(String name, String complaints, int PolicyNumber, int PhoneNumber)  {
        Patient patient = new Patient(name,complaints,PolicyNumber, PhoneNumber);
        if (positions >= max_size) {
            System.out.println("sorry... the record is closed :(");
        } else {
            patients[positions] = patient;
            positions++;
        }
    }

    @Override
    public Iterator<Patient> createIterator() {
        return new CardiologyDepartmentIterator(patients);
    }
}
