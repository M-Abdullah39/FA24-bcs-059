public class ParkingZone {
    private static int counter = 0;
    int zoneid;
    Vehicle[] vehicle = new Vehicle[5];
    int vehicleindex = 0;

    ParkingZone() {
        zoneid = ++counter;
    }

    public void addVehicle(Vehicle v) {
        if (v.plateno == null) return;
        if (vehicleindex < 5) {
            vehicle[vehicleindex++] = v;
        } else {
            System.out.println("No space in this zone");
        }
    }

    @Override
    public String toString() {
        String result = "Zone ID: Z" + zoneid + " Vehicles: ";
        for (int i = 0; i < vehicleindex; i++) {
            result += vehicle[i] + " ";
        }
        return result;
    }
}