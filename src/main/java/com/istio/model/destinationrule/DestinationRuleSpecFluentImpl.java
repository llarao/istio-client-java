package com.istio.model.destinationrule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class DestinationRuleSpecFluentImpl<A extends DestinationRuleSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DestinationRuleSpecFluent<A> {

    private String host;

    /**
     * 流量规则
     */
    private TrafficPolicyBuilder trafficPolicy;

    /**
     * 版本子集
     */
    private List<SubsetBuilder> subset;

    public DestinationRuleSpecFluentImpl(){
    }
    public DestinationRuleSpecFluentImpl(DestinationRuleSpec instance){
        this.withHost(instance.getHost());
        this.withTrafficPolicy(instance.getTrafficPolicy());
        this.withSubset(instance.getSubsets());
    }

    @Override
    public String getHost() {
        return this.host;
    }


    @Override
    public A withHost(String items) {
        this.host = items;
        return (A) this;
    }

    @Override
    public Boolean hasHost() {
        return this.host != null;
    }

    @Override
    public TrafficPolicy getTrafficPolicy() {
        return this.trafficPolicy!=null?this.trafficPolicy.build():null;

    }

    @Override
    public TrafficPolicy buildTrafficPolicy() {
        return this.trafficPolicy!=null?this.trafficPolicy.build():null;
    }

    @Override
    public A withTrafficPolicy(TrafficPolicy trafficPolicy) {
        _visitables.get("trafficPolicy").remove(this.trafficPolicy);
        if (trafficPolicy!=null){ this.trafficPolicy= new TrafficPolicyBuilder(trafficPolicy); _visitables.get("trafficPolicy").add(this.trafficPolicy);} return (A) this;
    }

    @Override
    public Boolean hasTrafficPolicy() {
        return this.trafficPolicy!=null;
    }

    @Override
    public TrafficPolicyNested<A> withNewTrafficPolicy() {
        return new TrafficPolicyNestedImpl<>();
    }

    @Override
    public TrafficPolicyNested<A> withNewTrafficPolicyLike(TrafficPolicy trafficPolicy) {
        return new TrafficPolicyNestedImpl(trafficPolicy);

    }

    @Override
    public TrafficPolicyNested<A> editTrafficPolicy() {
        return withNewTrafficPolicyLike(getTrafficPolicy());
    }

    @Override
    public TrafficPolicyNested<A> editOrNewTrafficPolicy() {
        return withNewTrafficPolicyLike(getTrafficPolicy() != null ? getTrafficPolicy(): new TrafficPolicyBuilder().build());
    }

    @Override
    public TrafficPolicyNested<A> editOrNewTrafficPolicyLike(TrafficPolicy item) {
        return withNewTrafficPolicyLike(getTrafficPolicy() != null ? getTrafficPolicy(): item);
    }

    @Override
    public List<Subset> getSubset() {
        return build(subset);
    }

    @Override
    public Subset buildSubset(int index) {
        return this.subset.get(index).build();
    }

    @Override
    public List<Subset> buildSubset() {
        return build(subset);
    }

    @Override
    public A withSubset(List<Subset> subset) {
        if (this.subset != null) { _visitables.get("subset").removeAll(this.subset);}
        if (subset != null) {
            this.subset = new ArrayList<>();
            for (Subset item : subset){
                this.addToSubset(item);
            }
        } else {
            this.subset = null;
        }
        return (A) this;    }

    @Override
    public A withSubset(Subset... subset) {
        if (this.subset != null) {
            this.subset.clear();
        }
        if (subset != null) {
            for (Subset item :subset){
                this.addToSubset(item);
            }
        }
        return (A) this;    }

    @Override
    public Boolean hasSubset() {
        return this.subset!=null;
    }

    @Override
    public SubsetNested<A> addNewSubset() {
        return new SubsetNestedImpl<>();
    }

    @Override
    public SubsetNested<A> setNewSubsetLike(Subset item) {
        return new SubsetNestedImpl<>(-1,item);
    }

    @Override
    public SubsetNested<A> setNewSubsetLike(int i, Subset item) {
        return new SubsetNestedImpl<>(i,item);
    }

    @Override
    public SubsetNested<A> editFirstSubset() {
        if (subset.size() == 0) {
            throw new RuntimeException("Can't edit subset. Index exceeds size.");
        }
        return setNewSubsetLike(0, buildSubset(0));    }

    @Override
    public SubsetNested<A> editLastSubset() {
        int index = subset.size() - 1;
        if (index < 0) {
            throw new RuntimeException("Can't edit subset. Index exceeds size.");
        }
        return setNewSubsetLike(index, buildSubset(index));
    }

    @Override
    public SubsetNested<A> editSubset(int index) {
        if (subset.size() <= 0) {
            throw new RuntimeException("Can't edit subset. Index exceeds size.");
        }
        return setNewSubsetLike(index, buildSubset(index));
    }

    @Override
    public A addNewSubset(Subset specHttp) {
        return this.addToSubset(-1,specHttp);
    }

    @Override
    public A setToSubset(int index, Subset item) {
        return this.addToSubset(-1,item);
    }

    @Override
    public A addToSubset(int index, Subset item) {
        if (this.subset == null) {
            this.subset = new ArrayList<SubsetBuilder>();
        }
        SubsetBuilder builder = new SubsetBuilder(item);
        _visitables.get("subset").add(index >= 0 ? index : _visitables.get("subset").size(), builder);
        this.subset.add(index >= 0 ? index : subset.size(), builder);
        return (A)this;    }

    @Override
    public A addToSubset(Subset... subset) {
        if (this.subset == null) {
            this.subset = new ArrayList<SubsetBuilder>();
        }
        for (Subset item : subset) {
            SubsetBuilder builder = new SubsetBuilder(item);
            _visitables.get("subset").add(builder);
            this.subset.add(builder);
        }
        return (A)this;    }

    @Override
    public A addAllToSubset(Collection<Subset> subset) {
        if (this.subset == null) {
            this.subset = new ArrayList<SubsetBuilder>();
        }
        for (Subset item : subset) {
            SubsetBuilder builder = new SubsetBuilder(item);
            _visitables.get("subset").add(builder);
            this.subset.add(builder);
        }
        return (A)this;
    }

    @Override
    public A removeFromSubset(Subset... subset) {
        for (Subset item : subset) {
            SubsetBuilder builder = new SubsetBuilder(item);
            _visitables.get("subset").remove(builder);
            if (this.subset != null) {
                this.subset.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public A removeAllFromSubset(Collection<Subset> subset) {
        for (Subset item : subset) {
            SubsetBuilder builder = new SubsetBuilder(item);
            _visitables.get("subset").remove(builder);
            if (this.subset != null) {
                this.subset.remove(builder);
            }
        }
        return (A)this;
    }


    public class SubsetNestedImpl<N> extends SubsetFluentImpl<SubsetNested<N>> implements DestinationRuleSpecFluent.SubsetNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SubsetBuilder builder;
        private final int index;

        SubsetNestedImpl(int index, Subset item){
            this.index = index;
            this.builder = new SubsetBuilder(this, item);
        }
        SubsetNestedImpl(){
            this.index = -1;
            this.builder = new SubsetBuilder(this);
        }

        @Override
        public N and(){
            return (N) DestinationRuleSpecFluentImpl.this.setToSubset(index,builder.build());
        }

        @Override
        public N endSubset() {
            return and();
        }

    }

    public class TrafficPolicyNestedImpl<N> extends TrafficPolicyFluentImpl<TrafficPolicyNested<N>> implements DestinationRuleSpecFluent.TrafficPolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private TrafficPolicyBuilder builder;

        TrafficPolicyNestedImpl(TrafficPolicy item){
            this.builder = new TrafficPolicyBuilder(this, item);
        }
        TrafficPolicyNestedImpl(){
            this.builder = new TrafficPolicyBuilder(this);
        }

        @Override
        public N and(){
            return (N) DestinationRuleSpecFluentImpl.this.withTrafficPolicy(builder.build());
        }

        @Override
        public N endTrafficPolicy() {
            return and();
        }

    }
}
