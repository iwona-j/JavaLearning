package org.byern.javalearning.lesson15.ocp.bad.service;

import lombok.AllArgsConstructor;
import org.byern.javalearning.lesson15.ocp.bad.constant.MessageType;
import org.byern.javalearning.lesson15.ocp.bad.dto.Message;
import org.byern.javalearning.lesson15.ocp.bad.service.sender.SenderService;

/**
 * Created by krzyspo on 10/06/2017.
 */
@AllArgsConstructor
public class MessagingService {

    /*
     * Go to SenderService
     */

    private PersonalizationService personalizationService;
    private TranslationService translationService;
    private FooterService footerService;
    private HeaderService headerService;
    private SenderService senderService;


    public void sendMessage(Message message,
                            MessageType type){
        personalizationService.personalize(message);
        translationService.translate(message);
        footerService.addFooter(message);
        headerService.addHeader(message);
        senderService.sendViaSpecificRoute(message, type);
    }
}
