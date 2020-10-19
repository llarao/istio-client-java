package com.paas.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecHttpMatchConditionFluent
 * @Description TODO
 * @Date 2020/10/20 0020 17:56
 * @Create by llarao
 */
public interface SpecHttpMatchConditionFluent<A extends SpecHttpMatchConditionFluent<A>> extends Fluent<A> {
    String getExact();
    A withExact(String item);
    String getPrefix();
    A withPrefix(String item);
    String getRegex();
    A withRegex(String item);
}
