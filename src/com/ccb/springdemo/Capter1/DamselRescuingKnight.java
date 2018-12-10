package com.ccb.springdemo.Capter1;

import com.ccb.springdemo.common.RescueDamseQuest;

/**
 * Created by jdlander on 2018/12/10.
 */
public class DamselRescuingKnight {
    private RescueDamseQuest quest;

    public DamselRescuingKnight(){
        this.quest = new RescueDamseQuest();
    }
    public void embarkOnQuest(){
        quest.embark();
    }

}
