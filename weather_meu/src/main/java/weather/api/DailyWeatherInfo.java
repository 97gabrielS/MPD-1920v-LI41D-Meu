package weather.api;

import java.time.LocalDate;

public class DailyWeatherInfo {
    final LocalDate date;
    final int tempMaxC;
    final int tempMinC;

    public DailyWeatherInfo(LocalDate date, int tempMaxC, int tempMinC) {
        this.date = date;
        this.tempMaxC = tempMaxC;
        this.tempMinC = tempMinC;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getTempMaxC() {
        return tempMaxC;
    }

    public int getTempMinC() {
        return tempMinC;
    }
}
