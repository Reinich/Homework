package Task1.presenters;

import Task1.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();
    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(Date reservationDate, int oldReservation, int newTableNo, String name);
}
