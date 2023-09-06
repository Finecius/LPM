public class Hourly extends Employee{
private double hourlyRate, hours;

    public Hourly(String name, double hourlyRate, double hours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPay() {
        return (hours*hourlyRate);
    }

    public void addHours(double hours){
        System.out.println(hours);
    }

    public void insertData(){
        System.out.println("Ready to insert!");
    }
}
