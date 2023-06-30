package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Player {
    public Vector2 position;
    public Sprite sprite;
    public float speed = 1000;

    public Player(Texture img)
    {
        sprite = new Sprite(img);
        position = new Vector2(Gdx.graphics.getWidth()/2, 0);
        sprite.setScale(1, 1);
    }

    public void Update(float deltaTime)
    {
        if(Gdx.input.isKeyPressed(Keys.A)) position.x  -= deltaTime*speed;
        if(Gdx.input.isKeyPressed(Keys.D)) position.x  += deltaTime*speed;
        if(Gdx.input.isKeyPressed(Keys.S)) position.y  -= deltaTime*speed;
        if(Gdx.input.isKeyPressed(Keys.W)) position.y  += deltaTime*speed;
    }

    public void Draw(SpriteBatch batch)
    {   
        Update(Gdx.graphics.getDeltaTime());
        sprite.setPosition(position.x, position.y);
        sprite.draw(batch);
    }
    
}