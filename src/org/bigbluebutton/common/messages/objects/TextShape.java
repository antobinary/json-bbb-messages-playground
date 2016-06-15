package org.bigbluebutton.common.messages.objects;

import org.bigbluebutton.common.messages.ShapeStatus;
import org.bigbluebutton.common.messages.ShapeTypes;
/**
 * Created by anton on 15/06/16.
 */
public class TextShape extends GenericShape {
    public String text;
    public double textBoxHeight;
    public ShapeTypes type;
    public double textBoxWidth;
    public int fontColor;
    public int fontSize;
    public double x;
    public double y;
    public double calcedFontSize;
    public String dataPoints; //TODO why is this not double[]?
    public ShapeStatus status;
    public String whiteboard_id; //TODO to be removed
    public String id;

    public TextShape (String text, double textBoxHeight, ShapeTypes type, double textBoxWidth,
                      int fontColor, int fontSize, double x, double y, double calcedFontSize,
                      String dataPoints, ShapeStatus status, String whiteboard_id, String id) {
        this.text = text;
        this.textBoxHeight = textBoxHeight;
        this.type = type;
        this.textBoxWidth = textBoxWidth;
        this.fontColor = fontColor;
        this.fontSize = fontSize;
        this.x = x;
        this.y = y;
        this.calcedFontSize = calcedFontSize;
        this.dataPoints = dataPoints;
        this.status = status;
        this.whiteboard_id = whiteboard_id;
        this.id = id;
    }
}
