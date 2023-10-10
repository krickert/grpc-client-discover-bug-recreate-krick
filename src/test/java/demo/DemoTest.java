package demo;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class DemoTest {

    @Inject
    DemoServiceGrpc.DemoServiceBlockingStub stub;


    @Test
    void testDemoGrpc() {
        stub.send(DemoRequest.newBuilder().setName("micronaut-tester").build());
    }
}
