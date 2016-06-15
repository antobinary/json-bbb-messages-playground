package org.bigbluebutton.common.messages.objects;

import org.bigbluebutton.common.messages.ShapeStatus;
import org.bigbluebutton.common.messages.ShapeTypes;

/**
 * Created by anton on 14/06/16.
 */
public class InsideShape extends GenericShape {

    public ShapeTypes type;
    public Double[] points;
    public int color;
    public Boolean transparency;
    public ShapeStatus status;
    public String id;
    public int thickness;
    public String whiteboardId;

    public InsideShape (ShapeTypes type, Double[] points, int color, Boolean transparency,
                        ShapeStatus status, String id, int thickness, String whiteboardId) {
        this.type = type;
        this.points =  points;
        this.color = color;
        this.transparency = transparency;
        this.status = status;
        this.id = id;
        this.thickness = thickness;
        this.whiteboardId = whiteboardId;
    }
}
