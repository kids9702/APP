package com.example.demo.TestPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;

@RestController
public class SecondClass {
    private final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather";
    private final String apiKey = "107ae00c8ec9e7f2cb859c5e00342bc4"; // 발급받은 API key

    @RequestMapping("/weather")
    public OpenWeather getWeatherData() {
        StringBuilder urlBuilder = new StringBuilder(BASE_URL);
        try {
            urlBuilder.append("?" + URLEncoder.encode("q", "UTF-8") + "=Daegu");
            urlBuilder.append("&" + URLEncoder.encode("appid", "UTF-8") + "=" + apiKey);

            RestTemplate restTemplate = new RestTemplate();
            OpenWeather weather = restTemplate.getForObject(urlBuilder.toString(), OpenWeather.class);

            return weather;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
