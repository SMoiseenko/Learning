package by.moiseenko.utils;

import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUtils {
    private static final String WEATHER_BASE_CODE = "28800";
    private static final String API_KEY = "qxgnTnXdJgTgRGGNXHCOoAxDXazDQqqs";
    private static final String PARAM_API_KEY = "apikey";
//"http://dataservice.accuweather.com/forecasts/v1/daily/5day/28800?apikey=qxgnTnXdJgTgRGGNXHCOoAxDXazDQqqs&language=ru-Ru&details=true&metric=true"
    public static URL buildURL() throws MalformedURLException {

        

        return  new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/28800?apikey=qxgnTnXdJgTgRGGNXHCOoAxDXazDQqqs");
    }



}
