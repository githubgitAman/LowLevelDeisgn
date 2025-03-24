package dev.aman.Builder;
public class Client {
    public static void main(String[] args) {

//        Helper helper = Student.getHelper();
//        helper.setName("Aman");
//        helper.setAge(26);
//        helper.setPsp(76.00);
//        helper.setBatch("Jan 2024");
//        helper.setGradYear(2025);
//        helper.setUniversityName("Scaler");
//        Student student = helper.build();
//        System.out.println(student);

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
