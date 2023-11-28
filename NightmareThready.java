public class NightmareThready{
    private String printer;
    private Clock timePerTick;
    private int iterations;
    NightmareThready(String whatToPrint, Clock tickSpeed, int howManyClones){
        printer = whatToPrint;
        timePerTick = tickSpeed;
        iterations = howManyClones;
    }
    NightmareThready(Clock tickSpeed, int howManyClones){
        timePerTick = tickSpeed;
        iterations = howManyClones;
    }
    public Threadole build(){
        return new Threadole(timePerTick, printer);
    }

    public void loopOverBuildStarter(String modification){
        printer = modification;
        for (int x = 0; x<iterations; x++){
            this.build().start();
        }
    }

    public void loopOverBuildStarter(char modeSelector){
        switch (modeSelector) {
            case 'n':
                for (int i = 0; i<10; i++){//numbers
                    this.loopOverBuildStarter(i+"");
                    if(Math.random()<.5){this.loopOverBuildStarter("\n");}
                }
                break;
            case 'v'://vowels
                String vowels = "aeiouy";
                for(int i = 0; i<5; i++){
                    this.loopOverBuildStarter(vowels.charAt(i%vowels.length()));
                    this.loopOverBuildStarter("\n");
                }
                vowels = null;
                break;
            case 'w':
                String alphabet = "abcdefghijklmnopqrstuvwxyz";
                for(int i = 0; i<5; i++){
                    this.loopOverBuildStarter(alphabet.charAt(i%alphabet.length()));
                    this.loopOverBuildStarter("\n");
                }
                alphabet = null;
                break;
            default:
                break;
        }
    }
}
class Threadole extends Thread{
    String printer;
    Clock timeTicker;
    public Threadole(Clock timeKeeper, String whatToPrint){
        timeTicker = timeKeeper;
        printer = whatToPrint;
    }
    @Override
    public void run(){
        while(true){
            System.out.print(printer);
            timeTicker.tick();
        }
    }
}