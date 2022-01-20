package hackerrun;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GetArticlesTitles {

    public List<String> getArticleTitlesWithPagination(String author) {
        List<String> result = new ArrayList<>();
        boolean keepGoing = true;
        int page = 1;
        while (keepGoing) {
            try {
                String URL = "https://jsonmock.hackerrank.com/api/articles?author=" + author + "&page=" + page;
                java.net.URL url = new URL(URL);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");

                con.connect();

                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();

                JsonObject response = new JsonParser().parse(content.toString()).getAsJsonObject();
                for (JsonElement data : response.getAsJsonArray("data")) {
                    JsonObject d = data.getAsJsonObject();
                    if (!d.get("title").isJsonNull()) {
                        result.add(d.get("title").getAsString());
                        continue;
                    }
                    if (!d.get("story_title").isJsonNull()) {
                        result.add(d.get("story_title").getAsString());
                        continue;
                    }
                }

                if (response.get("total_pages").getAsInt() == response.get("page").getAsInt()) {
                    keepGoing = false;
                }
                page++;
            } catch (Exception e) {

            }
        }
        return result;
    }
}
