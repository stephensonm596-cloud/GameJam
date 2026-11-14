package io.github.game.jam;



import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

import io.github.game.jam.entities.Player;
import io.github.game.jam.world.World;

public class GameScreen implements Screen{
	
	Main game;
	World gameWorld;
	Texture backgroundTexture;
	
	SpriteBatch spriteBatch;
	FitViewport viewport;
	Player player;
	public GameScreen(Main game) {
		
		this.game = game;
		this.spriteBatch = game.getBatch();
		this.viewport = game.getViewport();
		Assets.load();
		Assets.manager.finishLoading();
		gameWorld = new World();
		player = new Player();
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		input();
		update(delta);
		draw();
		
	}
	private void input() {
		
	}
	private void update(float delta) {
		
	}
	private void draw() {
		ScreenUtils.clear(Color.BLACK);

		viewport.apply();
		spriteBatch.setProjectionMatrix(viewport.getCamera().combined);

		spriteBatch.begin();
		
		gameWorld.draw(spriteBatch);
		spriteBatch.end();

		
	}

	@Override
	public void resize(int width, int height) {
		viewport.update(width, height, true);
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	

}
