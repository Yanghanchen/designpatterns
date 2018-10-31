package Pattern2;

public class StatisticDisplay implements Observer,DisplayElement {
    private float temperature=0;
    private float humidity=0;
    private float pressure=0;
    private Subject weatherData;

    public StatisticDisplay(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Total Condition:"+temperature+"℉,"+humidity+"%,"+pressure+" pa");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature+=temp;
        this.humidity+=humidity;
        this.pressure+=pressure;
        display();
    }
}
