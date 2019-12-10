public class DVDPlayer {
    boolean canRecord = false;

    void playDVD() {
        System.out.println("запускается DVD");
    }
    void recordDVD() {
        System.out.println("идет запись DVD");
    }
}
class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if(d.canRecord == true) {
            d.recordDVD();
        }
    }
}
