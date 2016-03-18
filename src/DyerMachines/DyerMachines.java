package DyerMachines;

import Interface.DyerMachinesInterface;

/**
 * Created by Администратор on 18.03.2016.
 */
public abstract class DyerMachines implements DyerMachinesInterface {

    @Override
    public void run() {
        tearsOffTheOldPaint();
        paint();
        polishingWax();
    }

    @Override
    public void tearsOffTheOldPaint() {
        System.out.println("tearsOffTheOldPaint");
    }


    protected void paint() {

    }

    @Override
    public void polishingWax() {
        System.out.println("polishingWax");
    }
}
