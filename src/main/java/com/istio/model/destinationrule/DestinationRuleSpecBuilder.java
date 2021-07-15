package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class DestinationRuleSpecBuilder extends DestinationRuleSpecFluentImpl<DestinationRuleSpecBuilder> implements VisitableBuilder<DestinationRuleSpec, DestinationRuleSpecBuilder>{

    DestinationRuleSpecFluent<?> fluent;
    Boolean validationEnabled;

    public DestinationRuleSpecBuilder(){
            this(true);
    }
    public DestinationRuleSpecBuilder(Boolean validationEnabled){
        this(new DestinationRuleSpec(), validationEnabled);
    }
    public DestinationRuleSpecBuilder(DestinationRuleSpecFluent<?> fluent){
            this(fluent, true);
    }
    public DestinationRuleSpecBuilder(DestinationRuleSpecFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new DestinationRuleSpec(), validationEnabled);
    }
    public DestinationRuleSpecBuilder(DestinationRuleSpecFluent<?> fluent, DestinationRuleSpec instance){
            this(fluent, instance, true);
    }
    public DestinationRuleSpecBuilder(DestinationRuleSpecFluent<?> fluent, DestinationRuleSpec instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withHost(instance.getHost());
            fluent.withTrafficPolicy(instance.getTrafficPolicy());
            fluent.withSubset(instance.getSubsets());
            this.validationEnabled = validationEnabled;
    }
    public DestinationRuleSpecBuilder(DestinationRuleSpec instance){
            this(instance,true);
    }
    public DestinationRuleSpecBuilder(DestinationRuleSpec instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withHost(instance.getHost());
            fluent.withTrafficPolicy(instance.getTrafficPolicy());
            fluent.withSubset(instance.getSubsets());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public DestinationRuleSpec build(){
            DestinationRuleSpec buildable = new DestinationRuleSpec(fluent.getHost(),fluent.getTrafficPolicy(),fluent.getSubset());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DestinationRuleSpecBuilder that = (DestinationRuleSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
