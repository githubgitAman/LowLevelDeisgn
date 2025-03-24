package dev.aman.Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> studentMap = new HashMap<>();

    //Creating prototype object
    public void register(String key, Student student) {
        studentMap.put(key, student);
    }
    //Returning prototype object
    public Student get(String key) {
        return studentMap.get(key);
    }
}
