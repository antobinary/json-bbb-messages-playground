package org.bigbluebutton.common.messages;

import com.google.gson.JsonArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 05/04/16.
 */
public class Main {


    public static void main(String [ ] args){
        System.out.println("START");


        Boolean talking = false;
        Boolean voiceLocked = false;
        Boolean muted = false;
        Boolean joined = false;
        String callername = "some callername";
        String callernum = "some callernum";
        String webUserId = "somewebuserid";
        String voiceUserId = "somevoiceuserid";

        VoiceUser vu = new VoiceUser(callernum, webUserId, joined, talking, voiceLocked, muted,
                voiceUserId, callername);



        Map<String, Object> userMap = new HashMap<String, Object>();
        String userid = "someuserid";
        String username = "some user name";
        Boolean hasStream = false;
        Boolean listenOnly = true;
        String emojiStatus = "away???";
        Boolean phoneUser = false;
        Boolean presenter = false;
        Boolean locked = false;
        String extUserId = "exteruserid";
        String role = "MODERATOR";
        ArrayList<String> webcamStreams = new ArrayList<String>();



        WebUser wu = new WebUser(emojiStatus, extUserId, phoneUser, role, presenter, listenOnly,
                username, locked, userid, webcamStreams, vu, hasStream);

//        // round 1
//        UserJoinedMessage message1 = new UserJoinedMessage("sampleMeeting", wu);
//        RedisEventMessage msg = new RedisEventMessage("user_joineeeed", message1.toJson());
//        String string1 = msg.toJson();
//        System.out.println("message1 to json:" + string1);
//
//        // round 2
//        RedisEventMessage msg2 = RedisEventMessage.fromJson(string1);
////        System.out.println("msg2:" + msg2);
//
//        String string2 = msg2.toJson();
//        System.out.println("message2 to json:" + string2);


        UserJoinedMessage message1 = new UserJoinedMessage("sampleMeeting", wu);
        String string1 = message1.toJson();
        System.out.println("message1 to json:" + string1);


        UserJoinedMessage message2 = UserJoinedMessage.fromJson(string1);
        System.out.println("message2 id=" + message2.meeting_id);
        System.out.println("message2 id=" + message2.user.voiceUser.userId);
        String string2 = message2.toJson();
        System.out.println("message2 to json:" + string2);

    }

}
