package HomeWork_5;

import HomeWork_5.models.TableModel;
import HomeWork_5.presenters.BookingPresenter;
import HomeWork_5.presenters.Model;
import HomeWork_5.presenters.View;
import HomeWork_5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: Домашняя работа: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     * @param args
     */
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        // Клиент нажимает на кнопку "Зарезервировать", возбуждается событие,
        // вызывается метод reservationTable()
        bookingView.reservationTable(new Date(), 1103, "Станислав");

        bookingView.reservationTable(new Date(), 102, "Станислав");

        System.out.println("-------------------------------");

        bookingView.changeReservationTable(9001, new Date(), 101, "Станислав");
        bookingView.changeReservationTable(9001, new Date(), 104, "Станислав");


    }

}