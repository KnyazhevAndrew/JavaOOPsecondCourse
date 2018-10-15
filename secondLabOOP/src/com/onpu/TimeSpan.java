package com.onpu;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            System.out.println("Wrong time");
        }

        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            System.out.println("Wrong time");
        }
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes + this.hours * 60;
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || hours >= 24 || minutes < 0 || minutes >= 60) {
            System.out.println("Wrong time");
            return;
        }

        this.hours += hours;
        this.minutes += minutes;

        if (this.minutes > 60) {
            this.minutes -= 60;
            this.hours++;
        }
    }

    public void addTimeSpan(TimeSpan span) {
        this.hours += span.getHours();
        this.minutes += span.getMinutes() - span.getHours() * 60;

        if (this.minutes > 60) {
            this.minutes -= 60;
            this.hours++;
        }
    }

    public double getTotalHours() {

        return this.hours + this.minutes / 60;
    }

    public void substract(TimeSpan span) {
        if (span.hours > this.hours) {
            System.out.println("Time span is too big");
            return;
        }

        System.out.print(this.hours + " h " + this.minutes + " m - " + span.hours + " h " + span.minutes + " m = ");
        span.hours = this.hours - span.getHours();
        span.minutes = this.minutes - span.minutes;

        if (this.minutes < 0) {
            this.hours--;
            this.minutes += 60;
        }

        System.out.println(span.getHours()-1 + " h " + span.getMinutes() + " m");
    }

    public void scale(int factor) {
        System.out.print(this.hours + " h " + this.minutes + " m * " + factor + " = ");
        this.hours *= factor;
        this.minutes *= factor;

        if (this.minutes > 60) {
            do {
                this.minutes -= 60;
                this.hours++;
            }
            while (this.minutes > 60);
        }

        System.out.print(this.hours + " h " + this.minutes + " m");
    }

}


