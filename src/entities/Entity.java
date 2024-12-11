package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

public abstract class Entity {

    protected float x, y;
    // TODO: protected int width
    //  protected int height
    // TODO:  protected Rectangle2D.Float named hitbox

    public Entity(float x, float y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    protected void drawHitbox(Graphics g) {
        // TODO: set the hitbox color to pink with g.setColor(Color.PINK)
        // TODO: set the hitbox rectangle with g.drawRect((int) hitbox.x, (int) hitbox.y, (int) hitbox.width, (int) hitbox.height)
    }

    protected void initHitbox(float x, float y, int width, int height) {
        // TODO: initialize hitbox with hitbox = new Rectangle2D.FLOAT passing in the appropriate parameters.
    }

    public Rectangle2D.Float getHitbox() {
		 return hitbox;
    }

}