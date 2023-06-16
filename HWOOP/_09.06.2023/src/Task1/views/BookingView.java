package Task1.views;

import Task1.models.Table;
import Task1.presenters.View;
import Task1.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }

    @Override
    public void printReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
    }

    @Override
    public void printChangeReservationTableResult(int reservationId) {
        System.out.printf("Столик успешно изменен. Номер вашей брони: #%d\n", reservationId);
    }

    @Override
    public void printReservationTableError(String errorMessage) {
        System.out.printf("Невозможно забронировать столик. \n%s\n", errorMessage);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    public void changeReservationTable(Date reservationDate, int oldReservation, int newTableNo, String name){
        observer.onChangeReservationTable(reservationDate, oldReservation, newTableNo, name);
    }
}
