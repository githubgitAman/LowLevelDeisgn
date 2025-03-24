package dev.aman.Builder;

public class Helper {
    private String name;
    private int age;
    private double psp;
    private String batch;
    private int gradYear;
    private String universityName;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getPsp(){
        return psp;
    }
    public String getBatch(){
        return batch;
    }
    public int getGradYear(){
        return gradYear;
    }
    public String getUniversityName(){
        return universityName;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPsp(double psp){
        this.psp = psp;
    }
    public void setBatch(String batch){
        this.batch = batch;
    }
    public void setGradYear(int gradYear){
        this.gradYear = gradYear;
    }
    public void setUniversityName(String universityName){
        this.universityName = universityName;
    }

    public  Student build(){
        return new Student(this);
    }
}
