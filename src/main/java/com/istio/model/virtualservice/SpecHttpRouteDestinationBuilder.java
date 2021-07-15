package com.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class SpecHttpRouteDestinationBuilder extends SpecHttpRouteDestinationFluentImpl<SpecHttpRouteDestinationBuilder> implements VisitableBuilder<SpecHttpRouteDestination, SpecHttpRouteDestinationBuilder>{

    SpecHttpRouteDestinationFluent<?> fluent;
    Boolean validationEnabled;

    public SpecHttpRouteDestinationBuilder(){
            this(true);
    }
    public SpecHttpRouteDestinationBuilder(Boolean validationEnabled){
        this(new SpecHttpRouteDestination(), validationEnabled);
    }
    public SpecHttpRouteDestinationBuilder(SpecHttpRouteDestinationFluent<?> fluent){
            this(fluent, true);
    }
    public SpecHttpRouteDestinationBuilder(SpecHttpRouteDestinationFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new SpecHttpRouteDestination(), validationEnabled);
    }
    public SpecHttpRouteDestinationBuilder(SpecHttpRouteDestinationFluent<?> fluent, SpecHttpRouteDestination instance){
            this(fluent, instance, true);
    }
    public SpecHttpRouteDestinationBuilder(SpecHttpRouteDestinationFluent<?> fluent, SpecHttpRouteDestination instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.withHost(instance.getHost());
        fluent.withSubset(instance.getSubset());
        fluent.withPort(instance.getPort());
        this.validationEnabled = validationEnabled;
    }
    public SpecHttpRouteDestinationBuilder(SpecHttpRouteDestination instance){
            this(instance,true);
    }
    public SpecHttpRouteDestinationBuilder(SpecHttpRouteDestination instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.withHost(instance.getHost());
        fluent.withSubset(instance.getSubset());
        fluent.withPort(instance.getPort());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public SpecHttpRouteDestination build(){
        SpecHttpRouteDestination buildable = new SpecHttpRouteDestination(fluent.getHost(), fluent.getSubset(), fluent.getPort());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SpecHttpRouteDestinationBuilder that = (SpecHttpRouteDestinationBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
