package io.github.game.jam.entities;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class EntityManager {

	
	private  ArrayList<Platform> entities;
	
	
	
	
	public EntityManager() {
		
		
	}
	
	
	public void draw(SpriteBatch batch) {
		
		for(Entity entity: entities) {
			
			entity.draw(batch);
			
		}
		
		
	}
	
	
	public void update() {
		
		for(Entity entity: entities) {
			
			entity.che
			
			
		}
		
	}
	
	
}
