package assessment;

import java.util.concurrent.ConcurrentHashMap;

public class UrlShortener {

    private static final String BASE_URL = "baseURL";
    private static final ConcurrentHashMap<String, String> URL_MAP = new ConcurrentHashMap<>();


    public String getShortUrl(String longUrl, String seoKeyword) {
        //validate input

        if (URL_MAP.containsKey(seoKeyword))
            throw new RuntimeException("This keyword has already been used");
        URL_MAP.put(seoKeyword, longUrl);
        return BASE_URL + seoKeyword;
    }

    public String getLongUrl(String seoKeyword) {
        if (!URL_MAP.containsKey(seoKeyword))
            throw new RuntimeException("This URL wasn't shortened");
        return URL_MAP.get(seoKeyword);
    }
}
