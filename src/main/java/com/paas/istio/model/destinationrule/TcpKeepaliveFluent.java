package com.paas.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface TcpKeepaliveFluent<A extends TcpKeepaliveFluent<A>> extends Fluent<A> {


    A withProbes(Integer probes);

    Integer getProbes();

    A withTime(String time);

    String getTime();

    A withInterval(String interval);

    String getInterval();



}
