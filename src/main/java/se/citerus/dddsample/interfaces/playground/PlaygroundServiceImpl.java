package se.citerus.dddsample.interfaces.playground;

public class PlaygroundServiceImpl implements PlaygroundService {
    @Override
    public String echo(String messageToEcho) {
        return messageToEcho;
    }

    @Override
    public int multiplyByTwo(int numberToMultiplyByTwo) {
        return numberToMultiplyByTwo * 2;
    }
}
