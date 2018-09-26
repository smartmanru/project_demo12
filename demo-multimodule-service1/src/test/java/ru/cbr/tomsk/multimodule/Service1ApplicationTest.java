package ru.cbr.tomsk.multimodule;

import lombok.extern.slf4j.Slf4j;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import ru.cbr.tomsk.multimodule.domain.Author;

/**
 *
 * @author 69TytarIA
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@Slf4j
public class Service1ApplicationTest {
    @LocalServerPort
    private int port;
    
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test01LoadContext() {
        System.out.println("test01LoadContext...");
        log.info("test01LoadContext()...");
    }
    
    /**
     * Test of index method, of class BookServiceController.
     */
    @Test
    public void test02RestJpa() {
        System.out.println("test02RestJpa...");
        log.info("test02RestJpa()...");
        String url = "http://localhost:"+port+"/api/authors/1";
        log.info("url: " +url);
        Author result = restTemplate.getForEntity(url, Author.class).getBody();
        log.info("result: "+result);

        assertNotNull(result);
        assertEquals("Александр", result.getFirstName());
        assertEquals("Пушкин", result.getLastName());
    }

}
