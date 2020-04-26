package com.adap;

import com.lendingFriend.PilotPen;

public class School {

    public static void main(String[] args) {
//        As we only have Pen interface, we cannot set our Pen to Pen object
//        If we did not use an Adapter, we would try to directly instantiate a PilotPen instance (i.e. borrow a friend's Pen)
//        PilotPen pen = new PilotPen();
        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("I'm a bit tired to work on this assignment");
    }
}
