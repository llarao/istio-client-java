package com.paas.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface ConnectionHTTPFluent<A extends ConnectionHTTPFluent<A>> extends Fluent<A> {
    A withHttp1MaxPendingRequests(Integer i);

    Integer getHttp1MaxPendingRequests();

    A withHttp2MaxRequests(Integer i);

    Integer getHttp2MaxRequests();

    A withMaxRequestsPerConnection(Integer i);

    Integer getMaxRequestsPerConnection();

    A withMaxRetries(Integer i);

    Integer getMaxRetries();

    A withIdleTimeout(String i);

    String getIdleTimeout();

}
