public class Smartphone {
    // Composition:
    private Screen theScreen;
    private Case theCase;
    private Speaker theSpeaker;
    private Microphone theMicrophone;


    public Smartphone(Screen theScreen, Case theCase,
                      Speaker theSpeaker, Microphone theMicrophone) {
        this.theScreen = theScreen;
        this.theCase = theCase;
        this.theSpeaker = theSpeaker;
        this.theMicrophone = theMicrophone;
    }

    public Smartphone(int noPixels, int width, int length, int depth, int maxVolumeSpeaker,
                      int speakerCrtVol, int maxVolumeMicrophone, int microCrtVol) {
        this(noPixels,width,length,depth,maxVolumeSpeaker, maxVolumeMicrophone);
        theMicrophone.setCrtVolume(microCrtVol);
        theSpeaker.setCrtVolume(speakerCrtVol);

    }

    public Smartphone(int noPixels,int width,int length, int depth,int maxVolumeSpeaker,int maxVolumeMicrophone){
        this.theScreen=new Screen(noPixels, width, length, depth);
        this.theSpeaker=new Speaker(maxVolumeSpeaker);
        this.theMicrophone=new Microphone(maxVolumeMicrophone);
    }

    public void setPixel(int i,String color){
        this.theScreen.setPixel(i,color);
    }
    public void colorScreen(String color){
        this.theScreen.colorScreen(color);
    }
    public void increaseMicrophoneVolume(){
        this.theMicrophone.increaseVolume();
    }
    public void decreaseMicrophoneVolume(){
        this.theMicrophone.decreaseVolume();
    }
    public void muteMicrophone(){
        this.theMicrophone.muteMicrophone();
    }
    public void setSilenceMode(){
        this.theSpeaker.setSilenceMode();
    }



    public void pressPowerButton() {

        System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressPowerButton();
    }

    public void pressVolumeUp() {

        System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressVolumeUp();
        this.theSpeaker.increaseVolume();
    }

    public void pressVolumeDown() {
        System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressVolumeDown();
        this.theSpeaker.increaseVolume();
    }
}