public class Exc6Author {

    private String name = "Jordan";
    private char gender = 'm';
    private String email = "Jordan.P@whateve.com";


    public Exc6Author(String newName, char newGender, String newEmail) {
        this.name = newName;
        this.gender = newGender;
        this.email = newEmail;
    }

    public String toString() {
        return name + "(" + gender + ") at " + email;
    }


    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
