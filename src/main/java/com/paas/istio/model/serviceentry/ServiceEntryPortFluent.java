package com.paas.istio.model.serviceentry;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceFluent
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public interface ServiceEntryPortFluent<A extends ServiceEntryPortFluent<A>> extends Fluent<A> {

    A withNumber(Integer number);
    Integer getNumber();

    A withName(String name);
    String getName();

    A withProtocol(String protocol);
    String getProtocol();
}
