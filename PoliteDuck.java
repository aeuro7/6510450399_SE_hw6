// 6510450399 Tibet Charoensripaiboon
// 6510450399 ทิเบต เจริญศรีไพบูลย์

public class PoliteDuck implements Quackable{
    static int count = 0;
    Quackable duck;
    public PoliteDuck (Quackable duck) {
        this.duck = duck;
    }
    public void quack() {
        duck.quack();
        System.out.println(" ka");
        count++;
    }
    public static int getCount() {
        return count;
    }
}
