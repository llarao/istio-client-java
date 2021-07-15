package com.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;

/**
 * @Classname VirtualServiceFluent
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public interface VirtualServiceFluent<A extends VirtualServiceFluent<A>> extends Fluent<A> {

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
    public VirtualServiceFluent.MetadataNested<A> withNewMetadata();
    public VirtualServiceFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public VirtualServiceFluent.MetadataNested<A> editMetadata();
    public VirtualServiceFluent.MetadataNested<A> editOrNewMetadata();
    public VirtualServiceFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);

    /**
     * This method has been deprecated, please use method buildSpec instead.
     * @return The buildable object.
     */
    public VirtualServiceSpec getSpec();
    public VirtualServiceSpec buildSpec();
    public A withSpec(VirtualServiceSpec spec);
    public Boolean hasSpec();
    public VirtualServiceFluent.SpecNested<A> withNewSpec();
    public VirtualServiceFluent.SpecNested<A> withNewSpecLike(VirtualServiceSpec item);
    public VirtualServiceFluent.SpecNested<A> editSpec();
    public VirtualServiceFluent.SpecNested<A> editOrNewSpec();
    public VirtualServiceFluent.SpecNested<A> editOrNewSpecLike(VirtualServiceSpec item);


    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<VirtualServiceFluent.MetadataNested<N>>{


        @Override
        public N and();    public N endMetadata();
    }
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, VirtualServiceSpecFluent<VirtualServiceFluent.SpecNested<N>> {
        @Override
        public N and();    public N endSpec();
    }


}
