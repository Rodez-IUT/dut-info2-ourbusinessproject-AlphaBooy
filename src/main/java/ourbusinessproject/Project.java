package ourbusinessproject;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    private String title;
    private String description;
    @ManyToOne @NotNull
    private Enterprise enterprise;

    public Project() {}

    public Project(Enterprise enterprise) {
        this.enterprise = enterprise;
        if (enterprise != null){
            this.enterprise.addProject(this);
        }
    }

    public Project(@NotEmpty String title, String description, @NotNull Enterprise enterprise) {
        this.title = title;
        this.description = description;
        this.enterprise = enterprise;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
        if (enterprise != null){
            this.enterprise.addProject(this);
        }
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
}