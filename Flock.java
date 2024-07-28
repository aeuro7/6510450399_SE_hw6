// 6510450399 Tibet Charoensripaiboon
// 6510450399 ทิเบต เจริญศรีไพบูลย์

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        int i = 1 ;
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            if (i == 1) {
                Quackable quacker = (Quackable)iterator.next();
                System.out.println("***The leader***");
                quacker.quack();
                quacker.quack();
                quacker.quack();
                System.out.println();
                i--;
            }
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }
}