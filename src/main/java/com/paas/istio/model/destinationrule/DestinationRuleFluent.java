package com.paas.istio.model.destinationrule;

import com.paas.istio.model.virtualservice.VirtualServiceSpec;
import com.paas.istio.model.virtualservice.VirtualServiceSpecFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;

/**
 * @Classname VirtualServiceFluent
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public interface DestinationRuleFluent<A extends DestinationRuleFluent<A>> extends Fluent<A> {

    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A withNewApiVersion(String arg1);
    public A withNewApiVersion(StringBuilder arg1);
    public A withNewApiVersion(StringBuffer arg1);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    A withNewKind(String arg1);
    public A withNewKind(StringBuilder arg1);
    public A withNewKind(StringBuffer arg1);

    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
    public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public DestinationRuleFluent.MetadataNested<A> withNewMetadata();
    public DestinationRuleFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public DestinationRuleFluent.MetadataNested<A> editMetadata();
    public DestinationRuleFluent.MetadataNested<A> editOrNewMetadata();
    public DestinationRuleFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);

    /**
     * This method has been deprecated, please use method buildSpec instead.
     * @return The buildable object.
     */
    public DestinationRuleSpec getSpec();
    public DestinationRuleSpec buildSpec();
    public A withSpec(DestinationRuleSpec spec);
    public Boolean hasSpec();
    public DestinationRuleFluent.SpecNested<A> withNewSpec();
    public DestinationRuleFluent.SpecNested<A> withNewSpecLike(DestinationRuleSpec item);
    public DestinationRuleFluent.SpecNested<A> editSpec();
    public DestinationRuleFluent.SpecNested<A> editOrNewSpec();
    public DestinationRuleFluent.SpecNested<A> editOrNewSpecLike(DestinationRuleSpec item);


    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<DestinationRuleFluent.MetadataNested<N>>{


        @Override
        public N and();    public N endMetadata();
    }
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, DestinationRuleSpecFluent<SpecNested<N>> {
        @Override
        public N and();    public N endSpec();
    }


}
