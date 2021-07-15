package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class LoadBalancerBuilder extends LoadBalancerFluentImpl<LoadBalancerBuilder> implements VisitableBuilder<LoadBalancer, LoadBalancerBuilder>{

    LoadBalancerFluent<?> fluent;
    Boolean validationEnabled;

    public LoadBalancerBuilder(){
            this(true);
    }
    public LoadBalancerBuilder(Boolean validationEnabled){
        this(new LoadBalancer(), validationEnabled);
    }
    public LoadBalancerBuilder(LoadBalancerFluent<?> fluent){
            this(fluent, true);
    }
    public LoadBalancerBuilder(LoadBalancerFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new LoadBalancer(), validationEnabled);
    }
    public LoadBalancerBuilder(LoadBalancerFluent<?> fluent, LoadBalancer instance){
            this(fluent, instance, true);
    }
    public LoadBalancerBuilder(LoadBalancerFluent<?> fluent, LoadBalancer instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withSimple(instance.getSimple());
            this.validationEnabled = validationEnabled;
    }
    public LoadBalancerBuilder(LoadBalancer instance){
            this(instance,true);
    }
    public LoadBalancerBuilder(LoadBalancer instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withSimple(instance.getSimple());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public LoadBalancer build(){
        LoadBalancer buildable = new LoadBalancer(fluent.getSimple());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LoadBalancerBuilder that = (LoadBalancerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
