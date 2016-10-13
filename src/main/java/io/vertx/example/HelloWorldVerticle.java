package io.vertx.example;

/**
 * Created by AXIOORNWC on 10/13/2016.
 */
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class HelloWorldVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(req -> req.response().end("Hello World, diancp!"))
                .listen(
                        Integer.getInteger("http.port"), System.getProperty("http.address", "0.0.0.0"));
    }
}