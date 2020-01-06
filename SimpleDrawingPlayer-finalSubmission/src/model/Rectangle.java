package model;

import sound.MidiSynth;

import java.awt.*;


public class Rectangle extends Shape {

    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft,midiSynth); //note to students: calls the other constructor!

    }

    @Override
    // EFFECTS: return true iff the given x value is within the bounds of the Shape
    public boolean containsX(int x){
        return (this.x <= x) && (x <= this.x + width);
    }

    @Override
    // EFFECTS: return true iff the given y value is within the bounds of the Shape
    public boolean containsY(int y) {
        return (this.y <= y) && (y <= this.y + height);
    }

    @Override
    // EFFECTS: return true if the given Point (x,y) is contained within the bounds of this Shape
    public boolean contains(Point point) {
        int point_x = point.x;
        int point_y = point.y;

        return containsX(point_x) && containsY(point_y);
    }

    @Override
    //EFFECTS: draws the shape
    public void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    //EFFECTS: fills the shape
    public void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }



}
