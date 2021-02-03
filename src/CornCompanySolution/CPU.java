package CornCompanySolution;

public abstract class CPU extends Component implements Workable{
    protected int coreNum;

    public CPU(String name,int coreNum,double price){
        super(name,price);
        this.coreNum = coreNum;
    }

    @Override
    public String description(){
        StringBuilder cpuDescBuilder = new StringBuilder();
        cpuDescBuilder.append(super.description())
                .append(" Core Num:{")
                .append(coreNum)
                .append("}");
        return cpuDescBuilder.toString();
    }
}
