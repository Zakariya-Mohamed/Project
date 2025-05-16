package com.me.zakariya.weatherwise;


public class ActivityRecommender {

  private WeatherService weather;
  
  public static String activity(WeatherService weather) {

    if (weather.getWeather() > 100.0 && weather.getWeather() <= 120.0) {
      return "There is a heatwave, be careful.";
    }
    if (weather.getWeather() > 70.0 && weather.getWeather() <= 100.0) {
      return "Go to the beach!";
    }

    if (weather.getWeather() > 50.0 && weather.getWeather() <= 70.0 ) {
      return "Visit a museum!";
    }

    if (weather.getWeather() <= 50.0 && weather.getWeather() > 32.0) {
      return "Wear a jacket!";
    }

    if (weather.getWeather() <= 32.0 && weather.getWeather() > 0) {
      return "Extreme cold, be careful.";
    }
    
    else {
      return "Extreme weather, stay inside";
    }
  }
}
