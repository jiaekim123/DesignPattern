package design.pattern.ch17.chain.basic;

public class Chain {
    private final Processor chain;

    public Chain() {
        this.chain = buildProcessorChain();
    }

    private Processor buildProcessorChain() {
        Processor firstProcessor = new NegativeProcessor("음수 프로세서");
        Processor secondProcessor = new PositiveProcessor("양수 프로세서");
        Processor thirdProcessor = new ZeroProcessor("제로 프로세서");

        firstProcessor.setNext(secondProcessor);
        secondProcessor.setNext(thirdProcessor);
        return firstProcessor;
    }

    public void process(Number request) {
        chain.process(request);
    }
}
