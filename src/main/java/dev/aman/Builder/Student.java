package dev.aman.Builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String batch;
    private int gradYear;
    private String universityName;

    private Student(Helper helper) {
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
    public static class Helper {
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
        public Helper setName(String name){
            this.name = name;
            return this;
        }
        public Helper setAge(int age){
            this.age = age;
            return this;
        }
        public Helper setPsp(double psp){
            this.psp = psp;
            return this;
        }
        public Helper setBatch(String batch){
            this.batch = batch;
            return this;
        }
        public Helper setGradYear(int gradYear){
            this.gradYear = gradYear;
            return this;
        }
        public Helper setUniversityName(String universityName){
            this.universityName = universityName;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

}

