import java.util.Date;

public abstract class Person {
    private String FirstName;
    private String LastName;
    private Date BirthDate;
    private String Nationality;

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    private String Gender;

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
                ". This person is " + this.Gender +
                (isEmployed ? ". This person is employed": "This person is not employed") +".";
    }
    Person(){

    }

     Person (String FirstName, String LastName, Date BirthDate, String Nationality, boolean employed,
    String Gender){
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
        if(!(Gender.equals("Male") || Gender.equals("Female")))
            throw new IllegalArgumentException("Please insert a valid gender");
        else{
            setGender(Gender);
        }
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


