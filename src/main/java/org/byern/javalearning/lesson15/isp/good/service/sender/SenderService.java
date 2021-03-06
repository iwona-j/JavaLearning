package org.byern.javalearning.lesson15.isp.good.service.sender;

import org.byern.javalearning.lesson15.isp.good.api.constant.MessageType;
import org.byern.javalearning.lesson15.isp.good.api.dto.EmailMessage;
import org.byern.javalearning.lesson15.isp.good.api.dto.Message;
import org.byern.javalearning.lesson15.isp.good.api.dto.SmsMessage;

/**
 * Created by krzyspo on 10/06/2017.
 */
public class SenderService {

    private EmailSender emailSender;
    private SmsSender smsSender;

    /*
     * In this bad example, if we add another route
     * of message sending, we will have to modify
     * the base impl. This class should be closed
     * for modification but open open for extensions.
     *
     */

    public void sendViaSpecificRoute(Message message,
                                     MessageType type) {
        if(type == MessageType.EMAIL){
            emailSender.send((EmailMessage) message);
        } else if(type == MessageType.SMS){
            smsSender.send((SmsMessage) message);
        }
    }
}
