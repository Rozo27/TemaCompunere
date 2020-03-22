public class Speaker {
    private int maxVolume;
    private int crtVolume;
    public Speaker(int maxVolume){
        this.maxVolume=maxVolume;
        this.crtVolume=maxVolume/4;
    }
    public Speaker(int maxVolume,int crtVolume){
        this.maxVolume=maxVolume;
        this.crtVolume=crtVolume;
    }

    public boolean increaseVolume(){
        if(this.crtVolume<this.maxVolume){
            this.crtVolume++;
            return true;
        }
        return false;
    }
    public boolean decreaseVolume(){
        if(this.crtVolume>0) {
            this.crtVolume--;
            return true;
        }
        return false;
    }
    public void setSilenceMode(){
        if(this.crtVolume!=0)
            this.crtVolume=0;
    }
    public void setCrtVolume(int crtVolume) {
        if(crtVolume+this.crtVolume<this.maxVolume)
            this.crtVolume = crtVolume;
        else this.crtVolume=this.maxVolume;
    }
}
