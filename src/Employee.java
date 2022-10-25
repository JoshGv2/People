import java.util.Date;

public class Employee extends Person{

    private int employeeId;
    private Department department;
    private String company;


    public Employee(int employeeId, String company) {
        if(company==null) throw new IllegalArgumentException("Please provide the company.");
        employeeId = employeeId;
    }

    public Employee(String FirstName, String LastName, Date BirthDate, String Nationality, int employeeId, Department department,
                   String company, String gender) {
        super(FirstName, LastName, BirthDate, Nationality, true, gender);
        if(company==null) throw new IllegalArgumentException("Please provide the company.");
        this.department= department;
        setEmployeeId(employeeId);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return super.getFirstName() +" " + super.getLastName()+ ", who was born on "+ super.getBirthDate()+ " is an employee at"+getCompany()+". "+
                (super.getGender().toLowerCase()=="male"?"He":"She")+ " is from " + super.getNationality()+"."
                ;
    }


}
