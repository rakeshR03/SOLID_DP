package designpattern.structural.flyingweight;

import java.util.HashMap;

public class BulletRegistry {
    private HashMap<BulletType, Bullet> bulletMap = new HashMap<BulletType, Bullet>();

    public void registerBullet(BulletType type, Bullet bullet){
        bulletMap.put(type, bullet);
    }

    public Bullet getBullet(BulletType type){
        return bulletMap.get(type);
    }
}
