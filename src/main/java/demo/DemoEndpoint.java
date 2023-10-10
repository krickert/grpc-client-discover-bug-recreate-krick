package demo;

import io.grpc.stub.StreamObserver;
import jakarta.inject.Singleton;

@Singleton
public class DemoEndpoint extends DemoServiceGrpc.DemoServiceImplBase {


    @Override
    public void send(DemoRequest request, StreamObserver<DemoReply> responseObserver) {
        // (3)
        responseObserver.onNext(DemoReply.newBuilder().setMessage("it works, "+ request.getName()).build());
        responseObserver.onCompleted();

    }
}
