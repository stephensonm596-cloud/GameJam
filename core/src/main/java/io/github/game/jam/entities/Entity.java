package io.github.game.jam.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class  Entity {
	private Texture texture;
	private Rectangle bounds;
	
	protected Vector2 dimension;
	protected Vector2 position;
	protected Vector2 velocity;
	
	
	protected final int BASE_DAMAGE = 10;
	protected final int BASE_HEALTH = 100;
	
	protected int health;
	
	public Entity(float posX, float posY, float width, float height,Texture texture) {
		position = new Vector2(posX,posY);
		velocity = new Vector2();
		dimension = new Vector2(width,height);
		this.texture = texture;
		this.bounds = new Rectangle(posX,posY,width,height);
		
		
	}
	
	abstract public void update();
	
	public void draw(SpriteBatch spriteBatch) {
		spriteBatch.draw(texture, position.x, position.y, dimension.x, dimension.y);
	};
	abstract public void die();

	public Rectangle getBounds() {
		return bounds;
	}

	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}

	public Vector2 getPosition() {
		return position;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}

	public Vector2 getVelocity() {
		return velocity;
	}

	public void setVelocity(Vector2 velocity) {
		this.velocity = velocity;
	}
	
	
	public boolean checkCollision(Entity e) {
		
		if(e.getBounds().overlaps(bounds)) {
			return false;
		}
		
		return true;
	}
	
	
}
