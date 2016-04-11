package org.bigbluebutton.common.messages;

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


        UserJoinedMessage message1 = new UserJoinedMessage("sampleMeeting", wu);
        String string1 = message1.toJson();
        System.out.println("message1 to json:" + string1);


        UserJoinedMessage message2 = UserJoinedMessage.fromJson(string1);
        System.out.println("message2 id=" + message2.payload.meeting_id);
        System.out.println("message2 id=" + message2.payload.user.voiceUser.userId);
        String string2 = message2.toJson();
        System.out.println("message2 to json:" + string2);

    }

}
