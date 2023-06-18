package src.HomeWork_5.presenters;

import java.util.Collection;
import java.util.Date;

import src.HomeWork_5.models.Table;

public interface Model {
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);
}