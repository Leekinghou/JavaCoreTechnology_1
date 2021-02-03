package CornCompanySolution;

public class ComputerStore {
    public static void main(String []args){
        CPU intel = new IntelCPU("intel cpu",2,1000);
        Disk seagate = new Seagate("Seagate disk",1000,40960);

        Computer computer1 = new Computer("computer 1",intel,seagate);
        System.out.println("Computer 1 description: " + computer1.description());
        computer1.work();

        CPU amd = new AMDCPU("AMD CPU",800,2);
        Disk westdigital = new WestDigital("West Digital disk",2000,81920);

        Computer computer2 = new Computer("computer 2",amd,westdigital);
        System.out.println("computer 2 description: " + computer2.description());
        System.out.println("computer2 work:");
        computer2.work();

    }

}
