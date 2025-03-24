package dev.aman.Prototype;

public class Client {
    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);
        //The clone() method is called after fetching the Student object from the registry.
        Student aman = studentRegistry.get("batch").clone();
        aman.setName("Aman");
        aman.setAge(22);
        aman.setPsp(75.0);

        Student aman2 = studentRegistry.get("batch").clone();
        aman2.setName("Avi");
        aman2.setAge(22);
        aman2.setPsp(75.0);
    }
    private static void fillRegistry(StudentRegistry studentRegistry) {

        //Create prototype object
        Student batch = new Student();
        batch.setName("BATCH1");
        batch.setAvgBatchPsp(75.0);

        studentRegistry.register("batch", batch);
    }
}
