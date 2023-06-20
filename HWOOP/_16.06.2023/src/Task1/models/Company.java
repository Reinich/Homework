package Task1.models;

import Task1.publisher.Publisher;

import java.util.Random;

public class Company {

    private static final Random random = new Random();
    private final String companyName;
    private final int maxSalary;
    private final Publisher jobAgency;


    public Company(String companyName, int maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(VacancyType vacanyNeed){
        int salary = random.nextInt(20_000, maxSalary);
        jobAgency.sendOffer(companyName, salary, vacanyNeed);
    }


}
