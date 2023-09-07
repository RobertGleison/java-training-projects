package org.application;

/**
 * "Eager" Singleton
 *
 * @author RobertGleison
 */

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
