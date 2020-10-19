package com.paas.istio.model.virtualservice;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public class SpecHttpRouteFluentImpl<A extends SpecHttpRouteFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SpecHttpRouteFluent<A> {
    private SpecHttpRouteDestinationBuilder destination;
    private Integer weight;

    public SpecHttpRouteFluentImpl() {
    }

    public SpecHttpRouteFluentImpl(SpecHttpRoute instence) {
        this.withDestination(instence.getDestination());
        this.withWeight(instence.getWeight());
    }

    @Override
    public SpecHttpRouteDestination buildDestination() {
        return this.destination!=null?this.destination.build():null;

    }

    @Override
    public SpecHttpRouteDestination getDestination() {
        return this.destination!=null?this.destination.build():null;
    }

    @Override
    public A withDestination(SpecHttpRouteDestination destination) {
        _visitables.get("destination").remove(this.destination);
        if (destination!=null){ this.destination= new SpecHttpRouteDestinationBuilder(destination); _visitables.get("rewrite").add(this.destination);} return (A) this;
    }

    @Override
    public Boolean hasDestination() {
        return this.destination != null;
    }

    @Override
    public SpecHttpRouteDestinationNested<A> withNewDestination() {
        return new SpecHttpRouteDestinationNestedImpl<>();
    }

    @Override
    public SpecHttpRouteDestinationNested<A> withNewDestinationLike(SpecHttpRouteDestination item) {
        return new SpecHttpRouteDestinationNestedImpl<>(item);
    }

    @Override
    public SpecHttpRouteDestinationNested<A> editDestination() {
        return withNewDestinationLike(getDestination());
    }

    @Override
    public SpecHttpRouteDestinationNested<A> editOrNewDestination() {
        return withNewDestinationLike(getDestination() != null ? getDestination(): new SpecHttpRouteDestinationBuilder().build());
    }

    @Override
    public SpecHttpRouteDestinationNested<A> editOrNewDestinationLike(SpecHttpRouteDestination item) {
        return withNewDestinationLike(getDestination() != null ? getDestination(): item);
    }

    @Override
    public Integer getWeight() {
        return this.weight;
    }


    @Override
    public A withWeight(Integer item) {
        this.weight = item;
        return (A) this;
    }

    public class SpecHttpRouteDestinationNestedImpl<N>
            extends SpecHttpRouteDestinationFluentImpl<SpecHttpRouteDestinationNested<N>>
            implements SpecHttpRouteDestinationNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpRouteDestinationBuilder builder;

        SpecHttpRouteDestinationNestedImpl( SpecHttpRouteDestination item){
            this.builder = new SpecHttpRouteDestinationBuilder(this, item);
        }
        SpecHttpRouteDestinationNestedImpl(){
            this.builder = new SpecHttpRouteDestinationBuilder(this);
        }

        @Override
        public N and(){
            return (N) SpecHttpRouteFluentImpl.this.withDestination(builder.build());
        }

        @Override
        public N endDestination() {
            return and();
        }

    }
}
