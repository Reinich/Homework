package Task1.observer;

import Task1.models.VacancyType;

public interface Observer {

    void receiveOffer(String companyName, int salary, VacancyType vacansyNeed);

}
