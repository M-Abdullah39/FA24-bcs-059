public class ParkingSystem {
    private static ParkingSystem instance = null;

    String CampusName;
    Supervisor supervisor;
    ParkingZone[] zone = new ParkingZone[2];
    int zoneindex = 0;
    PermitHolder[] ph = new PermitHolder[10];
    int phindex = 0;

    private ParkingSystem(String CampusName, Supervisor supervisor) {
        this.CampusName = CampusName;
        this.supervisor = supervisor;
    }

    public static ParkingSystem getInstance(String CampusName, Supervisor supervisor) {
        if (instance == null) {
            instance = new ParkingSystem(CampusName, supervisor);
        } else {
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance.");
        }
        return instance;
    }

    public void addZone(ParkingZone z) {
        if (zoneindex < zone.length) {
            zone[zoneindex++] = z;
        }
    }

    public void addPermitHolder(PermitHolder p) {
        if (phindex < ph.length) {
            ph[phindex++] = p;
        }
    }

    @Override
    public String toString() {
        String result = "Campus: " + CampusName + "\n";
        result += "Supervisor: " + supervisor + "\n";
        result += "Zones: ";
        for (int i = 0; i < zoneindex; i++) {
            result += zone[i] + " ";
        }
        result += "\nPermit Holders: ";
        for (int i = 0; i < phindex; i++) {
            result += ph[i] + " ";
        }
        return result;
    }
}