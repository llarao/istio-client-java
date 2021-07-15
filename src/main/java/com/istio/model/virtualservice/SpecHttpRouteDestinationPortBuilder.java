package com.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class SpecHttpRouteDestinationPortBuilder extends SpecHttpRouteDestinationPortFluentImpl<SpecHttpRouteDestinationPortBuilder> implements VisitableBuilder<SpecHttpRouteDestinationPort, SpecHttpRouteDestinationPortBuilder>{

    SpecHttpRouteDestinationPortFluent<?> fluent;
    Boolean validationEnabled;

    public SpecHttpRouteDestinationPortBuilder(){
            this(true);
    }
    public SpecHttpRouteDestinationPortBuilder(Boolean validationEnabled){
        this(new SpecHttpRouteDestinationPort(), validationEnabled);
    }
    public SpecHttpRouteDestinationPortBuilder(SpecHttpRouteDestinationPortFluent<?> fluent){
            this(fluent, true);
    }
    public SpecHttpRouteDestinationPortBuilder(SpecHttpRouteDestinationPortFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new SpecHttpRouteDestinationPort(), validationEnabled);
    }
    public SpecHttpRouteDestinationPortBuilder(SpecHttpRouteDestinationPortFluent<?> fluent, SpecHttpRouteDestinationPort instance){
            this(fluent, instance, true);
    }
    public SpecHttpRouteDestinationPortBuilder(SpecHttpRouteDestinationPortFluent<?> fluent, SpecHttpRouteDestinationPort instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.withNumber(instance.getNumber());
        this.validationEnabled = validationEnabled;
    }
    public SpecHttpRouteDestinationPortBuilder(SpecHttpRouteDestinationPort instance){
            this(instance,true);
    }
    public SpecHttpRouteDestinationPortBuilder(SpecHttpRouteDestinationPort instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.withNumber(instance.getNumber());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public SpecHttpRouteDestinationPort build(){
        SpecHttpRouteDestinationPort buildable = new SpecHttpRouteDestinationPort(fluent.getNumber());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
        SpecHttpRouteDestinationPortBuilder that = (SpecHttpRouteDestinationPortBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
