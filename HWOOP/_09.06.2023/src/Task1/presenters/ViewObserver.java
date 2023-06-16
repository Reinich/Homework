package Task1.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);
    void onChangeReservationTable(Date reservationDate, int oldReservation, int newTableNo, String name);
}
