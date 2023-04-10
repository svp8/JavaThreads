package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String[] names= {"Joey", "Chandler", "Phoebe", "Monica", "Rachel", "Ross"};
        Play play =new Play();
        for(int i=0;i<6;i++){
            new Person(names[i],play).start();
        }
    }
}
