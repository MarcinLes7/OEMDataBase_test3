package pl.wszib.oemdatabase_test3.web.models;

import jakarta.validation.constraints.Size;

public class WorkplaceModel {
    @Size(min=2, max=50)
    private String department;
    @Size(min=2, max=50)
    private String phase;
    @Size(min=2, max=50)
    private String room;
    @Size(min=2, max=500)
    private String activity;
    @Size(min=2, max=50)
    private String firstName;
    @Size(min=2, max=50)
    private String lastName;
    @Size(min=2, max=500)
    private String ppe;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPpe() {
        return ppe;
    }

    public void setPpe(String ppe) {
        this.ppe = ppe;
    }
}
