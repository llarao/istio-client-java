package com.paas.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class TrafficPolicyBuilder extends TrafficPolicyFluentImpl<TrafficPolicyBuilder> implements VisitableBuilder<TrafficPolicy, TrafficPolicyBuilder>{

    TrafficPolicyFluent<?> fluent;
    Boolean validationEnabled;

    public TrafficPolicyBuilder(){
            this(true);
    }
    public TrafficPolicyBuilder(Boolean validationEnabled){
        this(new TrafficPolicy(), validationEnabled);
    }
    public TrafficPolicyBuilder(TrafficPolicyFluent<?> fluent){
            this(fluent, true);
    }
    public TrafficPolicyBuilder(TrafficPolicyFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new TrafficPolicy(), validationEnabled);
    }
    public TrafficPolicyBuilder(TrafficPolicyFluent<?> fluent, TrafficPolicy instance){
            this(fluent, instance, true);
    }
    public TrafficPolicyBuilder(TrafficPolicyFluent<?> fluent, TrafficPolicy instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.withLoadBalancer(instance.getLoadBalancer());
        fluent.withConnectionPool(instance.getConnectionPool());
        fluent.withOutlierDetection(instance.getOutlierDetection());
        fluent.withPortLevelSettings(instance.getPortLevelSettings());
        this.validationEnabled = validationEnabled;
    }
    public TrafficPolicyBuilder(TrafficPolicy instance){
            this(instance,true);
    }
    public TrafficPolicyBuilder(TrafficPolicy instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.withLoadBalancer(instance.getLoadBalancer());
        fluent.withConnectionPool(instance.getConnectionPool());
        fluent.withOutlierDetection(instance.getOutlierDetection());
        fluent.withPortLevelSettings(instance.getPortLevelSettings());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public TrafficPolicy build(){
        TrafficPolicy buildable = new TrafficPolicy(fluent.getLoadBalancer(),fluent.getConnectionPool(),fluent.getOutlierDetection(),fluent.getPortLevelSettings());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TrafficPolicyBuilder that = (TrafficPolicyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
