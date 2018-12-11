package exceptions;

public class IntroException extends RuntimeException {
    public IntroException(int intro) {
        super("Intro must be greater than zero! current is " + intro);
    }
}

