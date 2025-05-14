package dev.aman.Prototype;

import java.util.HashMap;

//Student Registry where all object are stored
//Inside registry the object that we need to clone is stored
public class StudentRegistry {
    //Created map to store key and object
    private HashMap<String, Student> students = new HashMap<>();
    //Method to store prototype objects
    void register(String key, Student student) {
        students.put(key, student);
    }
    //Methods to get prototype objects
    public Student getStudent(String key) {
        return students.get(key);
    }
}
