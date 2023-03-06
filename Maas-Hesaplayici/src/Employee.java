public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary =salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
     public double tax(){
        double tax = 0;
        if (this.salary > 1000) {
            tax = salary*0.03;
        }
        return tax;
    }

    public double bonus(){
        double a = 0;
        if (this.workHours - 40 > 0){
            return (this.workHours - 40)*30;
        }
        return a;
    }
    public double raiseSalary(){
        double raise = 0.0;
        int year = 2021;
        if (year - this.hireYear < 10){
            raise = this.salary*0.05;
        } else if ((year - this.hireYear > 9) && (year- this.hireYear < 20)) {
            raise = this.salary*0.010;
        }else {
            raise = this.salary*0.15;
        }
        return raise;
    }
    void toStrings(){
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work hours : " + this.workHours);
        System.out.println("Hire year : " + this.hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Raise Salary : " + raiseSalary());
        System.out.println("Salary (with tax & bonus) : " + (this.salary - tax() + bonus()));
        System.out.println("Total salary : " + (this.salary + raiseSalary() + bonus() - tax()));
    }

}

