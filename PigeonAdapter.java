// 6510450399 Tibet Charoensripaiboon
// 6510450399 ทิเบต เจริญศรีไพบูลย์

public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
