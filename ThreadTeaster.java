public class ThreadTeaster {
    public static long millies = 1;
    public static void main(String []args){
        Clock masterTicker = new Clock(1, "seconds");
        while(true){
            new NightmareThready(new Clock(20, "milliseconds"), 20).loopOverBuildStarter('n');
            masterTicker.tick();
            break;
        }
    }
}