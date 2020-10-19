package com.paas.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class SpecHttpMirrorBuilder extends SpecHttpMirrorFluentImpl<SpecHttpMirrorBuilder> implements VisitableBuilder<SpecHttpMirror, SpecHttpMirrorBuilder>{

    SpecHttpMirrorFluent<?> fluent;
    Boolean validationEnabled;

    public SpecHttpMirrorBuilder(){
            this(true);
    }
    public SpecHttpMirrorBuilder(Boolean validationEnabled){
        this(new SpecHttpMirror(), validationEnabled);
    }
    public SpecHttpMirrorBuilder(SpecHttpMirrorFluent<?> fluent){
            this(fluent, true);
    }
    public SpecHttpMirrorBuilder(SpecHttpMirrorFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new SpecHttpMirror(), validationEnabled);
    }
    public SpecHttpMirrorBuilder(SpecHttpMirrorFluent<?> fluent, SpecHttpMirror instance){
            this(fluent, instance, true);
    }
    public SpecHttpMirrorBuilder(SpecHttpMirrorFluent<?> fluent, SpecHttpMirror instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.setHost(instance.getHost());
        fluent.setSubset(instance.getSubset());
        this.validationEnabled = validationEnabled;
    }
    public SpecHttpMirrorBuilder(SpecHttpMirror instance){
            this(instance,true);
    }
    public SpecHttpMirrorBuilder(SpecHttpMirror instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.setHost(instance.getHost());
        fluent.setSubset(instance.getSubset());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public SpecHttpMirror build(){
        SpecHttpMirror buildable = new SpecHttpMirror(fluent.getHost(),fluent.getSubset());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SpecHttpMirrorBuilder that = (SpecHttpMirrorBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
