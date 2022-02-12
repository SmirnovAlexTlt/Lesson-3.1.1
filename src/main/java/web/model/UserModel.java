package web.model;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 20, message = "Name must be between 2 and 20")
    private String name;

    @Column
    @NotEmpty(message = "LastName should not be empty")
    @Size(min = 2, max = 20, message = "LastName must be between 2 and 20")
    private String lastName;

    @Column
    private int age;

    @Column
    @NotEmpty(message = "Country must not be empty")
    @Size(min = 5, max = 20, message = "Country must be between 5 and 20")
    private String country;

    @Column
    @Size(min = 1, max = 15, message = "Phone must be between 1 and 15")
    private String phoneNumber;

    @Column
    @Email(message = "Email must be valid")
    private String email;

    public UserModel() {
    }

    public UserModel(String name, String lastName, int age, String country, String phoneNumber, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


