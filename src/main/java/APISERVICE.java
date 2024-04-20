import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APISERVICE
{

    public FilmesDAT getFilme(String nome,String key)
    {
        FilmesDAT filme = new FilmesDAT();
        String i="";
        nome=nome.replaceAll(" ","+");
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.omdbapi.com/?apikey="+key+"&t="+nome)).build();
            HttpResponse <String> response= client.send(request,HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            filme = mapper.readValue(response.body(),FilmesDAT.class);
            filme.setTittle(nome);
        }catch (Exception e)
        {
            System.out.println(e.toString());
        }
        return filme;
    }

}
