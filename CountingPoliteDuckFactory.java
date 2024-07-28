// 6510450399 Tibet Charoensripaiboon
// 6510450399 ทิเบต เจริญศรีไพบูลย์

public class CountingPoliteDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new PoliteDuck(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new PoliteDuck(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new PoliteDuck(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new PoliteDuck(new RubberDuck()));
    }
}
