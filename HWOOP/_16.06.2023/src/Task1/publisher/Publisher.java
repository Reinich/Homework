package Task1.publisher;

import Task1.models.VacancyType;
import Task1.observer.Observer;

public interface Publisher {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendOffer(String companyName, int salary, VacancyType vacancyTypeNeed);
}
