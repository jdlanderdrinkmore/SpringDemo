package com.ccb.springdemo.Capter1;

import com.ccb.springdemo.common.Quest;

/**
 * Created by jdlander on 2018/12/10.
 */
public class BraveKnight implements Knight {

    private  Quest  quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
