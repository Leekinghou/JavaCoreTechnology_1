package Singleton_02;

public class Singleton {
    private static Singleton obj = new Singleton(); //共享一个对象

    private String content; //make sure that the constructor function only called in the class

    private Singleton()
    {
        this.content = "abc";
    }

    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }

    public static Singleton getInstance(){
        //静态方法使用静态变量
        //另外可以使用方法内的临时变量，但是不能引用非静态的成员变量
        return obj;
    }
    public static void main(String []args){
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.getContent()); //abc

        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1.getContent()); //abc

        obj2.setContent("def");
        System.out.println(obj1.getContent());
        System.out.println(obj2.getContent()); //abc

        System.out.println(obj1 == obj2); //abc
        //true obj1和obj2指向同一个
    }
}
