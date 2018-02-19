package humans;

import humans.Human;

public class Worker extends Human {
     private double wage;
     private double workedHours;

    public Worker() {
        this.wage = wage;
    }

    public Worker(double wage, double workedHours) {
        this.wage = wage;
        this.workedHours = workedHours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    public double wages () {
        return wage/workedHours;
    }
}
