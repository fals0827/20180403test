public class Person {
    protected String cName , eName  , email , phone , address , id;
    protected short sex;
    protected int height , weight;
    public Person (String cName1 , String eName1 ,String email1 ,String phone1 ,String address1
            ,String id1 ,short sex1 , int height1,int weight1){
        this.setcName(cName1);
        this.seteName(eName1);
        this.setEmail(email1);
        this.setPhone(phone1);
        this.setAddress(address1);
        this.setId(id1);
        this.setSex(sex1);
        this.setHeight(height1);
        this.setWeight(weight1);
    }
    public void setcName(String cName1) {
        if (cName1.length() > 30 ){
            System.out.println("姓名格式有誤，已刪除超過部分");
            this.cName = cName1.substring(0,30);
        }else {
            this.cName = cName1;
        }
    }
    public void seteName(String eName1) {
        if (eName1.length() > 30 ){
            System.out.println("姓名格式有誤，已刪除超過部分");
            this.eName = eName1.substring(0,30);
        }else {
            this.eName = eName1;
        }
    }

    public void setEmail(String email1) {this.email = email1;}

    public void setPhone(String phone1) {
        if (phone1.matches("[0-9]{4}-[0-9]{3}-[0-9]{3}")){
            System.out.println("電話格式有誤，已將電話設為:0800-123-456");
            this.phone = "0800-123-456";
        }else {
            this.phone = phone1;
        }
    }
    public void setAddress(String address1) {this.address = address1;}

    public void setId(String id1) {
        if (id1.matches("[0-9]{9}")){
            this.id = id1;
        }else {
            System.out.println("ID格式有誤，已將ID設為:999999999");
            this.id = "999999999";
        }
    }
    public void setSex(short sex1) {
        if (sex1 < 3 && sex1 >= 0){
            this.sex = sex1;
        }else {
            System.out.println("性別選項錯誤，已將性別設為:不公開");
            this.sex = 2;
        }}
    public void setHeight(int height1) {
        if (height1 < 300 && height1 > 0){
            this.height = height1;
        }else {
            System.out.println("身高輸入錯誤，已將身高設為:180");
            this.height = 180;
        }
    }
    public void setWeight(int weight1) {
        if (weight1 < 250 && weight1 > 0){
            this.weight = weight1;
        }else {
            System.out.println("體重輸入錯誤，已將體重設為:60");
            this.weight = 60;
        }
    }

    public String getcName() {return cName;}
    public String geteName() {return eName;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}
    public String getAddress() {return address;}
    public String getId() {return id;}
    public short getSex() {return sex;}
    public int getHeight() {return height;}
    public int getWeight() {return weight;}

}
