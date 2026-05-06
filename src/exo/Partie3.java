package exo;

import models.Trip;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Partie3 {

    // Exercice 9: Créer les comparators
    Comparator<Trip> byPrice = Comparator.comparing(Trip::price);
    Comparator<Trip> byRating = Comparator.comparing(Trip::rating);

    public List<Trip> top10ExpensiveTrips(List<Trip> trips) {
        // coder ici
        return trips.stream()
                .sorted(byPrice.reversed()) // Tri par prix, ordre décroissant
                .limit(10)
                .toList();
    }

    public Optional<Trip> bestTrip(List<Trip> trips) {
        // coder ici
        return trips.stream()
                .max(byRating); // Trouve le trajet avec la note maximale
    }
}
