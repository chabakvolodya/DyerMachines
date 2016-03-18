import DyerMachines.*;


/**
 * Created by Администратор on 18.03.2016.
 */
public class Runner {
    public static void main(String[] args) {

        new DyerMachinesWhite().run();

        System.out.println("//////////////////////////////////Two machines");

        new DyerMachinesRed().run();

        System.out.println("//////////////////////////////////Three machines");

        new DyerMachinesGreen().run();
    }
}
