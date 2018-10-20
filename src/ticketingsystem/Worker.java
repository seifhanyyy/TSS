package ticketingsystem;

public class Worker extends Human implements LoginOptions {
private double WorkingHours;
private String Department;

    public double getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(double WorkingHours) {
        this.WorkingHours = WorkingHours;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
public void HandleTickets(){
}
@Override
public void LoginIn(){
}
@Override
public void Logout(){
}
}