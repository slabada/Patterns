package org.patterns.generative.singleton;


/**
 * No multi thread
 */
public class Singleton {

    private static Singleton SINGLETON = new Singleton();

    private Singleton() {}

    public static Singleton getSINGLETON() {
        if(SINGLETON == null){
            SINGLETON = new Singleton();
        }
        return SINGLETON;
    }
}
