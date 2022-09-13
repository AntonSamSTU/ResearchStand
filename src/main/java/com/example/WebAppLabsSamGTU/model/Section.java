package com.example.WebAppLabsSamGTU.model;


public class Section {


    private double peek_x;
    private double peek_y;
    private double width;
    private double high;
    private long startTime;
    private long endTime;

    public Section() {
    }

    public Section(double peek_x, double peek_y, double width, double high) {
        this.peek_x = peek_x;
        this.peek_y = peek_y;
        this.width = width;
        this.high = high;
    }

    public Section(double peek_x, double peek_y, double width, double high, long startTime, long endTime) {
        this.peek_x = peek_x;
        this.peek_y = peek_y;
        this.width = width;
        this.high = high;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public double getPeek_x() {
        return peek_x;
    }

    public void setPeek_x(double peek_x) {
        this.peek_x = peek_x;
    }

    public double getPeek_y() {
        return peek_y;
    }

    public void setPeek_y(double peek_y) {
        this.peek_y = peek_y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }


    @Override
    public String toString() {
        return "Section{peek_x=" + peek_x +
                ", peek_y=" + peek_y +
                ", width=" + width +
                ", high=" + high +
                '}';
    }
}
