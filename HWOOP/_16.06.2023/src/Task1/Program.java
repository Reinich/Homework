package Task1;

import Task1.models.*;
import Task1.models.extend.Master;
import Task1.models.extend.Student;
import Task1.models.extend.TeamLead;
import Task1.publisher.implement.JobAgency;

public class Program {

    /**
     * TODO:
     *  2**. Добавить новый класс "Вакансия", JobAgency должна обрабатывать объект вакансия
     *  и решать какому подписчику рассылать вакансию.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70_000, jobAgency);
        Company google = new Company("Google", 100_000, jobAgency);
        Company yandex = new Company("Yandex", 150_000, jobAgency);


        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        System.out.println(petrov);
        Student sidorov = new Student("Sidorov");
        System.out.println(sidorov);
        TeamLead pupkin = new TeamLead("Pupkin");
        System.out.println(pupkin);


        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(pupkin);
        jobAgency.registerObserver(sidorov);


        geekBrains.needEmployee(VacancyType.Student);
        System.out.println();
        geekBrains.needEmployee(VacancyType.Student);
        System.out.println();
        yandex.needEmployee(VacancyType.Cleaner);
        System.out.println();
        yandex.needEmployee(VacancyType.Tester);
        System.out.println();
        google.needEmployee(VacancyType.TeamLead);
        System.out.println();
        google.needEmployee(VacancyType.Cooker);
        System.out.println();
        yandex.needEmployee(VacancyType.TeamLead);
    }

}
