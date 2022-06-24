package ru.grakovich.model;


import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "Not null")
    @Size(min = 2, max = 30, message = "")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "Not null")
    @Size(min = 2, max = 30, message = "")
    @Column(name = "lastName")
    private String lastName;

    @Min(value = 0, message = " > 0")
    @Max(value = 130, message = "<130")
    @Column(name = "age")
    private Integer age;

    public User() {
    }

    public User(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + lastName + " | " + age + " |";
    }
}
