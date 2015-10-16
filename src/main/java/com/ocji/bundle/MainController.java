package com.ocji.bundle;

import com.ocji.bundle.model.ApplicationStatus;
import com.ocji.bundle.service.ApplicationControlService;
import com.ocji.bundle.service.ApplicationStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    private ApplicationStatusService applicationStatusService;

    @Autowired
    private ApplicationControlService applicationControlService;

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String getApplicationStatus(ModelMap model) {
        model.addAttribute("status", applicationStatusService.getApplicationStatus());
        return "main_page";
    }

    @RequestMapping(value = "/stop_application", method = RequestMethod.POST)
    public String applicationStop(ModelMap model) {
        applicationControlService.stopApplication();
        model.addAttribute("changes", "Status was changed to " + ApplicationStatus.STOPED);
        return "redirect:/status";
    }

    @RequestMapping(value = "/start_application", method = RequestMethod.POST)
    public String applicationStart(ModelMap model) {
        applicationControlService.startApplication();
        model.addAttribute("changes", "Status was changed to " + ApplicationStatus.RUNNING);
        return "redirect:/status";
    }
}