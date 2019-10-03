package animalkingdom;

public abstract class Animal {

    public static int maxNum = 0;
    protected int num;
    protected String name;
    protected int theYear;

    public Animal(String name, int theYear) {
        maxNum++;
        num = maxNum;
        this.name = name;
        this.theYear = theYear;
    }

    public int getTheNumber() {
        return num;
    }

    public String getTheName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTheYear() {
        return theYear;
    }

    public void setTheYear() {
        this.theYear = theYear;
    }

    public String eat() {
        return (name + " ate the food");
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String birth();
   
}