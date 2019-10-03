package animalkingdom;

public class Mammals extends Animal {

    public Mammals(String name, int theYear) {
        super(name, theYear);
    }

    @Override
    public String move() {
        return "walks";
    }

    @Override
    public String breathe() {
        return "breathes with lungs";
    }

    @Override
    public String birth() {
        return "gives birth to live baby";
    }

    @Override
    public String toString() {
        return "Mammal{" +
           "name='" + name + '\'' +
           ", theYear=" + theYear +
           '}';
    }

}