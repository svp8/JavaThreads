package org.example;

public class Play {
    private String[][] lines = {

            {"Joey", "Hey, hey."},
            {"Chandler", "Hey."},
            {"Phoebe", "Hey."},
            {"Chandler", "And this from the cry-for-help department. Are you wearing makeup?"},

            {"Joey", "Yes, I am. As of today, I am officially Joey Tribbiani, actor slash model."},

            {"Chandler", "That's so funny, ‘cause I was thinking you look more like Joey Tribbiani, man slash woman."},
            {"Phoebe", "What were you modeling for?"},

            {"Joey", "You know those posters for the City Free Clinic?"},

            {"Monica", "Oh, wow, so you're gonna be one of those \"healthy, healthy, healthy guys\""},
            {"Phoebe", "You know, the asthma guy was really cute."},

            {"Chandler", "Do you know which one you're gonna be?"},

            {"Joey", "No, but I hear lyme disease is open, so... (crosses fingers)"},

            {"Chandler", "Good luck, man. I hope you get it."},

            {"Joey", "Thanks."},
            {"Ross", "Thanks."},
            {"Rachel", "Thanks."}};

    private int currentLine = 0;

    public String[][] getLines() {
        return lines;
    }

    public int getCurrentLine() {
        return currentLine;
    }

    public void increaseCurrentLine() {
        this.currentLine += 1;
    }
}
