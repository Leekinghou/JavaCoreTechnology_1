package FinalMethodSon_03;

public class FinalMethodFather {
    public final void f1(){

    }
}

class FinalMethodSon extends FinalMethodFather{
    //public void f1(){
        //因为父类的f1()是final
        //子类不可以改写父类的final方法

    //}
}
