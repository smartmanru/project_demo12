package ru.cbr.tomsk.multimodule.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.cbr.tomsk.multimodule.domain.Author;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author 69NovoshintseAV@cbr.ru
 *
 * REST-клиент для обращения к REST-сервису
 */
@Service
public class RestClient {

    /**
     * RestTemplate для обращения к REST-сервису
     */
    private final RestTemplate restTemplate = new RestTemplate();

    /**
     * URI, на котором работает REST-сервис
     */
    @Value("${service1.uri}")
    private String service1Uri;

    /**
     * Метод возвращает первого автора из репозитория сущностей "Автор"
     * @return сущность "Автор"
     * @throws URISyntaxException исключение неверного URI
     */
    public final Author getFirstAuthor() throws URISyntaxException {
        URI restServiceUri = new URI(this.service1Uri);
        return this.restTemplate.getForEntity(restServiceUri, Author.class).getBody();
    }
}
