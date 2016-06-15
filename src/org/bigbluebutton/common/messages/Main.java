package org.bigbluebutton.common.messages;

import org.bigbluebutton.common.messages.objects.*;
import org.bigbluebutton.common.messages.ShapeTypes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String [ ] args){
        System.out.println("START");

        userJoin();

        //---------------------------------------

        drawTriangle();
        //---------------------------------------

        drawText();
    }

    public static void userJoin() {
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

    public static void drawTriangle() {
        System.out.println("Send whiteboard shape message");
        ShapeTypes shapeType = ShapeTypes.triangle;
        Double[] points = new Double[]{86.71893, 10.835914, 89.04181, 28.034056};
        int color = 0;
        Boolean transparency = false;
        ShapeStatus status = ShapeStatus.DRAW_END;
        String id = "exsvz5fe21om_1-11-1465933872806";
        int thickness = 1;
        String whiteboardId = "d2d9a672040fbde2a47a10bf6c37b6a4b5ae187f-1465933404463/1";

        InsideShape insideShape = new InsideShape(shapeType, points, color, transparency, status,
                id, thickness, whiteboardId);
        Shape shape = new Shape(insideShape.type, insideShape.whiteboardId, insideShape,
                insideShape.status, insideShape.id);

        String requesterId = "exsvz5fe21om_1";
        String meeting_id = "183f0bf3a0982a127bdb8161e0c44eb696b3e75c-1465933404389";
        SendWhiteboardShapeMessage wShape = new SendWhiteboardShapeMessage(meeting_id,
                requesterId, whiteboardId, shape);


        String wShapeJson = wShape.toJson();
        System.out.println("wShape to json:" + wShapeJson);

        SendWhiteboardShapeMessage wShapeExtracted = SendWhiteboardShapeMessage.fromJson
                (wShapeJson);
        System.out.println("wShapeExtracted id=" + wShapeExtracted.payload.meeting_id);
        System.out.println("wShapeExtracted shapeType=" + wShapeExtracted.payload.shape.shape_type);
        String wShapeJson2 = wShapeExtracted.toJson();
        System.out.println("wShapeExtracted to json:" + wShapeJson2);
    }

    public static void drawText() {
        System.out.println("Send whiteboard TEXT shape message");
        ShapeTypes shapeType = ShapeTypes.text;




        String text = "KKKKKKK\r";
        double textBoxHeight = 2.747678;
        ShapeTypes type = ShapeTypes.text;
        double textBoxWidth = 11.747968;
        int fontColor = 0;
        int fontSize = 18;
        double x = 84.52381;
        double y = 41.795666;
        double calcedFontSize = 11.747968;
        String dataPoints = "84.52381,41.795666";
        ShapeStatus status = ShapeStatus.textEdited;
        String whiteboard_id = "d2d9a672040fbde2a47a10bf6c37b6a4b5ae187f-1465933404463/1";
        String id = "exsvz5fe21om_1-12-1465939409241";

        TextShape textShape = new TextShape(text, textBoxHeight, type, textBoxWidth, fontColor,
                fontSize, x, y, calcedFontSize, dataPoints, status, whiteboard_id, id);

        Shape shape = new Shape(textShape.type, textShape.whiteboard_id, textShape,
                textShape.status, textShape.id);

        String requesterId = "exsvz5fe21om_1";
        String meeting_id = "183f0bf3a0982a127bdb8161e0c44eb696b3e75c-1465933404389";
        SendWhiteboardShapeMessage wShape = new SendWhiteboardShapeMessage(meeting_id,
                requesterId, whiteboard_id, shape);


        String wShapeJson = wShape.toJson();
        System.out.println("wShape to json:" + wShapeJson);

        SendWhiteboardShapeMessage wShapeExtracted = SendWhiteboardShapeMessage.fromJson
                (wShapeJson);
        System.out.println("wShapeExtracted id=" + wShapeExtracted.payload.meeting_id);
        System.out.println("wShapeExtracted shapeType=" + wShapeExtracted.payload.shape.shape_type);
        String wShapeJson2 = wShapeExtracted.toJson();
        System.out.println("wShapeExtracted to json:" + wShapeJson2);
    }
}
