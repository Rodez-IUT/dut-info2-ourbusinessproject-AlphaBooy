package ourbusinessproject;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Enterprise {

    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    @Size(min = 10)
    private String description;
    @NotNull
    @NotBlank
    private String contactname;
    @NotNull
    @NotBlank
    @Email
    private String contactemail;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContactName(String contactname) {
        this.contactname = contactname;
    }

    public void setContactEmail(String contactemail) {
        this.contactemail = contactemail;
    }
}
