public class World {
    private boolean isRaining;
    private int day;// 1 er Mandag, 2 er Tirsdag, ..., 7 for Søndag, 8 er Mandag...

    public World(int day, boolean isRaining) {
        this.day = day;
        this.isRaining = isRaining;
    }

    public boolean isSunday() {
        // Endre metoden slik at den returner true hvis det er søndag (hint: Modulo %)
        return day % 7 == 0;
    }
    public String toString() {
        String[] days ={"Mandag", "Tirsdag", "Onsdag", "Torsdasg", "Fredag", "Lørdag", "Søndag" };
        String dayName = days [(day - 1) % 7]; //Velger å bruke -1 siden det skal være mandag.
        String weather = isRaining ? "det regner" : "det er opphold";
        return  "Dag " + day + " (" + dayName + ") " + weather  + ".";
    }

    public boolean getIsRaining() {return this.isRaining;}
    public int getDay() {return this.day;}
}
