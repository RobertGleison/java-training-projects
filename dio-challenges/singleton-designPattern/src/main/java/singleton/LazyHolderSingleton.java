package singleton;

/**
 * "LazyHolder" Singleton
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Reference</a>
 * @author RobertGleison
 *
 */

public class LazyHolderSingleton {

    private static class InstanceHolder{
        public static LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {
    }

    public static LazyHolderSingleton getInstance(){
        return InstanceHolder.instance;
    }
}
