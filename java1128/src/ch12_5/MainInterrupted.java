package ch12_5;

public class MainInterrupted {

    public static void main(String[] args) {
        InterruptedExceptionTest interrupted = new InterruptedExceptionTest();

        interrupted.printDelay();
    }
}