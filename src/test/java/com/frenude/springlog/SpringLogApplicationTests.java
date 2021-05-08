package com.frenude.springlog;

import com.frenude.springlog.appender.AdRequestAppender;
import com.frenude.springlog.appender.AdResponseAppender;
import com.frenude.springlog.appender.MainAppender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringLogApplicationTests {
    @Autowired
    private MainAppender mainAppender;
    @Autowired
    private AdRequestAppender adRequestAppender;
    @Autowired
    private AdResponseAppender adResponseAppender;

    @Test
    void contextLoads() {
        mainAppender.log();
        adRequestAppender.log();
        adResponseAppender.log();
    }

}
