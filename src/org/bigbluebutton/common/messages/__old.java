//package org.bigbluebutton.common.messages;
//
////import org.boon.json.JsonFactory;
////import org.boon.json.ObjectMapper;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//
//public class UserJoinedMessage {
//    public static final String USER_JOINED = "user_joined_message";
//    public final String VERSION = "0.0.1";
//
//    public final String meetingId;
//    public final Map<String, Object> user;
//
//    public UserJoinedMessage(String meetingID, Map<String, Object> user) {
//        this.meetingId = meetingID;
//        this.user = user;
//        System.out.println("______user joined message constructor_____");
//        System.out.println("meetingId=" + meetingID);
//        System.out.println("user=" + user.toString());
//    }
//
//    public String toJson() {
//        System.out.println("______user joined message toJson_____");
//        HashMap<String, Object> payload = new HashMap<String, Object>();
//        payload.put(Constants.MEETING_ID, meetingId);
//        payload.put(Constants.USER, user);
//
//        java.util.HashMap<String, Object> header = MessageBuilder.buildHeader(USER_JOINED, VERSION, null);
//
//        return MessageBuilder.buildJson(header, payload);
//    }
//    public static UserJoinedMessage fromJson(String message) {
//        System.out.println("______user joined message fromJson_____" + message);
////        ObjectMapper mapper = JsonFactory.create();
////        UserJoinedMessage obj = mapper.readValue(message, UserJoinedMessage.class);
////
////        return obj;
//
//
//
//        JsonParser parser = new JsonParser();
//        JsonObject obj = (JsonObject) parser.parse(message);
//
//        if (obj.has("header") && obj.has("payload")) {
//            JsonObject header = (JsonObject) obj.get("header");
//            JsonObject payload = (JsonObject) obj.get("payload");
//
//            if (header.has("name")) {
//                String messageName = header.get("name").getAsString();
//                if (USER_JOINED.equals(messageName)) {
//                    if (payload.has(Constants.MEETING_ID)
//                            && payload.has(Constants.USER)) {
//                        String meetingID = payload.get(Constants.MEETING_ID).getAsString();
//
//                        JsonObject user = (JsonObject) payload.get(Constants.USER);
//
//                        Util util = new Util();
//                        Map<String, Object> userMap = util.extractUser(user);
//
//                        if (userMap != null) {
//                            return new UserJoinedMessage(meetingID, userMap);
//                        }
//                    }
//                }
//            }
//        }
//
//        return null;
//    }
//}
//
//
////
////public static class PersonSerializer implements JsonSerializer<Person> {
////    public JsonElement serialize(final Person person, final Type type, final JsonSerializationContext context) {
////        JsonObject result = new JsonObject();
////        result.add("id", new JsonPrimitive(person.getId()));
////        result.add("name", new JsonPrimitive(person.getName()));
////        Person parent = person.getParent();
////        if (parent != null) {
////            result.add("parent", new JsonPrimitive(parent.getId()));
////        }
////        return result;
////    }
////}