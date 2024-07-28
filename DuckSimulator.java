// 6510450399 Tibet Charoensripaiboon
// 6510450399 ทิเบต เจริญศรีไพบูลย์

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();

    }

    void simulate() {
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory countingPoliteDuckFactory = new CountingPoliteDuckFactory();

        Quackable mallardDuck2 = countingDuckFactory.createMallardDuck();
        Quackable redheadDuck2 = countingDuckFactory.createRedheadDuck();
        Quackable duckCall2 = countingDuckFactory.createDuckCall();
        Quackable rubberDuck2 = countingDuckFactory.createRubberDuck();

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck2);
        flockOfDucks.add(redheadDuck2);
        flockOfDucks.add(duckCall2);
        flockOfDucks.add(rubberDuck2);

        Quackable goose = new GooseAdapter(new Goose()); //normal goose
        Quackable pigeon = new PigeonAdapter(new Pigeon()); ////normal pigeon

        Flock flockOfGoosePigeon = new Flock();
        flockOfGoosePigeon.add(goose);
        flockOfGoosePigeon.add(pigeon);

        Quackable goose2 = new PoliteGoose(new GooseAdapter(new Goose())); // create PoliteGoose
        Quackable pigeon2 = new PoliteGoose(new PigeonAdapter(new Pigeon())); // create PolitePigeon

        Flock flockOfPoliteGoosePigeon = new Flock();
        flockOfPoliteGoosePigeon.add(goose2);
        flockOfPoliteGoosePigeon.add(pigeon2);

        Quackable mallardDuck = countingPoliteDuckFactory.createMallardDuck();
        Quackable redheadDuck = countingPoliteDuckFactory.createRedheadDuck();
        Quackable duckCall = countingPoliteDuckFactory.createDuckCall();
        Quackable rubberDuck = countingPoliteDuckFactory.createRubberDuck();

        Flock flockOfPoliteDucks = new Flock();
        flockOfPoliteDucks.add(mallardDuck);
        flockOfPoliteDucks.add(redheadDuck);
        flockOfPoliteDucks.add(duckCall);
        flockOfPoliteDucks.add(rubberDuck);


        System.out.println("\n--- Duck Simulator ---");

        simulate(flockOfDucks);

        System.out.println("\n----Polite Duck----");

        simulate(flockOfPoliteDucks);

        System.out.println("\n----Goose and Pigeon----");

        simulate(flockOfGoosePigeon);

        System.out.println("\n----Polite Goose and Pigeon----");

        simulate(flockOfPoliteGoosePigeon);

        System.out.println("\n----The Statistics----");

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
        System.out.println("The ducks politely quacked " + PoliteDuck.getCount() + " times"); //ไม่รวม goose & pigeon

        System.out.println("\n----END----");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
