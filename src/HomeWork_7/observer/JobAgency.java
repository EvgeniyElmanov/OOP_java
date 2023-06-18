package src.HomeWork_7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, Vacancy vacancy) {
            for (Observer observer: observers) {
                if (vacancy.isRelevance()) {
                    observer.receiveOffer(companyName, vacancy);
                    if (observer.takeJob(vacancy)){
                        removeObserver(observer);
                        break;
                    }
                }
            }
    }

//    @Override
//    public void answerOffer(Observer observer) {
//        observer.takeJob(observer.takeJob())
//    }
}