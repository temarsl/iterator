package мойВариант;

import java.util.Iterator;

public class Administrator {
    Department neurologicalDepartment;
    Department cardiologyDepartment;

    public Administrator(Department neurologicalDepartment, Department cardiologyDepartment) {
        this.neurologicalDepartment = neurologicalDepartment;
        this.cardiologyDepartment = cardiologyDepartment;
    }

    public void output() {
        Iterator<Patient> iterator1 = cardiologyDepartment.createIterator();
        Iterator<Patient> iterator2 = neurologicalDepartment.createIterator();
        System.out.println("Patients of the neurological department:");
        output(iterator2);
        System.out.println();
        System.out.println("Patients of the cardiology department:");
        output(iterator1);
    }

    private void output(Iterator iterator) {
        while (iterator.hasNext()) {
            Patient patient = (Patient) iterator.next();
            System.out.println(patient.getName() + ", " + patient.getComplaints() + ", " + patient.getPolicyNumber() + ", " + patient.getPhoneNumber());
        }
    }
}
