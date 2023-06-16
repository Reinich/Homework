package Task1;


import Task1.models.TableModel;
import Task1.presenters.BookingPresenter;
import Task1.presenters.Model;
import Task1.views.BookingView;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        bookingView.reservationTable(new Date(), 1103, "Станислав");

        bookingView.reservationTable(new Date(), 102, "Станислав");

        //Смена номера столика
        bookingView.changeReservationTable(new Date(), 102, 103, "Владимир");
        System.out.println();
        //Проверка на ошибку
        bookingView.changeReservationTable(new Date(), 103, 103, "Владимир");
    }

}
