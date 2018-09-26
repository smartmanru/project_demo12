package ru.cbr.tomsk.multimodule.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.cbr.tomsk.multimodule.service.RestClient;

import java.net.URISyntaxException;

/**
 * @author 69NovoshintseAV@cbr.ru
 *
 * Контроллер
 */
@Controller
public class HomeController {

    /**
     * REST-клиент для обращения за данными к REST-сервису
     */
    private final RestClient restClient;

    /**
     * Конструктор для внедрения зависимостей
     * @param restClient , который внедряется
     */
    @Autowired
    public HomeController(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * Метод возвращает первого автора из репозитория "Автор" в случае GET-запроса на /
     * @param model Модель
     * @return первого автора из репозитория "Автор"
     * @throws URISyntaxException исключение в случае неверного URI
     */
    @RequestMapping("/")
    public final String getFirstAuthor(Model model) throws URISyntaxException {
        model.addAttribute("authors", restClient.getFirstAuthor());
        return "index";
    }
}
