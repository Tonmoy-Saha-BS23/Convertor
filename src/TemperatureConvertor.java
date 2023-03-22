public class TemperatureConvertor {
    private double temperature;
    private String type;
    public TemperatureConvertor(double temperature, String type){
        this.temperature = temperature;
        this.type = type;
    }

    public TemperatureConvertor() {
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double CelToFar(){
        return ((9.0 / 5) * temperature) + 32;
    }
    public double CelToKel(){
        return temperature + 273.15;
    }
    public double KelToCel(){
        return temperature - 273.15;
    }

    public double KelToFar(){
        return (((temperature - 273.15) / 5.0) * 9) + 32;
    }

    public double FarToCel(){
        return ((temperature - 32) / 9.0) * 5;
    }

    public double FarToKel(){
        return (((temperature - 32) / 9.0) * 5) + 273;
    }
}
