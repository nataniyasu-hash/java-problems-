public class Room {
    int gebeude;
    int floor;
    int hausnummer = 100;
    public Room(int gebeude, int floor, int hausnummer) {
        this.gebeude = gebeude;
        this.floor = floor;
        this.hausnummer = hausnummer;
    }

    public Room clone() {
        return new Room(this.gebeude, this.floor, this.hausnummer);
    }
    public String toString () {
        return String.format("%2d-%d.%02d", gebeude, floor, hausnummer);
    }
}
