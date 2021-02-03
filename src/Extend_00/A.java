package Extend_00;

public class A {
    int id,age,name;
    //构造函数制造对象
    //析构函数清除对象，java没有析构函数
    public A(){
        System.out.println("11111111");
        id = 0;
    }
    public A(int name1){
        name = name1;
        System.out.println("22222222");
    }
    public A(int aid,int aage){
        id = aid;
        age = aage;
    }
    //一个类可以有多个构造函数，但是参数不一样

    public static void main(String []args){
//        Extend_00.A obj1 = new Extend_00.A();
//        Extend_00.A obj2 = new Extend_00.A(2);
//        Extend_00.A obj3 = new Extend_00.A(2,12);
        InfoHiding obj1 = new InfoHiding(1000);
        //obj1.setName(200);
        System.out.println(obj1.getName());


    }

}

class InfoHiding {
    private int name;

    public InfoHiding(int name1){
        name = name1;
    }
    public int getName(){
        return name;
    }
    public void setName(int name1){
        name = name1;
    }
}

