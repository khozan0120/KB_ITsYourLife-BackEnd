package basic.ch08.sec04;

public class Audio implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Audio를 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    private  int volume;

    @Override
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME){
            System.out.println("Volume  : " + MAX_VOLUME);
        } else if(volume < MIN_VOLUME){
            System.out.println("Volume : " + MIN_VOLUME);
        }
        System.out.println("현재 Audio 볼륨 : " + volume);
    }
}
