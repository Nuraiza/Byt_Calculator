public class Request {
    private Double number1;
    private Double number2;
    private String operator;
    private Double result;

    public Request(String req)
    {
        String[] str = req.split(" ");
        this.number1 = Double.parseDouble(str[0]) ;
        this.operator = str[1];
        this.number2 = Double.parseDouble(str[2]);
    }

    public Double getNumber1() {
        return number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public String getOperator() {
        return operator;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Double getResult() {
        return result;
    }
}
