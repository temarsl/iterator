package мойВариант;

import java.util.ArrayList;
import java.util.Iterator;

// Неврологическое отделение
public class NeurologicalDepartment implements Department {

    ArrayList<Patient> patients;

    public NeurologicalDepartment() {
        patients = new ArrayList<Patient>();
        add("Daniel", "memory disorder", 12332, 51746);
        add("Roman", "sciatica",45345,4534);
        add("Evgeniy", "neuroses", 46445,4354);
        add("Oleg", "encephalopathy", 45455,3221);
        add("Denis", "spasticity",35344,7654);
    }

    public void add(String name, String complaints,
                        int PolicyNumber, int PhoneNumber) {
        Patient patient = new Patient(name, complaints, PolicyNumber, PhoneNumber);
        patients.add(patient);
    }

    @Override
    public Iterator<Patient> createIterator() {
        return patients.iterator();
    }
}
