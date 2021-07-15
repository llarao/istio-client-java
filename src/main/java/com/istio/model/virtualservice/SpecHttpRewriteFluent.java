package com.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecHttpRewriteFluent
 * @Description TODO
 * @Date 2020/10/20 0020 16:02
 * @Create by llarao
 */
public interface SpecHttpRewriteFluent<A extends SpecHttpRewriteFluent<A>> extends Fluent<A> {
    A setUri(String item);
    String getUri();
}
