package Homework2;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException (){
        super("array length exceeded");
    }
}
