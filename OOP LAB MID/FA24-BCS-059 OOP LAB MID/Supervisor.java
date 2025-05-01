public class Supervisor extends Person {
    int experience;
    Supervisor(String name, int experience) {
        super(name);
        this.experience = experience;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Experience: " + experience;
    }
}