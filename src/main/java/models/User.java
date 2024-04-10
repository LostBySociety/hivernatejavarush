package models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Auto> autos;

    public User() {

    }
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        autos = new ArrayList<>();
    }
    public void addAuto(Auto auto) {
        auto.setUser(this);
        autos.add(auto);
    }
    public void removeAuto(Auto auto) {
        autos.remove(auto);
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }
    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(name, user.name) && Objects.equals(autos, user.autos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, autos);
    }
}
