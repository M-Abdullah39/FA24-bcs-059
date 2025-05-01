public class Owner extends Person {
    private static int Counter = 0;
    int ownerid;
    Owner(String name) {
        super(name);
        ownerid = ++Counter;
    }
    @Override
    public String toString() {
        return "[Name: " + name + " Owner id: O" + ownerid + "]";
    }
}