package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.Fluent;

import java.util.Map;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface SubsetFluent<A extends SubsetFluent<A>> extends Fluent<A> {



    /**
     * 版本子集名称
     */
    A withName(String name);

    String getName();

    /**
     * 子集的筛选标签(用于定位目标版本的pod,一般建议使用version标签)
     */
    Map<String, String> getLabels();
    Map<String, String> buildLabels();
    A withLabels(Map<String, String> item);
    Boolean hasLabels();
    A addNewLabels(String key ,String item);
    A removeFromLabels(String... keys);


    /**
     * 流量策略
     */
    TrafficPolicy getTrafficPolicy();
    TrafficPolicy buildTrafficPolicy();
    A withTrafficPolicy(TrafficPolicy item);
    Boolean hasTrafficPolicy();
    TrafficPolicyNested<A> withNewTrafficPolicy();
    TrafficPolicyNested<A> withNewTrafficPolicyLike(TrafficPolicy item);
    TrafficPolicyNested<A> editTrafficPolicy();
    TrafficPolicyNested<A> editOrNewTrafficPolicy();
    TrafficPolicyNested<A> editOrNewTrafficPolicyLike(TrafficPolicy item);



    public interface TrafficPolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, TrafficPolicyFluent<TrafficPolicyNested<N>> {
        @Override
        public N and();
        public N endTrafficPolicy();
    }

}
