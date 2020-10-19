package com.paas.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class SpecHttpRouteBuilder extends SpecHttpRouteFluentImpl<SpecHttpRouteBuilder> implements VisitableBuilder<SpecHttpRoute, SpecHttpRouteBuilder>{

    SpecHttpRouteFluent<?> fluent;
    Boolean validationEnabled;

    public SpecHttpRouteBuilder(){
            this(true);
    }
    public SpecHttpRouteBuilder(Boolean validationEnabled){
        this(new SpecHttpRoute(), validationEnabled);
    }
    public SpecHttpRouteBuilder(SpecHttpRouteFluent<?> fluent){
            this(fluent, true);
    }
    public SpecHttpRouteBuilder(SpecHttpRouteFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new SpecHttpRoute(), validationEnabled);
    }
    public SpecHttpRouteBuilder(SpecHttpRouteFluent<?> fluent, SpecHttpRoute instance){
            this(fluent, instance, true);
    }
    public SpecHttpRouteBuilder(SpecHttpRouteFluent<?> fluent, SpecHttpRoute instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withDestination(instance.getDestination());
            fluent.withWeight(instance.getWeight());
            this.validationEnabled = validationEnabled;
    }
    public SpecHttpRouteBuilder(SpecHttpRoute instance){
            this(instance,true);
    }
    public SpecHttpRouteBuilder(SpecHttpRoute instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withDestination(instance.getDestination());
            fluent.withWeight(instance.getWeight());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public SpecHttpRoute build(){
        SpecHttpRoute buildable = new SpecHttpRoute(fluent.getDestination(), fluent.getWeight());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SpecHttpRouteBuilder that = (SpecHttpRouteBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
