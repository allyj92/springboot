package access;

public class SpeakerMain {
    public static void main(String[] args) {

        Speaker speaker = new Speaker(90);
        speaker.showVolumed();

        speaker.volumeUp();
        speaker.showVolumed();

        speaker.volumeUp();
        speaker.showVolumed();

//      필드에 직접 접근
        System.out.println("Volume 필드 직접 접근 수정");
//        speaker.volume = 200;
        speaker.showVolumed();
    }
}
