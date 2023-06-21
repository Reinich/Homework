package Task1.models.extend;

import Task1.models.VacancyType;
import Task1.models.Worker;
import Task1.observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Master extends Worker implements Observer {

    private static final Random random = new Random();
    private final List<VacancyType> vacancyTypeList = new ArrayList<>();

    {
        vacancyTypeList.add(VacancyType.Master);
        vacancyTypeList.add(VacancyType.Tester);
    }
    public Master(String name) {
        super(name, random.nextInt(60000, 80000));
    }

    @Override
    public void receiveOffer(String companyName, int salary, VacancyType vacancyTypeNeed) {

        if (getMinSalary() <= salary && vacancyTypeList.contains(vacancyTypeNeed)){
            System.out.printf("Сениор %s (%d руб.) >>> Мне нужна эта работа! [%s - %d руб.]\n",
                    getName(), getMinSalary(), companyName, salary);
            setMinSalary(salary);
        }
        else {
            System.out.printf("Сениор %s >>> Мне не подходит эта работа. [%d < %d]\n", getName(), getMinSalary(), salary);
        }
    }

    public List<VacancyType> getVacancyTypeList() {
        return vacancyTypeList;
    }
    @Override
    public String toString() {
        return String.format("Сениор готов работать: %s, за %d руб.\n", getVacancyTypeList(), getMinSalary());
    }
}
