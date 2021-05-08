package com.frenude.springlog.appender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: Frenude
 * @Description: //TODO
 * @Date: Created in 05 08,2021
 * @Modified By:
 **/
@Slf4j
@Service
public class MainAppender {
    public void log() {
        log.info("This is a main log");
    }
}
