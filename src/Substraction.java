public class Substraction extends Processor{

    public Substraction(Processor processor) {
        super(processor);
    }
    public void process(Request request)
    {
        if (request.getOperator().equals("-"))
        {
           Double res = request.getNumber1()-request.getNumber2();
           request.setResult(res);
            System.out.println("Calculating result..");
        }
        else
        {
            super.process(request);
            System.out.println(" Sending to the next operator..");
        }
    }
}
