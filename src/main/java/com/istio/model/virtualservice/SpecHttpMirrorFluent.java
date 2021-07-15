package com.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecHttpMirrorFluent
 * @Description TODO
 * @Date 2020/10/20 0020 16:09
 * @Create by llarao
 */
public interface SpecHttpMirrorFluent<A extends SpecHttpMirrorFluent<A>> extends Fluent<A> {
    String getHost();
    A setHost(String host);
    String getSubset();
    A setSubset(String subset);
}
