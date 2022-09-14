package org.suleiman.EmailService.Verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class EmailVerticle extends AbstractVerticle {

    @Autowired
    Vertx vertx;

    @PostConstruct
    void deployVerticle() {
        vertx.deployVerticle(this);
    }

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        super.start(startPromise);
    }
}
