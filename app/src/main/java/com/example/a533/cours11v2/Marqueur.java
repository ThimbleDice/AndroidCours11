package com.example.a533.cours11v2;

import android.graphics.Bitmap;

public class Marqueur implements PlanViewDisplayable {
    private float positionX;
    private float positionY;
    private Bitmap marqueur;

    public Marqueur(Bitmap marqueur, float positionX, float positionY){
        this.marqueur = marqueur;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    @Override
    public float getPositionX() {
        return positionX;
    }

    @Override
    public float getPositionY() {
        return positionY;
    }

    @Override
    public float getWidth() {
        return marqueur.getWidth();
    }

    @Override
    public float getHeight() {
        return marqueur.getHeight();
    }

    @Override
    public Bitmap getBitmap() {
        return marqueur;
    }
}
