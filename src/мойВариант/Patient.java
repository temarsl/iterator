package мойВариант;

// пациент
public class Patient {
    String name; // имя пациента
    String complaints; // жалобы пациента
    int PolicyNumber; // номер полиса
    int PhoneNumber; // номер телефона

    public Patient(String name, String complaints, int policyNumber, int phoneNumber) {
        this.name = name;
        this.complaints = complaints;
        this.PolicyNumber = policyNumber;
        this.PhoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getComplaints() {
        return complaints;
    }

    public int getPolicyNumber() {
        return PolicyNumber;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }
}
