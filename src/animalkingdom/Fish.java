package animalkingdom;

public class Fish extends Animal {

    public Fish(String name, int theYear) {
        super(name, theYear);
    }

    @Override
    public String move() {
        return "swims";
    }

    @Override
    public String breathe() {
        return "breathes with gills";
    }

    @Override
    public String birth() {
        return "lay eggs";
    }

    @Override
    public String toString() {
        return "Fish{" +
           "name='" + name + '\'' +
           ", theYear=" + theYear +
           '}';
    }

}