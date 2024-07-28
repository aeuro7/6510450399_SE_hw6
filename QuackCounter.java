// 6510450399 Tibet Charoensripaiboon
// 6510450399 ทิเบต เจริญศรีไพบูลย์

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
    public QuackCounter (Quackable duck) {
        this.duck = duck;
    }
    public void quack() {
        duck.quack();
//        System.out.println("count");
        numberOfQuacks++;
    }
    public static int getQuacks() {
        return numberOfQuacks;
    }

}