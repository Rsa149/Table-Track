/*
 * This class will act like an restaurant staff of mangers.
 * This can have : 
 * addReservation, cancel reservation, getAvailableTimeSlot, update reservation etc.
 */
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    private List<Reservation> reservations;

    public ReservationManager() {
        reservations = new ArrayList<>();
    }

    /* This will return true if given time slot is available */
    public boolean isTimeSlotAvailable(LocalDateTime time) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationTime().isEqual(time)) {
                return false;
            }
        }
        return true;
    }

    /*This function will loop thru resrvations and return reservation if id matches */
    public Reservation getReservationById(int id) {
        for (Reservation reservation : reservations) {
            if (reservation.getId() == id) {
                return reservation;
            }
        }
        return null;
    }

    /*This function will check for available time and reserve it , other wise return false */
    public boolean addReservation(String name, String contactInfo, LocalDateTime reservationTime, int numberOfPeople) {
        if (isTimeSlotAvailable(reservationTime)) {
            reservations.add(new Reservation(name, reservationTime, numberOfPeople));
            return true;
        }
        return false;
    }

    /* this function will look for a matching id, and cancel reservation if matches */
    public boolean cancelReservation(int id) {
        Reservation reservation = getReservationById(id);
        if (reservation != null) {
            reservations.remove(reservation);
            return true;
        }
        return false;
    }

    /* This function will update the reservation by providing the id. 
     * Note :  id will remain same, you can update time and number of people
     */
    public boolean updateReservation(int id, LocalDateTime newTime, int newNumberOfPeople) {
        Reservation reservation = getReservationById(id);
        if (reservation != null) {
            reservation.setReservationTime(newTime);
            reservation.setNumberOfPeople(newNumberOfPeople);
            return true;
        }
        return false;
    }

    // TODO : Ramanpreet Singh, need to implement this
    /* This will return the available time slots */
    public List<LocalDateTime> getAvailableTimeSlots() {
        return null;
    }
}
