import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Department d = Department.RESOURCES;
        Person josh = new Person("josh", "ge", date, "British", true, "Male");
        Person karim = new Person("karim", "al", date, "British", true, "Male");
        Person managerPerson = new Manager("Manager", "Person", date, "Irish", 12345, d,"ManagerCompany101", "Female");
        Person[] people = {josh, karim, managerPerson, new Employee("Employee", "Employee", date, "American", 54321, d,"ManagerCompany101", "Female")};
        for(Person p : people){
            System.out.println(p.toString());
        }




    }
}