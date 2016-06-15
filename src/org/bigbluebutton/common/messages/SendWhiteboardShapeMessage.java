package org.bigbluebutton.common.messages;

import org.bigbluebutton.common.messages.objects.Shape;
import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;


public class SendWhiteboardShapeMessage extends RedisEventMessage {

    public static final String SEND_WHITEBOARD_SHAPE_MESSAGE = "send_whiteboard_shape_message";
    public final Payload payload;

    public SendWhiteboardShapeMessage(String meetingID, String requesterID, String whiteboardID,
                                      Shape shape) {
        super();
        header.name = this.SEND_WHITEBOARD_SHAPE_MESSAGE;
        header.timestamp = 1234;

        this.payload = new Payload();
        payload.meeting_id = meetingID;
        payload.requester_id = requesterID;
        payload.whiteboard_id = whiteboardID;
        payload.shape = shape;
    }

    public static SendWhiteboardShapeMessage fromJson(String message) {
        ObjectMapper mapper = JsonFactory.create();
        SendWhiteboardShapeMessage obj = mapper.readValue(message, SendWhiteboardShapeMessage.class);
        return obj;
    }

    public class Payload {
        public String meeting_id;
        public String requester_id;
        public String whiteboard_id;
        public Shape shape;
    }

}
