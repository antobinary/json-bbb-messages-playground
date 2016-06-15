package org.bigbluebutton.common.messages.objects;

import org.bigbluebutton.common.messages.ShapeTypes;

/**
 * Created by anton on 15/06/16.
 */
public class GenericShape {
    public ShapeTypes shapeType;

    public GenericShape (ShapeTypes type) {
        this.shapeType = type;

//        if (ShapeTypes.text == type ) {
//            return (TextShape) this;
//            System.out.println("shape obj here:" + t.text);
//            this.shape = t;
//        } else if (ShapeTypes.triangle == shape.shapeType ) {
//            InsideShape t = (InsideShape) shape;
//            System.out.println("shape obj here:" + t.thickness);
//            this.shape = t;
//        } else {
//            System.out.println("ELSE\n" + shape.shapeType);
//        }
//
//


    }
}
