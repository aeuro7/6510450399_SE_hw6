// 6510450399 Tibet Charoensripaiboon
// 6510450399 ทิเบต เจริญศรีไพบูลย์

public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }
    public Quackable createDuckCall() {
        return new DuckCall();
    }
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}