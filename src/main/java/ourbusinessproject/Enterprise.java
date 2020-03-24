package ourbusinessproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.*;
import java.util.List;

@Entity
public class Enterprise {

    private @Id @GeneratedValue Long id;
    private @NotEmpty String name;
    private @NotEmpty @Size(min = 10) String description;
    private @NotEmpty String contactname;
    private @NotEmpty @Email String contactemail;
    @OneToMany
    private List<Project> projects;

    public void setName(String name) {
        this.name = name;
    }
    public @NotEmpty String getName() { return this.name; }

    public void setDescription(String description) {
        this.description = description;
    }
    public @NotEmpty String getDescription() { return this.description; }

    public void setContactName(String contactname) {
        this.contactname = contactname;
    }
    public @NotEmpty String getContactName() { return this.contactname; }

    public void setContactEmail(String contactemail) {
        this.contactemail = contactemail;
    }
    public @NotEmpty String getContactEmail() { return this.contactemail; }

    public Long getId() { return id; }

    public List<Project> getProjects() {
        return projects;
    }
}
