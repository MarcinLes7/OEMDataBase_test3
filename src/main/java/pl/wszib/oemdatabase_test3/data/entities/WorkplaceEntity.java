package pl.wszib.oemdatabase_test3.data.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "workplaces")
public class WorkplaceEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "department")
    private String department;
    @Column(name = "phase")
    private String phase;
    @Column(name = "room")
    private int room;
    @Column(name = "activity")
    private String activity;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "ppe")
    private String ppe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPpe() {
        return ppe;
    }

    public void setPpe(String ppe) {
        this.ppe = ppe;
    }
}
