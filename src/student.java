public class student extends Person{
    protected String major;
    public student (String cName1 , String eName1 ,String email1 ,String phone1 ,String address1
            ,String id1 ,short sex1 , int height1,int weight1,String major1){

        super(cName1, eName1 ,email1 ,phone1 ,address1,id1 , sex1 , height1, weight1);
        this.setMajor(major1);
    }

    public void setMajor(String major1) {
        this.major = major1;
    }

    public String getMajor() {
        return major;
    }
}
