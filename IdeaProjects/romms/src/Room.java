public class Room {
    // Your turn
    int gebeude;
    int etage;
    int hausnummer;
    public Room(int a, int b, int c) {
        this.gebeude = a;
        this.etage = b;
        this.hausnummer = c;
    }

    public Room clone() {
        return new Room(gebeude, etage, hausnummer);
    }
    public String toString() {
        return String.format("%2d-%d.%02d", gebeude, etage, hausnummer);
    }
    public boolean isEquals( Room other ) {
        return this.gebeude == other.gebeude &&
                this.hausnummer == other.hausnummer &&
                this.etage == other.etage;
    }
}
