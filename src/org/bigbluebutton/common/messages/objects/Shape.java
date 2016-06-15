package org.bigbluebutton.common.messages.objects;

import org.bigbluebutton.common.messages.ShapeStatus;
import org.bigbluebutton.common.messages.ShapeTypes;

/**
 * Created by anton on 14/06/16.
 */
public class Shape {
    public ShapeTypes shape_type;
    public String wb_id; //TODO some of these are repeated in the object
    public GenericShape shape;
    public ShapeStatus status;
    public String id;


    public Shape (ShapeTypes shape_type, String wb_id, GenericShape shape, ShapeStatus status,
                  String id) {
        this.shape_type = shape_type;
        this.wb_id = wb_id;

        if (shape instanceof TextShape){
            TextShape t = (TextShape) shape;
            this.shape = t;
        } else if(shape instanceof InsideShape) {
            InsideShape t = (InsideShape) shape;
            this.shape = t;
        }

        this.status = status;
        this.id = id;
    }
}
