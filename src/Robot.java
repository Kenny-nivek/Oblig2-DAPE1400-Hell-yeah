import java.time.DayOfWeek;
import java.time.LocalDate;

public class Robot {
    private String name;
    private int batteryLevel;
    private double distancetoPark;
    private String botType;

    public Robot(String name, int batteryLevel, double distancetoPark, String botType){
        this.name = name;
        this.batteryLevel = batteryLevel;
        this.distancetoPark = distancetoPark;
        this.botType = botType;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public double getDistanceToPark() {
        return distancetoPark;
    }

    public void setDistanceToPark(double distanceToPark) {
        this.distancetoPark = distanceToPark;
    }

    public String getBotType() {
        return botType;
    }

    public void setBotType(String botType) {
        this.botType = botType;
    }

    public String reportStatus() {
        // Metode for å rapportere statusen til robotten

        // Endre metoden slik at den retunerer en tekst streng som forklarer statusen til roboten
        // eksempel: Dette er bot Dancatron 4000 av type B-Bot.
        // Denne enheten har 80.0 batterikapasitet igjen og bor 1500 meter fra parken.
        return "Dette er en bot" + name + "av typen" + botType + "." + "Denne enhteten har" + batteryLevel +
                "batterikapasitet igjen" + "og bor" + distancetoPark + "meter fra parken";
    }


    public boolean canWalkToThePark(World world) {
        // Metode for å sjekke om roboten kan gå til parken basert på omgivelsene

        // System.out.println(navn + " sjekker om det er mulig å gå til parken...");

        // Sjekk om det regner
        if (world.getIsRaining()) {
            // skriv ut hvorfor boten ikke kan gå i parken med System.out.println
            return false;
        }

        // Sjekk om det er søndag. Kan bare gå i parken på søndager.

        // Sjekk batterinivå. En bot trenger 1% batterinivå per 100 meter for å gå til parken.

        return true;
    }


    // lag en metode som heter canDanceAtClub, som sjekker om boten kan være med på danseklubben
       // bottypen må være av type B-Bot (hint .equals)
       // En bot trenger minimum 50% batterikapasitet for å være med
       // Det kan ikke være mandag. Da er danseklubben stengt.
    import java.time.DayOfWeek;
    import java.time.LocalDate;

    public class Robot {
        String name;
        int batteryLevel;
        String disctancetoPark;
        String botType;

        public boolean canDanceAtClub(){
            if (!botType.equals("B-Bot") ) {
                return false;
            }
            if (batteryLevel < 50) {
                return false;
            }
            DayOfWeek today = LocalDate.now().getDayOfWeek();
            if (today == DayOfWeek.MONDAY) {
                return false;
            }
            return false;
    }
}
