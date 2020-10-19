package com.paas.istio.model.destinationrule;

import com.paas.istio.model.virtualservice.SpecHttp;
import com.paas.istio.model.virtualservice.SpecHttpMatch;
import com.paas.istio.model.virtualservice.SpecHttpMatchBuilder;
import com.paas.istio.model.virtualservice.SpecHttpMatchCondition;
import com.paas.istio.model.virtualservice.SpecHttpMatchConditionBuilder;
import com.paas.istio.model.virtualservice.SpecHttpMatchFluentImpl;
import com.paas.istio.model.virtualservice.SpecHttpMirror;
import com.paas.istio.model.virtualservice.SpecHttpMirrorBuilder;
import com.paas.istio.model.virtualservice.SpecHttpMirrorFluentImpl;
import com.paas.istio.model.virtualservice.SpecHttpRetries;
import com.paas.istio.model.virtualservice.SpecHttpRetriesBuilder;
import com.paas.istio.model.virtualservice.SpecHttpRetriesFluentImpl;
import com.paas.istio.model.virtualservice.SpecHttpRewrite;
import com.paas.istio.model.virtualservice.SpecHttpRewriteBuilder;
import com.paas.istio.model.virtualservice.SpecHttpRewriteFluentImpl;
import com.paas.istio.model.virtualservice.SpecHttpRoute;
import com.paas.istio.model.virtualservice.SpecHttpRouteBuilder;
import com.paas.istio.model.virtualservice.SpecHttpRouteFluentImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class SubsetFluentImpl<A extends SubsetFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SubsetFluent<A> {

    /**
     * 版本子集名称
     */
    private String name;
    /**
     * 子集的筛选标签(用于定位目标版本的pod,一般建议使用version标签)
     */
    private Map<String, String> labels;
    /**
     * 针对当前子集的trafficPolicy流量策略,如果子集配置了策略会被优先使用
     */
    private TrafficPolicyBuilder trafficPolicy;

    public SubsetFluentImpl(){
    }
    public SubsetFluentImpl(Subset instance){
        this.withName(instance.getName());
        this.withLabels(instance.getLabels());
        this.withTrafficPolicy(instance.getTrafficPolicy());
    }


    @Override
    public A withName(String name) {
        this.name = name;
        return (A)this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Map<String, String> getLabels() {
        return this.labels != null ? this.labels : new HashMap<>();
    }

    @Override
    public Map<String, String> buildLabels() {
        return this.labels != null ? this.labels : new HashMap<>();

    }

    @Override
    public A withLabels(Map<String, String> labels) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        if (labels != null) {
            this.labels.putAll(labels);
        } else {
            this.labels = null;
        }

        return (A) this;
    }

    @Override
    public Boolean hasLabels() {
        return this.labels!=null;
    }

    @Override
    public A addNewLabels(String key, String item) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, item);

        return (A) this;

    }

    @Override
    public A removeFromLabels(String... keys) {
        if (this.labels == null) {
            return null;
        } else {
            for (String key : keys) {
                this.labels.remove(key);
            }
        }
        return (A)this;
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

    public class TrafficPolicyNestedImpl<N> extends TrafficPolicyFluentImpl<TrafficPolicyNested<N>> implements TrafficPolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private TrafficPolicyBuilder builder;

        TrafficPolicyNestedImpl(TrafficPolicy item){
            this.builder = new TrafficPolicyBuilder(this, item);
        }
        TrafficPolicyNestedImpl(){
            this.builder = new TrafficPolicyBuilder(this);
        }

        @Override
        public N and(){
            return (N) SubsetFluentImpl.this.withTrafficPolicy(builder.build());
        }

        @Override
        public N endTrafficPolicy() {
            return and();
        }

    }
}
