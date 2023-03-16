package org.example.seminar2.cw.task1;

public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
