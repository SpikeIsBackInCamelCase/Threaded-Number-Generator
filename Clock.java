public class Clock {
    int time;
    public Clock(int timePerTick, String units){
        switch (units.toLowerCase()) {
            case "milliseconds":
                time = timePerTick;
                break;
            case "seconds":
                time = timePerTick*1000;
                break;
            case "minutes":
                time = timePerTick*60000;
                break;
            case "hours":
                time = timePerTick*3600000;
                break;
            default:
            time = timePerTick;
                break;
        }
        
    }
    public void tick(){
        try {
            Thread.sleep(time);
            }
            catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            }
    }
}