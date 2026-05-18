public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee (String name, int salery, int workHours, int hireYear) {
        this.name = name;
        this.salary = salery;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary < 1000 ){
            return 0;
        }else{
            return (this.salary*0.03);
        }
    }

    public double bonus(){
        if(this.workHours > 40)
            return this.workHours*30;

        return 0;

    }

    public double raiseSalary(){
        if(this.hireYear - 2021 < 10)
            return (this.salary*0.05);

        if(this.hireYear - 2021 > 9 && this.hireYear - 2021 < 20)
            return (this.salary*0.1);

        return (this.salary*0.15);

    }

    public String toString() {
        return "Name: " + this.name +
                "\nSalary: " + this.salary +
                "\nWork Hours: " + this.workHours +
                "\nHire Year: " + this.hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary increase: " + raiseSalary() +
                "\nSalary with the tax and bonuses: " + (this.salary + bonus() - tax()) +
                "\nNet Salary: " + (this.salary + raiseSalary());
    }

}
