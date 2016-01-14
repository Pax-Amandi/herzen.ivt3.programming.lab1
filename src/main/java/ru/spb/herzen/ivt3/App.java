package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hi, I am Varlamov Dmitry.\n" );
        RandomNameGenerator rand = new RandomNameGenerator(0);

        String name = rand.next();
        System.out.println( "Hello, " + name + "\n" );

        System.out.println( "List one" );
        for(int i=0; i<4; i++){
            name = rand.next();
            System.out.println( "Hello, " + name );
        }

        System.out.println( "\nList two" );
        for(int i=0; i<15; i++){
            name = rand.next();
            System.out.println( "Hello, " + name );
        }
    }
}