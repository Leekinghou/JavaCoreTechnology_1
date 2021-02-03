package CornCompanySolution;

public class Computer extends Component implements Workable{
    private CPU cpu;
    private Disk disk;

    public Computer(String name,CPU cpu,Disk disk){
        super(name,-1);
        this.cpu = cpu;
        this.disk = disk;
        super.setPrice(cpu.getPrice()+disk.getPrice());

    }

    @Override
    public void work() {
        cpu.work();
        disk.work();
    }

    public String description(){
        StringBuilder cmputerDescBuilder = new StringBuilder();

        cmputerDescBuilder.append(super.description())
                .append("CPU description:{")
                .append(cpu.description())
                .append("}")
                .append(";Disk description")
                .append("}");
        return cmputerDescBuilder.toString();
    }
}
