package com.frenude.springlog.appender;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * @Author: Frenude
 * @Description: //TODO
 * @Date: Created in 05 08,2021
 * @Modified By:
 **/
@Slf4j
@Service
public class AdRequestAppender {
    private static Logger adRequestLogger = LoggerFactory.getLogger("adRequest");

    public void log() {
        adRequestLogger.info("This is a adRequest log");
    }
}
