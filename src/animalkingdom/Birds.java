package animalkingdom;

public class Birds extends Animal {

    public Birds(String name, int theYear) {
        super(name, theYear);
    }

    @Override
    public String move() {
        return "flies";
    }

    @Override
    public String breathe() {
        return "breathes with lungs";
    }

    @Override
    public String birth() {
        return "lays eggs";
    }

    @Override
    public String toString() {
        return "Bird{" +
           "name='" + name + '\'' +
           ", theYear=" + theYear +
           '}';
    }

}