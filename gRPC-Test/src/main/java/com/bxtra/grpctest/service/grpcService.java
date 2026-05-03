package com.bxtra.grpctest.service;

import com.bxtra.grpctest.grpc.WorkflowServiceGrpc;
import com.bxtra.grpctest.grpc.workflowRequest;
import com.bxtra.grpctest.grpc.workflowResponse;
import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class grpcService extends WorkflowServiceGrpc.WorkflowServiceImplBase {

    @Override
    public void workflow(workflowRequest request, StreamObserver<workflowResponse> responseObserver) {
        workflowResponse response = workflowResponse.newBuilder().setWorkflowId(request.getWorkflowId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
