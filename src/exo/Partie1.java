package exo;

import models.Trip;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

public class Partie1 {

    Predicate<Trip> isLongAndExpensiveTrip = trip -> trip.distanceKm() > 10 && trip.price() > 20;

    Predicate<Trip> isBadTrip = trip -> trip.rating() < 3;

    Predicate<Trip> isRecentTrip = trip -> trip.startTime().toLocalDate().isAfter(LocalDate.now().minusDays(2));

    public List<Trip> longAndExpensiveTrips(List<Trip> trips) {
        // distance > 10km et prix > 20€
        return trips.stream()
                .filter(isLongAndExpensiveTrip)
                .toList();
    }

    public List<Trip> badTrips(List<Trip> trips) {
        // rating < 3
        return trips.stream()
                .filter(isBadTrip)
                .toList();
    }

    public List<Trip> recentTrips(List<Trip> trips) {
        // aujourd’hui ou hier
        return trips.stream()
                .filter(isRecentTrip)
                .toList();
    }
}
