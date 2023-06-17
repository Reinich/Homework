package Task1.presenters;

import Task1.models.Reservation;
import Task1.models.Table;
import Task1.models.TableModel;
import Task1.views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model tableModel;
    private final View bookingView;
    public BookingPresenter(Model tableModel, View bookingView){ // работаем не напрямую, а через интерфейсы
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this); // передаем текущий экземпляр презентера
    }

    private Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void showTables(){
        bookingView.showTables(loadTables());
    }

    public void printReservationTableResult(int reservationId){
        bookingView.printReservationTableResult(reservationId);
    }
    public void printChangeReservationTableResult(int reservationId){ //!!!!!!!!!!!!!!!!!!!!
        bookingView.printChangeReservationTableResult(reservationId);
    }

    public void printReservationTableError(String errorMessage){
        bookingView.printReservationTableError(errorMessage);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try
        {
            int reservationId = tableModel.reservationTable(orderDate, tableNo, name);
            printReservationTableResult(reservationId);
        }
        catch (RuntimeException e){
            printReservationTableError(e.getMessage());
        }
    }

    @Override
    public void onChangeReservationTable(Date reservationDate, int oldReservation, int newTableNo, String name) {
        try {
            int changeReservationId = tableModel.changeReservationTable(reservationDate, oldReservation, newTableNo, name);
            printChangeReservationTableResult(changeReservationId);
        } catch (RuntimeException e){
            printReservationTableError(e.getMessage());
        }
    }
}

