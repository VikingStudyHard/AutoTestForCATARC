import cn.edu.tju.scs.seql.codeGenerator.CreateInitialClassFiles;

public class Main {

    public static void main(String[] args) {
        int index = 1;
        while(true){
            System.out.println("更新第"+index+"次");
            index++;
            CreateInitialClassFiles c = new CreateInitialClassFiles("final_ELV");
            c.createFiles();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }
        }
    }

}
