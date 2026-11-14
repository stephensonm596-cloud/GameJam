package io.github.game.jam;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;


public class Main extends Game {
	
	public static final  float GAME_WIDTH = 80;
	public static final  float GAME_HEIGHT = 50;
	private SpriteBatch spriteBatch;
	private BitmapFont font;
	private FitViewport viewport;
	public GameScreen gameScreen;
	public void create() {
		spriteBatch = new SpriteBatch();
		// use libGDX's default font
		font = new BitmapFont();
		viewport = new FitViewport(GAME_WIDTH, GAME_HEIGHT);
		
		//font has 15pt, but we need to scale it to our viewport by ratio of viewport height to screen height 
		font.setUseIntegerPositions(false);
		font.getData().setScale(viewport.getWorldHeight() / Gdx.graphics.getHeight());
		
		gameScreen = new GameScreen(this);
		this.setScreen(gameScreen);
	}

	public void render() {
		/*ScreenUtils.clear(Color.BLACK);
	    viewport.apply();
	    spriteBatch.setProjectionMatrix(viewport.getCamera().combined);
	    spriteBatch.begin();

	    // store the worldWidth and worldHeight as local variables for brevity
	    float worldWidth = viewport.getWorldWidth();
	    float worldHeight = viewport.getWorldHeight();

	    spriteBatch.draw(backgroundTexture, 0, 0, worldWidth, worldHeight); // draw the background

	    spriteBatch.end();*/
		super.render(); // important!
	}

	public void dispose() {
		spriteBatch.dispose();
		font.dispose();
	}

	public BitmapFont getFont() {
		return font;
	}


	public SpriteBatch getBatch() {
		return spriteBatch;
	}

	public FitViewport getViewport() {
		return viewport;
	}

}
