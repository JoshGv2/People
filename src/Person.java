import java.util.Date;

public class Person {
    private String FirstName;
    private String LastName;
    private Date BirthDate;
    private String Nationality;


    public String toString(){
        return "The persons name is " + this.FirstName +" "+this.LastName +
                ". They were born on " + this.BirthDate + " and they are from "+this.Nationality;
    }
    public Person(){

    };
    public Person (String FirstName, String LastName, Date BirthDate, String Nationality){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthDate = BirthDate;
        this.Nationality = Nationality;
    }
}


