package javaConfig;

import com.ccb.springdemo.Capter1.BraveKnight;
import com.ccb.springdemo.Capter1.Knight;
import com.ccb.springdemo.Capter1.SlayDragonQuest;
import com.ccb.springdemo.common.Quest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jdlander on 2018/12/10.
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
