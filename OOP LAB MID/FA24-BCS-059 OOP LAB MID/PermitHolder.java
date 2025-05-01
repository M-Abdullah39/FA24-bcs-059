public class PermitHolder extends Person {
    private static int counter = 999;
    int permitid;

    PermitHolder(String name) {
        super(name);
        permitid = ++counter;
    }

    @Override
    public String toString() {
        return "[Name: " + name + " Permit ID: " + permitid + "]";
    }
}