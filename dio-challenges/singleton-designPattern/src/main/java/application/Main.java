package application;

import singleton.EagerSingleton;
import singleton.LazyHolderSingleton;
import singleton.LazySingleton;
import strategy.*;

public class Main {
    public static void main(String[] args) {
//Singleton
//        LazySingleton lazy = LazySingleton.getInstance();
//        System.out.println(lazy);
//
//        EagerSingleton eager = EagerSingleton.getInstance();
//        System.out.println(eager);
//
//        LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstance();
//        System.out.println(lazyHolder);

//Strategy
        Behavior normal = new NormalBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior agressive = new AgressiveBehavior();

        Robot robot = new Robot();
        robot.setStrategy(normal);
        robot.move();

        robot.setStrategy(defensive);
        robot.move();

        robot.setStrategy(agressive);
        robot.move();



    }


}