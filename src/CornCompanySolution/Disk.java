package CornCompanySolution;

public abstract class Disk extends Component implements Workable{
    /*
    单位：MB
     */

    protected int volume;

    public Disk(String name,double price,int volume){
        super(name,price);
        this.volume = volume;
    }

    @Override
    public String description(){
        StringBuilder diskDescBuilder = new StringBuilder();
        diskDescBuilder.append(super.description())
                .append(" size(MB):{")
                .append(volume)
                .append(" MB}");
        return diskDescBuilder.toString();
    }
}
