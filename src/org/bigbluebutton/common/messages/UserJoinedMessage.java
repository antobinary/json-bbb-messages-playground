package org.bigbluebutton.common.messages;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

import java.util.HashMap;
import java.util.Map;


public class UserJoinedMessage {
    public static final String USER_JOINED = "user_joined_message";
    public final String VERSION = "0.0.1";

    public final String meeting_id;
    public final WebUser user; //this used to be type WebUser


    public UserJoinedMessage(String meetingID, WebUser user) {
        this.meeting_id = meetingID;
        this.user = user;
    }
    public String toJson() {
//        System.out.println("______user webuser toJson_____");
        ObjectMapper mapper = JsonFactory.create();
        String json = mapper.writeValueAsString(this);
//        System.out.println("-------------json=" + json);
        return json;
    }



        public static UserJoinedMessage fromJson(String message) {
        ObjectMapper mapper = JsonFactory.create();
//        String payloadMessage = extractPayload(message);
        UserJoinedMessage obj = mapper.readValue(message, UserJoinedMessage.class);
//        System.out.println("______obj=_____" + obj.user);
        return obj;
    }



//    public String toJson() {
//        System.out.println("______user joined message toJson_____");
////        HashMap<String, Object> payload = new HashMap<String, Object>();
////        payload.put(Constants.MEETING_ID, meeting_id);
////        payload.put(Constants.USER, user);
////
////        java.util.HashMap<String, Object> header = MessageBuilder.buildHeader(USER_JOINED, VERSION, null);
////
////        return MessageBuilder.buildJson(header, payload);
//
//        System.out.println("______user userjoined toJson_____");
//        ObjectMapper mapper = JsonFactory.create();
//
//        HashMap<String, Object> payload = new HashMap<String, Object>();
//        payload.put(Constants.MEETING_ID, meeting_id);
//        payload.put(Constants.USER, user);
//
//        java.util.HashMap<String, Object> header = MessageBuilder.buildHeader(USER_JOINED, VERSION, null);
//        HashMap<String, Object> bigMap = new HashMap<String, Object>();
//        bigMap.put("payload", payload);
//        bigMap.put("header", header);
//
//        String json = mapper.writeValueAsString(bigMap);
////        json = json.replace("\\", "");
//        System.out.println("-------------json=" + json);
//        return json;
//    }

//    public static UserJoinedMessage fromJson(String message) {
//        System.out.println("______user joined message fromJson_____" + message);
//        ObjectMapper mapper = JsonFactory.create();
////        String payloadMessage = extractPayload(message);
//        UserJoinedMessage obj = mapper.readValue(payloadMessage, UserJoinedMessage.class);
//        System.out.println("______obj=_____" + obj.user);
//        return obj;
//    }

//    private static String extractPayload(String s) {
//        System.out.println("s="+s);
//        ObjectMapper mapper = JsonFactory.create();
//        // json to obj
//        RedisMessage obj = mapper.readValue(s, RedisMessage.class);
//
//
//        // obj to json
//        String json = mapper.writeValueAsString(obj.payload);
//
//        System.out.println("payload="+json);
//        return json;
//    }
}
