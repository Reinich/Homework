package Task1.presenters;

import Task1.models.Table;

import java.util.Collection;

public interface View {

    void showTables(Collection<Table> tables);

    void setObserver(ViewObserver observer);

    void printReservationTableResult(int reservationNo);
    void printChangeReservationTableResult(int reservationId);

    void printReservationTableError(String errorMessage);

}
