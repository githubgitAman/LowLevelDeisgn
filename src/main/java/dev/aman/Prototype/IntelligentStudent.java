package dev.aman.Prototype;

public class IntelligentStudent extends Student {
    private int iq;

    @Override
    public IntelligentStudent clone(){
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.iq = this.iq;
        //Not creating getters and setters as they are taken from parent class
        intelligentStudent.setName(this.getName());
        intelligentStudent.setAge(this.getAge());
        intelligentStudent.setBatch(this.getBatch());
        intelligentStudent.setAvgBatchPsp(this.getAvgBatchPsp());
        intelligentStudent.setPsp(this.getPsp());
        return intelligentStudent;
    }
}
