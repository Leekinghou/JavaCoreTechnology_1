package CornCompanySolution;

public class AMDCPU extends CPU{
    public AMDCPU(String name,int coreNum,double price){
        super(name,coreNum,price);
    }
    public void work(){
        System.out.println("This is AMD's CPU working");
    }
}
