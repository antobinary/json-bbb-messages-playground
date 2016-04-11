package org.bigbluebutton.common.messages;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;


public class UserJoinedMessage extends RedisEventMessage {

    public static final String USER_JOINED = "user_joined_message";
    public final Payload payload;

    public UserJoinedMessage(String meetingID, WebUser user) {
        super();
        header.name = this.USER_JOINED;
        header.timestamp = 1234;

        this.payload = new Payload();
        payload.meeting_id = meetingID;
        payload.user = user;
    }

    public static UserJoinedMessage fromJson(String message) {
        ObjectMapper mapper = JsonFactory.create();
        UserJoinedMessage obj = mapper.readValue(message, UserJoinedMessage.class);
        return obj;
    }

    public class Payload {
        public WebUser user;
        public String meeting_id;
    }

}
