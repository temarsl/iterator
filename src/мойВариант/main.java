package мойВариант;

public class main {
    public static void main(String[] args) {
        Department cardiologyDepartment = new CardiologyDepartment();
        Department neurologicalDepartment = new NeurologicalDepartment();

        Administrator administrator = new Administrator(cardiologyDepartment, neurologicalDepartment);

        administrator.output();

    }
}
