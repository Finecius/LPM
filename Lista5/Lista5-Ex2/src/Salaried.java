public class Salaried extends Employee{
private double salary;


    public Salaried(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary;
    }

    public void insertData(){
        System.out.println("Ready to insert!");
    }
}
