package org.example.utils;

import  com.raylib.* ;
public class PositionOffset
{
    private  Vector2 positionOffset  ;

    public  PositionOffset(Vector2 position)
    {
        this.positionOffset = new Vector2(position.getX() , position.y());
        this.positionOffset.setX(position.x() / 2 )  ;
        this.positionOffset.setY(position.y() / 2 );
    }

    public Vector2 getPositionOffset()
    {
        return this.positionOffset ;
    }
}
