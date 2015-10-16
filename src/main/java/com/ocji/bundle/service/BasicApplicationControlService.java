package com.ocji.bundle.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@Service
public class BasicApplicationControlService implements ApplicationControlService {
    private static final Logger log = LoggerFactory.getLogger(BasicApplicationControlService.class);
    private static final String START_URL = "/start";
    private static final String STOP_URL = "/stop";
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void startApplication() {
        log.info("Sending request to start application. Start URL : {}", START_URL);
        //Commented until real URL will not retrieved
        //StartResponseObject statusResponseObject = restTemplate.getForObject(START_URL, StartResponseObject.class);

    }

    @Override
    public void stopApplication() {
        log.info("Sending request to stop application. Start URL : {}", STOP_URL);
        //Commented until real URL will not retrieved
//        /StopResponseObject statusResponseObject = restTemplate.getForObject(STOP_URL, StopResponseObject.class);

    }
}
