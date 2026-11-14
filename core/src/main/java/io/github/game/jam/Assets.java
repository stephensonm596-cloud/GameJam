package io.github.game.jam;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

 public  class Assets {

    public static AssetManager manager =
        new AssetManager();

    public static void load() {

        manager.load(
            "bucket.png",
            Texture.class
            
        );

        manager.load(
            "drop.png",
            Texture.class
        );
        
        
        

    }
}