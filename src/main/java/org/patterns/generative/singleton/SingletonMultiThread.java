package org.patterns.generative.singleton;


/**
 * Yes multi thread
 */
public class SingletonMultiThread {

    private SingletonMultiThread() {}

    private static class singletonHolder {
        public static final SingletonMultiThread SINGLETON_MULTI_THREAD = new SingletonMultiThread();
    }

    public static SingletonMultiThread singleton(){
        return singletonHolder.SINGLETON_MULTI_THREAD;
    }
}
