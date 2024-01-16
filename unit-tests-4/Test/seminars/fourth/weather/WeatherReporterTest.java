package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {
    @Test
    void generateReportTest(){
        WeatherService weatherService = mock(WeatherService.class);
        when(weatherService.getCurrentTemperature()).thenReturn(25);
        WeatherReporter weatherReporter = new WeatherReporter(weatherService);

        String replay = weatherReporter.generateReport();
        assertThat(replay).isEqualTo("Текущая температура: " + 25 + " градусов.");
    }

}