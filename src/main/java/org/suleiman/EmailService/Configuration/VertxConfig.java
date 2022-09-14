package org.suleiman.EmailService.Configuration;

import io.vertx.core.Vertx;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VertxConfig {
    Vertx vertx() {
    Vertx vertx = Vertx.vertx();
    return vertx;
    }
}
