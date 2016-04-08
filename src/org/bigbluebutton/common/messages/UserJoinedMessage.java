package org.bigbluebutton.common.messages;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;


public class UserJoinedMessage {
    public static final String USER_JOINED = "user_joined_message";
    public final String VERSION = "0.0.1";

    public final Header header;
    public final Payload payload;

    public UserJoinedMessage(String meetingID, WebUser user) {
        this.header = new Header();
        header.name = this.USER_JOINED;
        header.timestamp = 1234;

        this.payload = new Payload();
        payload.meeting_id = meetingID;
        payload.user = user;
    }
    public String toJson() {
        ObjectMapper mapper = JsonFactory.create();
        return mapper.writeValueAsString(this);
    }

    public static UserJoinedMessage fromJson(String message) {
        ObjectMapper mapper = JsonFactory.create();
        UserJoinedMessage obj = mapper.readValue(message, UserJoinedMessage.class);
        return obj;
    }

    public class Header {
        public String name;
        public int timestamp;
    }

    private class Payload {
        public WebUser user;
        public String meeting_id;
    }

}
