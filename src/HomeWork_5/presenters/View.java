package src.HomeWork_5.presenters;

import java.util.Collection;

import src.HomeWork_5.models.Table;

public interface View {

    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    void printReservationTableResult(int reservationNo);

    void printReservationTableError(String errorMessage);

    void printChangeReservationTableResult(int reservationNo);

    void printChangeReservationTableError(String errorMessage);

}