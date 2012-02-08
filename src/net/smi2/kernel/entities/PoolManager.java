package net.smi2.kernel.entities;

/**
 * @author ask
 */
public class PoolManager {

    private final NewsPool newsPool = new NewsPool();

    public PoolManager() {
    }

    public NewsPool getNewsPool() {
        return newsPool;
    }
}
