package Task1.publisher.implement;

import Task1.models.VacancyType;
import Task1.observer.Observer;
import Task1.publisher.Publisher;

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
    public void sendOffer(String companyName, int salary, VacancyType vacancyTypeNeed) {
        for (Observer observer: observers) {
            observer.receiveOffer(companyName, salary, vacancyTypeNeed);
        }
    }
}
