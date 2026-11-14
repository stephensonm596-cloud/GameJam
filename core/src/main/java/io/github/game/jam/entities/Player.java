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
		
		velocity.setZero();
		
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
	        velocity.x += 1;
	    }
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			velocity.x -= 1;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			velocity.y += 1;
		}
		
		
		position.add(velocity);
		
		
	}
	
	public void draw(SpriteBatch batch) {
		batch
	}
	
	public void damage(int damage) {
		this.health -= damage;
	}

	
	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
	

}
