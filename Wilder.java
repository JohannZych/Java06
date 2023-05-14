public class Wilder {
    String firstname;
    boolean aware;


    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean getAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI(){

        String message;

        if (this.aware){
            message = "Je m'appelle " + firstname +" et je suis aware";
        } else {
            message = "Je m'appelle " + firstname +" et je ne suis pas aware";
        }
        return message;
    }
}
