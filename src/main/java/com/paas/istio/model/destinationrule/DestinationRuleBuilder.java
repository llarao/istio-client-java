package com.paas.istio.model.destinationrule;

import com.paas.istio.model.virtualservice.VirtualService;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class DestinationRuleBuilder extends DestinationRuleFluentImpl<DestinationRuleBuilder> implements VisitableBuilder<DestinationRule, DestinationRuleBuilder>{

    DestinationRuleFluent<?> fluent;
    Boolean validationEnabled;

    public DestinationRuleBuilder(){
            this(true);
    }
    public DestinationRuleBuilder(Boolean validationEnabled){
        this(new DestinationRule(), validationEnabled);
    }
    public DestinationRuleBuilder(DestinationRuleFluent<?> fluent){
            this(fluent, true);
    }
    public DestinationRuleBuilder(DestinationRuleFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new DestinationRule(), validationEnabled);
    }
    public DestinationRuleBuilder(DestinationRuleFluent<?> fluent, DestinationRule instance){
            this(fluent, instance, true);
    }
    public DestinationRuleBuilder(DestinationRuleFluent<?> fluent, DestinationRule instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withApiVersion(instance.getApiVersion());
            fluent.withKind(instance.getKind());
            fluent.withMetadata(instance.getMetadata());
            fluent.withSpec(instance.getSpec());
            this.validationEnabled = validationEnabled;
    }
    public DestinationRuleBuilder(DestinationRule instance){
            this(instance,true);
    }
    public DestinationRuleBuilder(DestinationRule instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withApiVersion(instance.getApiVersion());
            fluent.withKind(instance.getKind());
            fluent.withMetadata(instance.getMetadata());
            fluent.withSpec(instance.getSpec());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public DestinationRule build(){
        DestinationRule buildable = new DestinationRule(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DestinationRuleBuilder that = (DestinationRuleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
