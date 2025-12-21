public class Rooms {
    // Your turn
    int gebeude;
    int etage;
    int raumnummer;
    public Rooms(int a, int b, int c) {
        this.gebeude = a;
        this.etage = b;
        this.raumnummer = c;
    }

    public Rooms clone() {
        return new Rooms (gebeude, etage, raumnummer);
    }
    public boolean equals(Rooms other) {
        return this.gebeude == other.gebeude &&
                this.etage ==  other.etage &&
                this.raumnummer == other.raumnummer;
    }
    public String toString() {
        String haus = String.format("%2d-%d.%02d", gebeude, etage, raumnummer );
        return haus;
    }
}
