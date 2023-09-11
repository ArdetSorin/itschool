package session12.challenges;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private Employee teamLead;
    private List<Employee> teamMembers = new ArrayList<>();

    public Team(Employee teamLead) {
        this.teamLead = teamLead;
    }

    public void addTeamMember(Employee employee) {
        teamMembers.add(employee);
    }

    public void removeTeamMember(Employee employee) {
        teamMembers.remove(employee);
    }

    public Employee getTeamLead() {
        return teamLead;
    }

    public void setTeamLead() {
        this.teamLead = teamLead;
    }

    public List<Employee> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<Employee> teamMembers) {
        this.teamMembers = teamMembers;
    }
}