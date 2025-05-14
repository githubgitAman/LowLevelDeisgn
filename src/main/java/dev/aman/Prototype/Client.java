package dev.aman.Prototype;

public class Client {
    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student student = studentRegistry.getStudent("batch1").clone();
        student.setName("Aman");
        student.setAge(26);
        Student student2 = studentRegistry.getStudent("batch2").clone();
        student2.setName("Aman is Intelligent");
        System.out.println("DEBUG");
    }

    private static void fillRegistry(StudentRegistry studentRegistry) {
            //1. Create Prototype object for every batch
            Student batch1 = new Student();
            batch1.setName("batch1");
            batch1.setAvgBatchPsp(75.0);
            studentRegistry.register("batch1", batch1);

            IntellijectStudent batch2 = new IntellijectStudent();
            batch2.setName("batch2");
            batch2.setAvgBatchPsp(90.0);
            studentRegistry.register("batch2", batch2);
        }
    }

