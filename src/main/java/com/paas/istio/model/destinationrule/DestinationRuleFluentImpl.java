package com.paas.istio.model.destinationrule;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;

/**
 * @Classname DestinationRuleFluentImpl
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public class DestinationRuleFluentImpl<A extends DestinationRuleFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DestinationRuleFluent<A> {


    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private DestinationRuleSpecBuilder spec;

    public DestinationRuleFluentImpl(){
    }
    public DestinationRuleFluentImpl(DestinationRule instance){
        this.withApiVersion(instance.getApiVersion());
        this.withKind(instance.getKind());
        this.withMetadata(instance.getMetadata());
        this.withSpec(instance.getSpec());
    }

    @Override
    public String getApiVersion(){
        return this.apiVersion;
    }
    @Override
    public A withApiVersion(String apiVersion){
        this.apiVersion=apiVersion; return (A) this;
    }
    @Override
    public Boolean hasApiVersion(){
        return this.apiVersion != null;
    }
    @Override
    public A withNewApiVersion(String arg1){
        return (A)withApiVersion(new String(arg1));
    }
    @Override
    public A withNewApiVersion(StringBuilder arg1){
        return (A)withApiVersion(new String(arg1));
    }
    @Override
    public A withNewApiVersion(StringBuffer arg1){
        return (A)withApiVersion(new String(arg1));
    }
    @Override
    public String getKind(){
        return this.kind;
    }
    @Override
    public A withKind(String kind){
        this.kind=kind; return (A) this;
    }
    @Override
    public Boolean hasKind(){
        return this.kind != null;
    }
    @Override
    public A withNewKind(String arg1){
        return (A)withKind(new String(arg1));
    }
    @Override
    public A withNewKind(StringBuilder arg1){
        return (A)withKind(new String(arg1));
    }
    @Override
    public A withNewKind(StringBuffer arg1){
        return (A)withKind(new String(arg1));
    }


    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
    @Override
    @Deprecated public ObjectMeta getMetadata(){
        return this.metadata!=null?this.metadata.build():null;
    }
    @Override
    public ObjectMeta buildMetadata(){
        return this.metadata!=null?this.metadata.build():null;
    }
    @Override
    public A withMetadata(ObjectMeta metadata){
        _visitables.get("metadata").remove(this.metadata);
        if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} return (A) this;
    }
    @Override
    public Boolean hasMetadata(){
        return this.metadata != null;
    }
    @Override
    public MetadataNested<A> withNewMetadata(){
        return new MetadataNestedImpl();
    }

    @Override
    public MetadataNested<A> withNewMetadataLike(ObjectMeta item){
        return new MetadataNestedImpl(item);
    }
    @Override
    public MetadataNested<A> editMetadata(){
        return withNewMetadataLike(getMetadata());
    }
    @Override
    public MetadataNested<A> editOrNewMetadata(){
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }
    @Override
    public MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }


    /**
     * This method has been deprecated, please use method buildSpec instead.
     * @return The buildable object.
     */
    @Override
    @Deprecated public DestinationRuleSpec getSpec(){
        return this.spec!=null?this.spec.build():null;
    }
    @Override
    public DestinationRuleSpec buildSpec(){
        return this.spec!=null?this.spec.build():null;
    }

    @Override
    public A withSpec(DestinationRuleSpec spec){
        _visitables.get("spec").remove(this.spec);
        if (spec!=null){
            this.spec= new DestinationRuleSpecBuilder(spec);
            _visitables.get("spec").add(this.spec);
        }
        return (A) this;
    }
    @Override
    public Boolean hasSpec(){
        return this.spec != null;
    }

    @Override
    public SpecNested<A> withNewSpec() {
        return new SpecNestedImpl();
    }

    @Override
    public SpecNested<A> withNewSpecLike(DestinationRuleSpec item) {
        return new SpecNestedImpl(item);
    }

    @Override
    public SpecNested<A> editSpec() {
        return withNewSpecLike(getSpec());
    }

    @Override
    public SpecNested<A> editOrNewSpec() {
        return withNewSpecLike(getSpec() != null ? getSpec(): new DestinationRuleSpecBuilder().build());
    }

    @Override
    public SpecNested<A> editOrNewSpecLike(DestinationRuleSpec item) {
        return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DestinationRuleFluentImpl that = (DestinationRuleFluentImpl) o;
        if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
        if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
        return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<MetadataNested<N>> implements MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private final ObjectMetaBuilder builder;

        MetadataNestedImpl(ObjectMeta item){
            this.builder = new ObjectMetaBuilder(this, item);
        }
        MetadataNestedImpl(){
            this.builder = new ObjectMetaBuilder(this);
        }

        @Override
        public N and(){
            return (N) DestinationRuleFluentImpl.this.withMetadata(builder.build());
        }
        @Override
        public N endMetadata(){
            return and();
        }

    }

    public class SpecNestedImpl<N> extends DestinationRuleSpecFluentImpl<SpecNested<N>> implements SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private final DestinationRuleSpecBuilder builder;

        SpecNestedImpl(DestinationRuleSpec item){
            this.builder = new DestinationRuleSpecBuilder(this, item);
        }
        SpecNestedImpl(){
            this.builder = new DestinationRuleSpecBuilder(this);
        }

        @Override
        public N and(){
            return (N) DestinationRuleFluentImpl.this.withSpec(builder.build());
        }
        @Override
        public N endSpec(){
            return and();
        }

    }



}
