public class Chain {
    Processor chain;

    public Chain(){
        buildChain();
    }

    private void buildChain(){
        chain = new Division(new Multiplication(new Addition(new Substraction(null))));
    }

    public void process(Request request) {
        chain.process(request);
    }
}
