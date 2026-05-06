import exo.Partie1;
import exo.Partie2;
import factory.TripFactory;
import models.Trip;

import java.util.List;

void main() {
    // Générer une liste de 10 éléments pour tester lisiblement
    List<Trip> trips = TripFactory.generateTrips(10);

    System.out.println("=== Liste des 10 trajets générés ===");
    trips.forEach(System.out::println);
    System.out.println();

    // Test Partie 1
    Partie1 partie1 = new Partie1();

    System.out.println("=== TEST PARTIE 1 ===");
    
    System.out.println("=== longAndExpensiveTrips ===");
    partie1.longAndExpensiveTrips(trips).forEach(t -> System.out.println("ID: " + t.id() + " | Distance: " + t.distanceKm() + " km | Prix: " + t.price() + " €"));
    System.out.println();

    System.out.println("=== badTrips ===");
    partie1.badTrips(trips).forEach(t -> System.out.println("ID: " + t.id() + " | Note: " + t.rating()));
    System.out.println();

    System.out.println("=== recentTrips ===");
    partie1.recentTrips(trips).forEach(t -> System.out.println("ID: " + t.id() + " | Date: " + t.startTime()));
    System.out.println();

    // Test Partie 2
    Partie2 partie2 = new Partie2();

    System.out.println("=== TEST PARTIE 2 ===");
    
    System.out.println("=== countByCity ===");
    partie2.countByCity(trips).forEach((city, count) -> System.out.println("Ville: " + city + " | Nombre de trajets: " + count));
    System.out.println();

    System.out.println("=== revenueByDriver ===");
    partie2.revenueByDriver(trips).forEach((driver, revenue) -> System.out.printf("Chauffeur: %s | Revenu total: %.2f €%n", driver, revenue));
    System.out.println();

    System.out.println("=== avgDurationByCity ===");
    partie2.avgDurationByCity(trips).forEach((city, avgDuration) -> System.out.printf("Ville: %s | Durée moyenne: %.2f min%n", city, avgDuration));
}