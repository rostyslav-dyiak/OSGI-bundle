package com.ocji.bundle.service;

import com.ocji.bundle.model.ApplicationStatus;

/**
 * Service for retrieving information about OVS status.
 */
public interface ApplicationStatusService {
    ApplicationStatus getApplicationStatus();
}
