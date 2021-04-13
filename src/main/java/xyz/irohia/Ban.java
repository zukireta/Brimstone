package xyz.irohia;

import java.util.Arrays;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Ban implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().startsWith("!ban")) {
            String[] slicedArgs = Arrays.copyOfRange(event.getMessageContent().split(" "),1,event.getMessageContent().split(" ").length);
            if(slicedArgs instanceof String[]){
                event.getServer().get().banUser(Long.parseLong(slicedArgs[0]));
            }
        }
    }
}
