package com.istio.model.virtualservice;

/**
 * @Classname VirtualServiceSpecHttpRouteDestinationFluent
 * @Description TODO
 * @Date 2020/10/20 0020 16:53
 * @Create by llarao
 */
public class SpecHttpRouteDestinationPortFluentImpl<A extends SpecHttpRouteDestinationPortFluent<A>>
        extends io.fabric8.kubernetes.api.builder.BaseFluent<A>
        implements SpecHttpRouteDestinationPortFluent<A> {
    private Integer number;

    public SpecHttpRouteDestinationPortFluentImpl() {

    }

    public SpecHttpRouteDestinationPortFluentImpl(SpecHttpRouteDestinationPort instence) {
        this.withNumber(instence.getNumber());
    }


    @Override
    public Integer getNumber() {
        return this.number;
    }

    @Override
    public A withNumber(Integer number) {
        this.number = number;
        return (A) this;
    }
}
