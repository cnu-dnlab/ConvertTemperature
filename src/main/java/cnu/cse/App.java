package cnu.cse;

interface Temperature {
    
    double celsius = 0.0;
    double fahrenheit = 0.0;

    public double getCelsius();

    public double getFahrenheit();

    public void setCelsius(double celsius);

    public void setFahrenheit(double fahrenheit);
}


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "class Impl implements Temperature 구현" );
    }
}

// class Impl implements Temperature{

// }