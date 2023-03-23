public class CurrencyConvertor {
    private double cuurrency;
    private String type;

    public CurrencyConvertor(double cuurrency, String type){
        this.cuurrency = cuurrency;
        this.type = type;
    }

    public CurrencyConvertor(){
    }

    public double getCuurrency() {
        return cuurrency;
    }

    public void setCuurrency(double cuurrency) {
        this.cuurrency = cuurrency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double BDTToDoll(){
        return cuurrency * 0.0093;
    }
    public double BDTToEuro(){
        return cuurrency * 0.00885553;
    }
    public double DollToBDT(){
        return cuurrency / 0.0093;
    }

    public double DollToEuro(){
        return cuurrency * 0.92;
    }

    public double EuroToBDT(){
        return cuurrency / 0.00885553;
    }

    public double EuroToDoll(){
        return cuurrency / 0.92;
    }
}
