package Pattern2;

public class ForecastDisplay implements Observer,DisplayElement {
    private float temperature=0;
    private float humidity=0;
    private float pressure=0;
    private Subject weatherData;
    private int count=0;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast Condition:"+temperature/count+"℉,"+humidity/count+"%,"+pressure/count+" pa");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature+=temp;
        this.humidity+=humidity;
        this.pressure+=pressure;
        count++;
        display();
    }
}
