package lab01.manual.scalable.models;

import java.util.UUID;

public class User {

    private String id;
    private String name;
    private Integer age;
    private String email;

    public User() {
    }

    // Constructor without id (used when creating a new user)
    public User(String name, Integer age, String email) {
        this.id = UUID.randomUUID().toString(); // Generate a unique ID
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Constructor with all fields
    public User(String id, String name, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
                "id:\"" + id + '\"' +
                ", name:\"" + name + '\"' +
                ", email:\"" + email + '\"' +
                ", age:" + age +
                '}';
    }
}