package com.ccb.springdemo.Capter1;

import com.ccb.springdemo.common.Quest;

import java.io.PrintStream;

/**
 * Created by jdlander on 2018/12/10.
 */
public class SlayDragonQuest implements Quest{
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.printf("Slay Dragon,GOGOGO!!");
    }
}
