package design.pattern.ch17.chain.basic;

public class PositiveProcessor extends Processor {
    public PositiveProcessor(String name) {
        super(name);
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println(name + ": " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}
