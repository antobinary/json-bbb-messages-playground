package org.bigbluebutton.common.messages;

import java.util.ArrayList;

/**
 * Created by anton on 06/04/16.
 */
public class WebUser {
    public String emojiStatus; //TODO make this enum
    public String externUserID;
    public Boolean phoneUser;
    public String role; //TODO make this enum or class or....
    public Boolean presenter;
    public Boolean listenOnly;
    public String name;
    public Boolean locked;
    public String userId;
    public ArrayList<String> webcamStream;
    public VoiceUser voiceUser;
    public Boolean hasStream;

    public WebUser(String emojiStatus, String externUserID, Boolean phoneUser, String role, Boolean
            presenter, Boolean listenOnly, String name, Boolean locked, String userId, ArrayList
                                webcamStream, VoiceUser voiceUser, Boolean hasStream) {
        this.emojiStatus = emojiStatus;
        this.externUserID = externUserID;
        this.phoneUser = phoneUser;
        this.role = role;
        this.presenter = presenter;
        this.listenOnly = listenOnly;
        this.name = name;
        this.locked = locked;
        this.userId = userId;
        this.webcamStream = webcamStream;
        this.voiceUser = voiceUser;
        this.hasStream = hasStream;
    }

}