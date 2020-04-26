package com.adap;

import com.lendingFriend.PilotPen;

public class PenAdapter implements Pen {

    PilotPen pen = new PilotPen();

    @Override
    public void write(String str) {
        pen.mark(str);
    }
}
