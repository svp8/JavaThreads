package org.example;

public class Person extends Thread{
    private final String name;
    private final Play play;
    public Person(String name,Play play){
        this.name=name;
        this.play=play;
    }

    @Override
    public void run() {
        System.out.println("start working");
        String[][] lines= play.getLines();
        synchronized (play){
            while (play.getCurrentLine()< lines.length){
                if(lines[play.getCurrentLine()][0].equals(this.name)){
                    System.out.println(name+": "+ lines[play.getCurrentLine()][1]);
                    play.increaseCurrentLine();
                    play.notifyAll();
                }
                try {
                    play.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            play.notifyAll();
        }
    }


}
