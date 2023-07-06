package io.sn.mpisi2.controllers;

import io.sn.mpisi2.entities.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class NewHomeController {
    @RequestMapping("/{versionId}/message")
    public String getMessage(@PathVariable("versionId") String versionId,  Model model) {
        String message;

        switch (versionId){
            case "v1":
                message = "Welcome here !! This is the V1";
                break;
            case "v2":
                message = "Welcome here to new version! Enjoy! This is V2";
                break;
            default:
                message = "The version you specified is invalid! please specify v1 or v2";
        }
        model.addAttribute("message", new Message(message));
        return "index";
    }
}
