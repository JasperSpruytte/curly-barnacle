package be.jasperspruytte.zeticon.assignment.assignment.mediahaven;

import be.jasperspruytte.zeticon.assignment.assignment.model.Product;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

public class MediaHavenProductService {

    private RestTemplate restTemplate;

    public MediaHavenProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString("https://integration.mediahaven.com/mediahaven-rest-api/resources/media/")
                .queryParam("q", "+(MediaObjectFragmentKeywordsKeyword:\"product-assignment\")");
        MediaHavenQueryResult result = restTemplate.getForObject(uriComponentsBuilder.toUriString(), MediaHavenQueryResult.class);
        return products;
    }
}
