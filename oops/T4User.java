package oops;
import java.util.ArrayList;
import java.util.List;

class T4User {
    private int id;
    private String name;
    private String email;

    public T4User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}