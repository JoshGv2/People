import java.util.Date;

public class Manager extends Person{

    private int ManagerId;
    private Department department;
    private String company;


    public Manager(int managerId, String company) {
        if(company==null) throw new IllegalArgumentException("Please provide the company.");
        ManagerId = managerId;
        this.company=company;
    }

    public Manager(String FirstName, String LastName, Date BirthDate, String Nationality, int managerId, Department department,
                   String company, String gender) {
        super(FirstName, LastName, BirthDate, Nationality, true, gender);
        if(company==null) throw new IllegalArgumentException("Please provide the company.");
        this.department= department;

        setManagerId(managerId);
    }

    public int getManagerId() {
        return ManagerId;
    }

    public void setManagerId(int managerId) {
        ManagerId = managerId;
    }

    @Override
    public String toString() {
        return super.getFirstName() +" " + super.getLastName()+ ", who was born on "+ super.getBirthDate()+ " is currently a manager at "+this.company+". "+
                (super.getGender().toLowerCase()=="male"?"He":"She")+ " is from " + super.getNationality()+"."
                ;
    }
}
