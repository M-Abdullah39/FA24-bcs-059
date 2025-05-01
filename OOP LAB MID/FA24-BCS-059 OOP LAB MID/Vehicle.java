public class Vehicle {
    String plateno;
    String vtype;
    Owner owner;
    static String[] plates = new String[20];
    static int plateIndex = 0;

    Vehicle(String plateno, String vtype, Owner owner) {
        boolean exists = false;
        for (int i = 0; i < plateIndex; i++) {
            if (plates[i].equals(plateno)) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            this.plateno = plateno;
            this.vtype = vtype;
            this.owner = owner;
            plates[plateIndex++] = plateno;
        } else {
            System.out.println("Duplicate vehicle plate not allowed: " + plateno);
        }
    }

    @Override
    public String toString() {
        return "[License Plate: " + plateno + " Type: " + vtype + " Owner: " + owner + "]";
    }
}