package dev.aman.Builder;
public class Client {
    public static void main(String[] args) {

        Student student = Student.getHelper()
                .setName("Aman")
                .setAge(26)
                .setPsp(76.00)
                .setBatch("Jan 2024")
                .setGradYear(2025)
                .setUniversityName("Scaler")
                .build();
        System.out.println(student);
    }
}
