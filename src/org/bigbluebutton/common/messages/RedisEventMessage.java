package org.bigbluebutton.common.messages;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

/**
 * Created by anton on 07/04/16.
 */
public abstract class RedisEventMessage {

    public final Header header;

    public RedisEventMessage() {
        this.header = new Header();
    }

    public String toJson() {
        ObjectMapper mapper = JsonFactory.create();
        return mapper.writeValueAsString(this);
    }

    public class Header {
        public String name;
        public int timestamp;
        public String version = "0.0.1"; // can be overridden
    }

}
