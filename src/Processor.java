abstract class Processor {
    private Processor processor;

    public Processor(Processor processor){
        this.processor = processor;
    };

    public void process(Request request){

        if(processor != null)
            processor.process(request);
        System.out.println(" Sending to the next operator..");
    };
}
