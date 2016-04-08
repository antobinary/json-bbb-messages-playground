//package org.bigbluebutton.common.messages;
//
//import org.boon.json.JsonFactory;
//import org.boon.json.ObjectMapper;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by anton on 07/04/16.
// */
//public class RedisEventMessage {
////    public final Map<String, Object> header;
////    public final Map<String, Object> header;
////    public final Map<String, Object> payload;
//
//    public final UserJoinedMessage aa;
//
//    public RedisEventMessage(String eventName, String jsonPayload) {
//        this.header = new HashMap<>();
//        header.put("name", eventName);
//        header.put("timestamp", 1234);
//
//        this.payload = new HashMap<>();
//        ObjectMapper mapper = JsonFactory.create();
//        UserJoinedMessage obj = mapper.readValue(jsonPayload, UserJoinedMessage.class);
//        payload.put("meeting_id", obj.meeting_id);
////        payload.put("user", obj.user);
//        WebUser wu = obj.user;
//        payload.put("user", wu);
//    }
//    public RedisEventMessage() {
//        aa = new UserJoinedMessage();
//    }
//
//
//    public String toJson() {
////        System.out.println("______redis event message toJson_____");
//        ObjectMapper mapper = JsonFactory.create();
//        String json = mapper.writeValueAsString(this);
////        System.out.println("-------------json=" + json);
//        return json;
//    }
//
//    public static RedisEventMessage fromJson(String message) {
////        System.out.println("______redis event message fromJson_____" + message);
//        ObjectMapper mapper = JsonFactory.create();
//        RedisEventMessage obj = mapper.readValue(message, RedisEventMessage.class);
////        System.out.println("______obj=_____" + obj);
//        return obj;
//    }
//
//}
