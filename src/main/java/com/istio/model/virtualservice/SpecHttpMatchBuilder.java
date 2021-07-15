package com.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class SpecHttpMatchBuilder extends SpecHttpMatchFluentImpl<SpecHttpMatchBuilder> implements VisitableBuilder<SpecHttpMatch, SpecHttpMatchBuilder>{

    SpecHttpMatchFluent<?> fluent;
    Boolean validationEnabled;

    public SpecHttpMatchBuilder(){
            this(true);
    }
    public SpecHttpMatchBuilder(Boolean validationEnabled){
        this(new SpecHttpMatch(), validationEnabled);
    }
    public SpecHttpMatchBuilder(SpecHttpMatchFluent<?> fluent){
            this(fluent, true);
    }
    public SpecHttpMatchBuilder(SpecHttpMatchFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new SpecHttpMatch(), validationEnabled);
    }
    public SpecHttpMatchBuilder(SpecHttpMatchFluent<?> fluent, SpecHttpMatch instance){
            this(fluent, instance, true);
    }
    public SpecHttpMatchBuilder(SpecHttpMatchFluent<?> fluent, SpecHttpMatch instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.withHeaders(instance.getHeaders());
        fluent.withUri(instance.getUri());
        fluent.withScheme(instance.getScheme());
        fluent.withMethods(instance.getMethods());
        fluent.withSourceLabels(instance.getSourceLabels());
        this.validationEnabled = validationEnabled;
    }
    public SpecHttpMatchBuilder(SpecHttpMatch instance){
            this(instance,true);
    }
    public SpecHttpMatchBuilder(SpecHttpMatch instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.withHeaders(instance.getHeaders());
        fluent.withUri(instance.getUri());
        fluent.withScheme(instance.getScheme());
        fluent.withMethods(instance.getMethods());
        fluent.withSourceLabels(instance.getSourceLabels());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public SpecHttpMatch build(){
        SpecHttpMatch buildable = new SpecHttpMatch(fluent.getHeaders(), fluent.getUri(), fluent.getScheme(), fluent.getMethods(), fluent.getSourceLabels());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SpecHttpMatchBuilder that = (SpecHttpMatchBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
