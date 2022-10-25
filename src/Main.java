import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Person josh = new Employee("josh", "ge", date, "British", 1, Department.TECHNOLOGY, "EmployeeUnion", "Male");
        Person karim = new Employee("karim", "al", date, "British",2, Department.TECHNOLOGY, "Employee 101", "Male");
        Person managerPerson = new Manager("Manager", "Person", date, "Irish", 12345, Department.RESOURCES,"ManagerCompany101", "Female");
        Person[] people = {josh, karim, managerPerson, new Employee("Employee", "Employee", date, "American", 54321, Department.OPERATIONS,"ManagerCompany101", "Female")};
        for(Person p : people){
            System.out.println(p.toString());
        }




    }
}