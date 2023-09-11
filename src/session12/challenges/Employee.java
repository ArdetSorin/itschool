package session12.challenges;

import javax.management.relation.Role;

public class Employee {
    public static Employee employees;
    private String name;
    private String email;
    private Role role;
    private Team team;

    public Employee(String name, String email, Role role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void receiveAnnouncement(String anouncement) {

    }

    public void add(Employee employee) {

    }

    public void remove(Employee employee) {

    }
}