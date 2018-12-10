package com.ccb.springdemo.Capter1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jdlander on 2018/12/10.
 */
public class KnightMain {
    public static  void main(String [] args)throws Exception{
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("cfg/spring_config.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
