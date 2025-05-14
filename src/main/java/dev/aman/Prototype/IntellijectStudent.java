package dev.aman.Prototype;

public class IntellijectStudent extends Student {


    private int iq;

    public IntellijectStudent clone(){
        IntellijectStudent intellijectStudent = new IntellijectStudent();
        intellijectStudent.setName(this.getName());
        intellijectStudent.setAge(this.getAge());
        intellijectStudent.setBatch(this.getBatch());
        intellijectStudent.setPsp(this.getPsp());
        intellijectStudent.setAvgBatchPsp(this.getAvgBatchPsp());
        intellijectStudent.iq = this.iq;
        return intellijectStudent;
    }
}
