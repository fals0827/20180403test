public class Main {

    public static void main(String[] args) {
        teacher te = new teacher("米淇淋米淇淋米淇淋米淇淋米淇淋米淇淋米淇淋米淇淋米淇淋米淇淋米淇淋米淇淋","ghostghostghostghostghostghostghost",
                "fa@","0800-123-1234","none","1234567890",(short)3,999,999,"資工");
        System.out.println("中文姓名:"+te.getcName());
        System.out.println("英文姓名:"+te.geteName());
        System.out.println("Email:"+te.getEmail());
        System.out.println("電話:"+te.getPhone());
        System.out.println("地址:"+te.getAddress());
        System.out.println("ID:"+te.getId());
        System.out.println("性別:"+te.getSex());
        System.out.println("身高:"+te.getHeight()+"cm");
        System.out.println("體重:"+te.getWeight()+"kg");
        System.out.println("服務單位/主修:"+te.getDepartment());
    }
}
