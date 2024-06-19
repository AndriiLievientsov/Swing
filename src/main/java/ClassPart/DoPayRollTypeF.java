package ClassPart;

public class DoPayRollTypeF {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();

        fullTimeEmployee.setName("Барри Берд");
        fullTimeEmployee.setJobTitle("Директор");
        fullTimeEmployee.setWeeklySalary(5000.00);
        fullTimeEmployee.setBenefitDeduction(500.00);
        fullTimeEmployee.cutCheck(fullTimeEmployee.findPaymentAmount());
        System.out.println();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setName("Стив Гордон");
        partTimeEmployee.setJobTitle("Водитель");
        partTimeEmployee.setHourlyRate(45.18);
        partTimeEmployee.cutCheck(partTimeEmployee.findPaymentAmount(10));

    }
}
