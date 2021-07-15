package com.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecHttpRouteDestinationFluent
 * @Description TODO
 * @Date 2020/10/20 0020 16:53
 * @Create by llarao
 */
public interface SpecHttpRouteDestinationPortFluent<A extends SpecHttpRouteDestinationPortFluent<A>> extends Fluent<A> {
    Integer getNumber();

    A withNumber(Integer number);
}
