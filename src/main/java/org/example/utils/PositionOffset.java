package org.example.utils;

import  com.raylib.* ;
public class PositionOffset
{
    private  Vector2 postionOffset  ;

    public void PositionOffset(Vector2 postionOffset)
    {
        this.postionOffset = new Vector2(postionOffset.getX() , postionOffset.y());
    }

    public void setOffset(Vector2 postionOffset)
    {
         this.postionOffset.setX(postionOffset.x() / 2 )  ;
         this.postionOffset.setY(postionOffset.y() / 2 );  ;
    }
    public Vector2 getPostionOffset()
    {
        return this.postionOffset ;
    }
}
