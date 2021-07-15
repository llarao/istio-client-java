package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.Fluent;

import java.util.Collection;
import java.util.List;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface DestinationRuleSpecFluent<A extends DestinationRuleSpecFluent<A>> extends Fluent<A> {

    /**
     * host配置
     */
    String getHost();
    A withHost(String items);
    Boolean hasHost();

    /**
     * 流量策略
     */
    TrafficPolicy getTrafficPolicy();
    TrafficPolicy buildTrafficPolicy();
    A withTrafficPolicy(TrafficPolicy item);
    Boolean hasTrafficPolicy();
    DestinationRuleSpecFluent.TrafficPolicyNested<A> withNewTrafficPolicy();
    DestinationRuleSpecFluent.TrafficPolicyNested<A> withNewTrafficPolicyLike(TrafficPolicy item);
    DestinationRuleSpecFluent.TrafficPolicyNested<A> editTrafficPolicy();
    DestinationRuleSpecFluent.TrafficPolicyNested<A> editOrNewTrafficPolicy();
    DestinationRuleSpecFluent.TrafficPolicyNested<A> editOrNewTrafficPolicyLike(TrafficPolicy item);

    /**
     * 服务子集配置
     */
    List<Subset> getSubset();
    Subset buildSubset(int index);
    List<Subset> buildSubset();
    A withSubset(List<Subset> items);
    A withSubset(Subset... items);
    Boolean hasSubset();
    DestinationRuleSpecFluent.SubsetNested<A> addNewSubset();
    DestinationRuleSpecFluent.SubsetNested<A> setNewSubsetLike(Subset item);
    DestinationRuleSpecFluent.SubsetNested<A> setNewSubsetLike(int i , Subset item);
    DestinationRuleSpecFluent.SubsetNested<A> editFirstSubset();
    DestinationRuleSpecFluent.SubsetNested<A> editLastSubset();
    DestinationRuleSpecFluent.SubsetNested<A> editSubset(int i);
    A addNewSubset(Subset specHttp);
    A setToSubset(int index, Subset item);
    A addToSubset(int index, Subset item);
    A addToSubset(Subset... items);
    A addAllToSubset(Collection<Subset> items);
    A removeFromSubset(Subset... items);
    A removeAllFromSubset(Collection<Subset> items);




    public interface SubsetNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, SubsetFluent<SubsetNested<N>> {
        @Override
        public N and();
        public N endSubset();
    }

    public interface TrafficPolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, TrafficPolicyFluent<TrafficPolicyNested<N>> {
        @Override
        public N and();
        public N endTrafficPolicy();
    }
}
