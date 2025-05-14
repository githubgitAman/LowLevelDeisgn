package dev.aman.Prototype;

public class Student implements Prototypes<Student> {

    private String name;
    private int age;
    private String batch;
    private double psp;
    private double avgBatchPsp;

    @Override
    public Student clone() {

        Student student = new Student();
        student.name = name;
        student.age = age;
        student.batch = batch;
        student.psp = psp;
        student.avgBatchPsp = avgBatchPsp;
        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }
}

