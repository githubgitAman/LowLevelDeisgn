package dev.aman.Builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String batch;
    private int gradYear;
    private String universityName;

    public Student(Helper helper) {
        this.name = helper.getName();
        this.age = helper.getAge();
        this.psp = helper.getPsp();
        this.batch = helper.getBatch();
        this.gradYear = helper.getGradYear();
        this.universityName = helper.getUniversityName();
    }

    public static Helper getHelper(){
        return new Helper();
    }
}

