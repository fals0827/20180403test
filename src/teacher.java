public class teacher extends Person{
    protected String department;
    public teacher (String cName1 , String eName1 ,String email1 ,String phone1 ,String address1
            ,String id1 ,short sex1 , int height1,int weight1,String department1){

        super(cName1, eName1 ,email1 ,phone1 ,address1,id1 , sex1 , height1, weight1);
        this.setDepartment(department1);
    }

    public void setDepartment(String department1) {
        this.department = department1;
    }

    public String getDepartment() {
        return department;
    }
}
