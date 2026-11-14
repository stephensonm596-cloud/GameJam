package io.github.game.jam.entities;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import io.github.game.jam.GameScreen;

public class EntityManager {

	
	private  ArrayList<Entity> entities;
	private ArrayList<Monster> monsters; 
	private Player player;
	private GameScreen handler;
	
	
	
	public EntityManager(GameScreen handler) {
		
		this.handler = handler;
		this.player = new Player();
	}
	
	
	public void draw(SpriteBatch batch) {
		
		for(Entity entity: entities) {
			
			entity.draw(batch);
			
		}
		
		
	}
	
	
	public void update() {
		
		for(Monster entity: monsters) {
			
			for (Platform platform: handler.getWorld().getPlatforms()) {
				
				if(entity.checkCollision(platform)) {
					entity.velocity.scl(-1);
				}
					
			}
			
			if(entity.checkCollision(player)) {
				player.damage(entity.BASE_DAMAGE);
			}
			
		}
		
		
		for(Platform platform: handler.getWorld().getPlatforms()) {
			if(player.checkCollision(platform)) {
				player.velocity.scl(-1);
			}
		}
		
	}

	
	public void addEnemy(float x, float y, float width, float height, Texture texture) {
		monsters.add(new Monster(x, y, width, height, texture));
	}
	

	public ArrayList<Entity> getEntities() {
		return entities;
	}


	public ArrayList<Monster> getMonsters() {
		return monsters;
	}


	public Player getPlayer() {
		return player;
	}
	
	
	
	
}
