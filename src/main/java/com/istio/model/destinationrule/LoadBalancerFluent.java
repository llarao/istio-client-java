package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface LoadBalancerFluent<A extends LoadBalancerFluent<A>> extends Fluent<A> {
    A withSimple(String simple);

    String getSimple();
}
