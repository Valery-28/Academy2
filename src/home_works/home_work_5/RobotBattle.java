package home_works.home_work_5;

public class RobotBattle {
    private static final int TOTAL_ROBOTS = 20;

    public static void main(String[] args) throws InterruptedException {
        Runnable factoryTask = () -> Utils.call(RobotWar::factory);
        Runnable eastasiaTask = () -> Utils.call(RobotWar::eastasia);
        Runnable oceaniaTask = () -> Utils.call(RobotWar::oceania);
        Runnable eurasiaTask = () -> Utils.call(RobotWar::eurasia);

        Thread factory = new Thread(factoryTask);
        Thread eastasia = new Thread(eastasiaTask);
        Thread eurasia = new Thread(eurasiaTask);
        Thread oceania = new Thread(oceaniaTask);

        factory.start();
        oceania.start();
        eastasia.start();
        eurasia.start();

        oceania.join();
        factory.join();
        eastasia.join();
        eurasia.join();
    }
}

