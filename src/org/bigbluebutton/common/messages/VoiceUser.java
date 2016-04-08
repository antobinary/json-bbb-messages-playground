package org.bigbluebutton.common.messages;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

import java.util.HashMap;

/**
 * Created by anton on 06/04/16.
 */
public class VoiceUser {
    public String callerNum;
    public String webUserId;
    public Boolean joined;
    public Boolean talking;
    public Boolean locked;
    public Boolean muted;
    public String userId;
    public String callerName;


    public VoiceUser (String callerNum, String webUserId, Boolean joined, Boolean talking,
                           Boolean locked, Boolean muted, String userId, String callerName) {
        this.callerNum = callerNum;
        this.webUserId = webUserId;
        this.joined = joined;
        this.talking = talking;
        this.locked = locked;
        this.muted = muted;
        this.userId = userId;
        this.callerName = callerName;
    }

//    public String toJson() {
//        System.out.println("______user voice user toJson_____");
//        ObjectMapper mapper = JsonFactory.create();
//
//        String json = mapper.writeValueAsString(this);
//        System.out.println("-------------json=" + json);
//        return json;
//    }

}
