package com.paas.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecHttpRewriteFluent
 * @Description TODO
 * @Date 2020/10/20 0020 16:02
 * @Create by llarao
 */
public interface SpecHttpRetriesFluent<A extends SpecHttpRetriesFluent<A>> extends Fluent<A> {
    String getAttempts();
    A setAttempts(String item);
    String getPerTryTimeout();
    A setPerTryTimeout(String item);
    String getRetryOn();
    A setRetryOn(String item);
}
