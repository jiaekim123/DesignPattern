package design.pattern.ch17.chain.basic;

public class ZeroProcessor extends Processor {
    public ZeroProcessor(String name) {
        super(name);
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println(name + ": " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}
