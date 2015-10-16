package com.ocji.bundle.service;

import com.ocji.bundle.model.ApplicationStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * Service for retrieving information about OVS status.
 */
@Service
public class BasicApplicationStatusService implements ApplicationStatusService {
    private static final Logger log = LoggerFactory.getLogger(BasicApplicationStatusService.class);
    private static final String STATUS_URL = "";
    @Autowired
    private RestTemplate restTemplate;

    public ApplicationStatus getApplicationStatus() {
        log.info("Sending request for retrieving status of application. Status URL : {}", STATUS_URL);
        //Commented until real URL will not retrieved
        //StatusResponseObject statusResponseObject = restTemplate.getForObject(STATUS_URL, StatusResponseObject.class);
        //ApplicationStatus status = ApplicationStatus.valueOf(statusResponseObject.getStatus());
        return ApplicationStatus.RUNNING;
    }
}
