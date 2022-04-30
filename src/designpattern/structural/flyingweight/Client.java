package designpattern.structural.flyingweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static List<FlyingBullet> flyingBulletList = new ArrayList<>();

    public static void main(String[] args) {
        BulletRegistry bulletRegistry = new BulletRegistry();

        Bullet bullet = new Bullet();
        bullet.calliber = 5.56;
        bulletRegistry.registerBullet(BulletType.T5_56, bullet);

        bullet = new Bullet();
        bullet.calliber = 7.62;
        bulletRegistry.registerBullet(BulletType.T7_62, bullet);

        bullet = new Bullet();
        bullet.calliber = 9;
        bulletRegistry.registerBullet(BulletType.T9, bullet);

        for(int i=0; i<10; i++){
            FlyingBullet flyingBullet = new FlyingBullet(bulletRegistry.getBullet(BulletType.T5_56));
            flyingBulletList.add(flyingBullet);

        }

        System.out.println(flyingBulletList);
    }
}
