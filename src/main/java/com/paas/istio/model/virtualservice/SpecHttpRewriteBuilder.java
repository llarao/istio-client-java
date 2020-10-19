package com.paas.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class SpecHttpRewriteBuilder extends SpecHttpRewriteFluentImpl<SpecHttpRewriteBuilder> implements VisitableBuilder<SpecHttpRewrite, SpecHttpRewriteBuilder>{

    SpecHttpRewriteFluent<?> fluent;
    Boolean validationEnabled;

    public SpecHttpRewriteBuilder(){
            this(true);
    }
    public SpecHttpRewriteBuilder(Boolean validationEnabled){
        this(new SpecHttpRewrite(), validationEnabled);
    }
    public SpecHttpRewriteBuilder(SpecHttpRewriteFluent<?> fluent){
            this(fluent, true);
    }
    public SpecHttpRewriteBuilder(SpecHttpRewriteFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new SpecHttpRewrite(), validationEnabled);
    }
    public SpecHttpRewriteBuilder(SpecHttpRewriteFluent<?> fluent, SpecHttpRewrite instance){
            this(fluent, instance, true);
    }
    public SpecHttpRewriteBuilder(SpecHttpRewriteFluent<?> fluent, SpecHttpRewrite instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.setUri(instance.getUri());
        this.validationEnabled = validationEnabled;
    }
    public SpecHttpRewriteBuilder(SpecHttpRewrite instance){
            this(instance,true);
    }
    public SpecHttpRewriteBuilder(SpecHttpRewrite instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.setUri(instance.getUri());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public SpecHttpRewrite build(){
        SpecHttpRewrite buildable = new SpecHttpRewrite(fluent.getUri());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SpecHttpRewriteBuilder that = (SpecHttpRewriteBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
