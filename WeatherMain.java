import java.util.Scanner;

public class  WeatherMain {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Temperature (°C): ");
        weather.temperature = input.nextDouble();
        System.out.println("Enter Humidity (%): ");
        weather.humidity = input.nextDouble();
        System.out.println("Enter Wind Speed (km/h): ");
        weather.windSpeed = input.nextDouble();
        System.out.println("Enter Precipitation (mm): ");
        weather.precipitation = input.nextDouble();
        System.out.println("Enter Visibility (km): ");
        weather.visibility = input.nextDouble();
        System.out.println("Enter Pressure (hPa): ");
        weather.pressure = input.nextDouble();
        System.out.println("Enter Forecast: ");
        weather.forecast = input.next();

        System.out.println("\nWeather Details:");
        System.out.println("Temperature: " + weather.temperature + "°C");
        System.out.println("Humidity: " + weather.humidity + "%");
        System.out.println("Wind Speed: " + weather.windSpeed + " km/h");
        System.out.println("Precipitation: " + weather.precipitation + " mm");
        System.out.println("Visibility: " + weather.visibility + " km");
        System.out.println("Pressure: " + weather.pressure + " hPa");
        System.out.println("Forecast: " + weather.forecast);
    }
}
