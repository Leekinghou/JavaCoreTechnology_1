package CornCompanySolution;

public class Seagate extends Disk{
    public Seagate(String name,double price,int volume){
        super(name,price,volume);
    }
    public void work(){
        System.out.println("This is seagate's disk working");
    }
}
