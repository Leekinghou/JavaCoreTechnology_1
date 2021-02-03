package accessPermission_08;
//B和A在同一个包里
public class B {
    public void show(){
        A obj = new A();
        //System.out.println(obj.v1); //error ,private
        System.out.println(obj.v2);
        System.out.println(obj.v3);
        System.out.println(obj.v4);
        //obj.showV1();//error
        //showV2(); //error
        //showV3(); //error
        // showV4();//error
        //obj.showV1();//error ,private
        obj.showV2();
        obj.showV3();
        obj.showV4();
    }
}
