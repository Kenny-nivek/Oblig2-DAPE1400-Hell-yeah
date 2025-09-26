public class Robot {
    String name;
    String batteryLevel;
    String distancetoPark;
    String botType;
    // gi robotten 4 attributter: name, batteryLevel, distancetoPark og botType


    public String reportStatus() {
        // Metode for å rapportere statusen til robotten
        
        // Endre metoden slik at den returnerer en tekst streng som forklarer statusen til roboten
        // eksempel: Dette er bot Dancatron 4000 av type B-Bot.
        // Denne enheten har 80.0 batterikapasitet igjen og bor 1500 meter fra parken.
        return "";}

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
}
