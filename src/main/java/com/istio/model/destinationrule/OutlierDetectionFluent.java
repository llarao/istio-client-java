package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface OutlierDetectionFluent<A extends OutlierDetectionFluent<A>> extends Fluent<A> {

    A withConsecutiveErrors(Integer item);

    Integer getConsecutiveErrors();

    A withInterval(String item);

    String getInterval();

    A withBaseEjectionTime(String item);

    String getBaseEjectionTime();

    A withMaxEjectionPercent(Integer item);

    Integer getMaxEjectionPercent();

    A withMinHealthPercent(Integer item);

    Integer getMinHealthPercent();
}
