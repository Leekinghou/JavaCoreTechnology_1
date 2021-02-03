package CornCompanySolution;

public class IntelCPU extends CPU{
    public IntelCPU(String name,int coreNum,double price){
        super(name,coreNum,price);
    }
    public void work(){
        System.out.println("This is Intel's CPU working");
    }
}