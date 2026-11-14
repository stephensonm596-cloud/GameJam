package io.github.game.jam.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import io.github.game.jam.Assets;

public class Player extends Entity {
	
	public Player() {
		super(0,2, 1,1,Assets.manager.get("drop.png", Texture.class));
		
		
	}
	public Player(float posX, float posY, float width, float height, Texture texture) {
		super(posX, posY, width, height, texture);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		
		acceleration.setZero();
		
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
	        acceleration.x += 1;
	    }
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			acceleration.x -= 1;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			acceleration.y += 1;
		}
		
		velocity.mulAdd(acceleration,Gdx.graphics.getDeltaTime());
		position.mulAdd(velocity,Gdx.graphics.getDeltaTime());
		
	}
	
	
	
	public void damage(int damage) {
		this.health -= damage;
	}

	
	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
	

}
