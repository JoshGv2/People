import java.util.Date;

public class Person {
    private String FirstName;
    private String LastName;
    private Date BirthDate;
    private String Nationality;

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    private boolean isEmployed;


    public String toString(){
        return "The persons name is " + this.FirstName +" "+this.LastName +
                ". They were born on " + this.BirthDate + " and they are from "+this.Nationality +
                (isEmployed ? " This person is employed": "This person is not employed");
    }
    public Person(){

    };
    public Person (String FirstName, String LastName, Date BirthDate, String Nationality, boolean employed){
        if(FirstName.length()<2) throw new IllegalArgumentException("The first name is invalid");
        else{
            setFirstName(FirstName);
        }
        if(LastName.length()<2) throw new IllegalArgumentException("The last name is invalid");
        else{
            setLastName(LastName);
        }
        setBirthDate(BirthDate);
        if(Nationality.length()<4) throw new IllegalArgumentException("The nationality is invalid");
        else{
            setNationality(Nationality);
        }
        setEmployed(employed);
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }
}


