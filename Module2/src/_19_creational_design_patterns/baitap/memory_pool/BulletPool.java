package _19_creational_design_patterns.baitap.memory_pool;

public class BulletPool extends MemoryPool{
    @Override
    protected Object allocate() {
        return new Bullet();
    }
}
