package ru.cbr.tomsk.multimodule;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * dsfsd
 *
 * @author admin
 */
public class WebInitializer extends SpringBootServletInitializer {

    /**
     * dsg
     *
     * @param application
     * @return dsafds
     */
    @Override
    protected final SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Service2Application.class);
    }
}
