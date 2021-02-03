package CornCompanySolution;

public class WestDigital extends Disk{
    public WestDigital(String name,double price,int volume){
        super(name,price,volume);
    }
    public void work(){
        System.out.println("This is WestDigital's disk working");
    }
}
