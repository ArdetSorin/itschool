package session12.challenges;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();
    private List<Resource> availableResources = new ArrayList<>();
    private List<Resource> neededResources = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employee.add(employee);
    }

    public void removeEmployee(Employee employee){
        employee.remove(employee);
    }

    public void getTeamLead(Team team) {
        team.getTeamLead();
    }

    public void setTeamLead(Team team) {
        team.setTeamLead();

    }
    public void addAvailableResource(Resource resource) {
        availableResources.add(resource);
    }

    public void removeAvailableResource(Resource resource) {
        availableResources.remove(resource);
    }

    public void addNeededResource(Resource resource) {
        neededResources.add(resource);
    }

    public void removeNeededResource(Resource resource) {
        neededResources.remove(resource);
    }

    public Employee[] getEmployees() {
        return new Employee[0];
    }
}