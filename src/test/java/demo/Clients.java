package demo;

import io.grpc.ManagedChannel;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.grpc.annotation.GrpcChannel;

@Factory
class Clients {

    @Bean
    DemoServiceGrpc.DemoServiceBlockingStub blockingStub(
            @GrpcChannel("demo") ManagedChannel channel) {
        return DemoServiceGrpc.newBlockingStub(
                channel
        );
    }
}
