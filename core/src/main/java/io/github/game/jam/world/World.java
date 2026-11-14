package io.github.game.jam.world;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import io.github.game.jam.Assets;
import io.github.game.jam.CollisionSystem;
import io.github.game.jam.entities.Platform;

public class World {
	
	final int platformCount = 1;
	private  ArrayList<Platform> platforms;
	
	public World() {
		platforms = new ArrayList<Platform>();
		createPlatforms();
	}
	private void createPlatforms() {

        Texture grass = Assets.manager.get(
            "bucket.png",
            Texture.class
        );

        Texture stone = Assets.manager.get(
            "drop.png",
            Texture.class
        );

        platforms.add(
            new Platform(0, 1, 8, 1, grass)
        );
	}
	public void update() {
		
	}
	public void draw(SpriteBatch spriteBatch) {
		for( Platform platform: platforms) {
			platform.draw(spriteBatch);
		}
	}
}
