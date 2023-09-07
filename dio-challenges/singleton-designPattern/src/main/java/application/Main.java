package application;

import facade.Facade;
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
//        Behavior normal = new NormalBehavior();
//        Behavior defensive = new DefensiveBehavior();
//        Behavior agressive = new AgressiveBehavior();
//
//        Robot robot = new Robot();
//        robot.setStrategy(normal);
//        robot.move();
//
//        robot.setStrategy(defensive);
//        robot.move();
//
//        robot.setStrategy(agressive);
//        robot.move();

//Facade
        Facade facade = new Facade();
        facade.clientMigration("Robert","35661776");



    }


}