package com.example.goandroid;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface SpeedTester extends Library {
    SpeedTester INSTANCE = Native.load("speedtester", SpeedTester.class);
    int Perform(String url);
}
