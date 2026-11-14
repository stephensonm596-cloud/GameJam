package io.github.game.jam;

import java.util.ArrayList;

import io.github.game.jam.entities.Entity;

public class CollisionSystem {

    public void update(ArrayList<Entity> entities) {

        for (Entity entity : entities) {

            for (Entity other : entities) {

                if (entity == other) {
                    continue;
                }

                if (entity.getBounds().overlaps(
                        other.getBounds())) {

                    handleCollision(entity, other);
                }
            }
        }
    }

    private void handleCollision(
            Entity a, Entity b) {

        // Resolve collision
    }
}