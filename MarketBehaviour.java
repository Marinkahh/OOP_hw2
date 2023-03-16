package org.example.seminar2.cw.task1;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket (Buyer actor);
    void update();
}
