package com.example.WebAppLabsSamGTU.model;

import javax.persistence.*;

@Entity

@Table(name = "gazepoins")
public class Gazepoint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double x;
    private double y;
    private long time;

    public Gazepoint() {
    }

    public Gazepoint(double x, double y, long time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isGazepointInSection(Section section) {
        return time > section.getStartTime()
                && time < section.getEndTime()
                && x > section.getPeek_x()
                && x < section.getPeek_x() + section.getWidth()
                && y > section.getPeek_y()
                && y < section.getPeek_y() + section.getHigh();
    }

    public boolean isGazepointOutsideSection(Section section) {
        return time > section.getStartTime()
                && time < section.getEndTime()
                && ( x < section.getPeek_x()
                || x > section.getPeek_x() + section.getWidth()
                || y < section.getPeek_y()
                || y > section.getPeek_y() + section.getHigh() );
    }
}
