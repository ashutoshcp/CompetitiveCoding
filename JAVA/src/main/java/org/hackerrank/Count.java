package org.hackerrank;

import java.util.concurrent.CountDownLatch;

public class Count {
    private final CountDownLatch first = new CountDownLatch(1);
    private final CountDownLatch second = new CountDownLatch(1);
    void first(Runnable printFirst) {
        printFirst.run();
        first.countDown();
    }

    void second(Runnable printSecond) throws InterruptedException {
        first.await();
        printSecond.run();
        second.countDown();
    }

    void third(Runnable printThird) throws InterruptedException {
        second.await();
        printThird.run();
    }
}
