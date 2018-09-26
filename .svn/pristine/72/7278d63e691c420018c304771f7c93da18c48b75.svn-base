package ru.cbr.tomsk.multimodule;

import lombok.extern.slf4j.Slf4j;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author 69TytarIA
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@Slf4j
public class Service2ApplicationTest {
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
    @Ignore
    @Test
    public void test02Web() {
        System.out.println("test02Web...");
        log.info("test02Web()...");
        String result = restTemplate.getForObject("http://localhost:"+port+"/",String.class);
        log.info("result: " + result);
        assertNotNull(result);
//        assertEquals("", result);
    }

}
