package com.paas.istio.model.virtualservice;

/**
 * @Classname VirtualServiceSpecHttpRouteDestinationFluent
 * @Description TODO
 * @Date 2020/10/20 0020 16:53
 * @Create by llarao
 */
public class SpecHttpRouteDestinationFluentImpl<A extends SpecHttpRouteDestinationFluent<A>>
        extends io.fabric8.kubernetes.api.builder.BaseFluent<A>
        implements SpecHttpRouteDestinationFluent<A> {
    private String host;

    private String subset;

    private SpecHttpRouteDestinationPortBuilder port;

    public SpecHttpRouteDestinationFluentImpl() {

    }

    public SpecHttpRouteDestinationFluentImpl(SpecHttpRouteDestination instence) {
        this.withHost(instence.getHost());
        this.withSubset(instence.getSubset());
        this.withPort(instence.getPort());
    }


    @Override
    public String getHost() {
        return this.host;
    }

    @Override
    public A withHost(String host) {
        this.host = host;
        return (A) this;
    }

    @Override
    public String getSubset() {
        return this.subset;
    }

    @Override
    public A withSubset(String subset) {
        this.subset = subset;
        return (A) this;
    }

    @Override
    public SpecHttpRouteDestinationPort getPort() {
        return this.port!=null?this.port.build():null;

    }

    @Override
    public SpecHttpRouteDestinationPort buildPort() {
        return this.port!=null?this.port.build():null;
    }

    @Override
    public A withPort(SpecHttpRouteDestinationPort port) {
        _visitables.get("port").remove(this.port);
        if (port!=null){ this.port= new SpecHttpRouteDestinationPortBuilder(port); _visitables.get("port").add(this.port);} return (A) this;    }

    @Override
    public Boolean hasPort() {
        return this.port != null;
    }

    @Override
    public DestinationPortNested<A> withNewPort() {
        return new DestinationPortNestedImpl<>();
    }

    @Override
    public DestinationPortNested<A> withNewPortLike(SpecHttpRouteDestinationPort item) {
        return new DestinationPortNestedImpl<>(item);

    }

    @Override
    public DestinationPortNested<A> editPort() {
        return withNewPortLike(getPort());

    }

    @Override
    public DestinationPortNested<A> editOrNewPort() {
        return withNewPortLike(getPort() != null ? getPort(): new SpecHttpRouteDestinationPortBuilder().build());
    }

    @Override
    public DestinationPortNested<A> editOrNewPortLike(SpecHttpRouteDestinationPort item) {
        return withNewPortLike(getPort() != null ? getPort(): item);
    }

    public class DestinationPortNestedImpl<N>
            extends SpecHttpRouteDestinationPortFluentImpl<SpecHttpRouteDestinationFluent.DestinationPortNested<N>>
            implements SpecHttpRouteDestinationFluent.DestinationPortNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpRouteDestinationPortBuilder builder;

        DestinationPortNestedImpl(SpecHttpRouteDestinationPort item){
            this.builder = new SpecHttpRouteDestinationPortBuilder(this, item);
        }
        DestinationPortNestedImpl(){
            this.builder = new SpecHttpRouteDestinationPortBuilder(this);
        }

        @Override
        public N and(){
            return (N) SpecHttpRouteDestinationFluentImpl.this.withPort(builder.build());
        }

        @Override
        public N endPort() {
            return and();
        }

    }
}
