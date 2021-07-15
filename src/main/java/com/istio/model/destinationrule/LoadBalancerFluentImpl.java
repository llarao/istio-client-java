package com.istio.model.destinationrule;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class LoadBalancerFluentImpl<A extends LoadBalancerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements LoadBalancerFluent<A> {
    private String simple;

    LoadBalancerFluentImpl() {

    }

    LoadBalancerFluentImpl(LoadBalancer loadBalancer) {
        this.withSimple(loadBalancer.getSimple());
    }

    @Override
    public A withSimple(String simple) {

        this.simple = simple;
        return (A) this;
    }

    @Override
    public String getSimple() {
        return this.simple;
    }
}
