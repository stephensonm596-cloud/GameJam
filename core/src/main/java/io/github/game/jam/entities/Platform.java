package io.github.game.jam.entities;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
public class Platform extends Entity{



	public Platform(float posX, float posY, float width, float height,Texture texture) {
		super(posX, posY,width,height,texture);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void draw(SpriteBatch spriteBatch) {
		super.draw(spriteBatch);
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
	
}
