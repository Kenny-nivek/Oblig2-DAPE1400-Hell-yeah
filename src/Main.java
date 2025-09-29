import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        World todaysWorld = new World(122, false);
        // Robot objekter
        Robot r1 = new Robot("Optimus", 80, 1500, "B-bot");
        Robot r2 = new Robot("Megatron", 50, 500, "Toaster");
       //Status
        System.out.println(r1.reportStatus());
        System.out.println(r2.reportStatus());



        // Opprett to Robot-objekter
        // med navn, f.eks. Dancatron 4000 og Spark-E
        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        // print ut statusen til begge robottene

        // Sjekk om robotene kan gå til danseklubben

        System.out.println("Kan " + r1.getName() + " danse? " + r1.canDanceAtClub());
        System.out.println("Kan " + r2.getName() + " danse? " + r2.canDanceAtClub());

        // Sjekk om robotene kan gå til parken
        System.out.println("Kan " + r1.getName() + " gå til parken? " + r1.canWalkToThePark(todaysWorld));
        System.out.println("Kan " + r2.getName() + " gå til parken? " + r2.canWalkToThePark(todaysWorld));
    }
}
