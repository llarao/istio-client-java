package com.paas.istio.model.gateway;

import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;

/**
 * @Classname VirtualServiceFluent
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public interface GatewayPortFluent<A extends GatewayPortFluent<A>> extends Fluent<A> {

    A withNumber(Integer number);
    Integer getNumber();

    A withName(String name);
    String getName();

    A withProtocol(String protocol);
    String getProtocol();
}
