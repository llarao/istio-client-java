package com.paas.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class SubsetBuilder extends SubsetFluentImpl<SubsetBuilder> implements VisitableBuilder<Subset, SubsetBuilder>{

    SubsetFluent<?> fluent;
    Boolean validationEnabled;

    public SubsetBuilder(){
            this(true);
    }
    public SubsetBuilder(Boolean validationEnabled){
        this(new Subset(), validationEnabled);
    }
    public SubsetBuilder(SubsetFluent<?> fluent){
            this(fluent, true);
    }
    public SubsetBuilder(SubsetFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new Subset(), validationEnabled);
    }
    public SubsetBuilder(SubsetFluent<?> fluent, Subset instance){
            this(fluent, instance, true);
    }
    public SubsetBuilder(SubsetFluent<?> fluent, Subset instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.withName(instance.getName());
        fluent.withLabels(instance.getLabels());
        fluent.withTrafficPolicy(instance.getTrafficPolicy());
        this.validationEnabled = validationEnabled;
    }
    public SubsetBuilder(Subset instance){
            this(instance,true);
    }
    public SubsetBuilder(Subset instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.withName(instance.getName());
        fluent.withLabels(instance.getLabels());
        fluent.withTrafficPolicy(instance.getTrafficPolicy());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public Subset build(){
        Subset buildable = new Subset(fluent.getName(),fluent.getLabels(),fluent.getTrafficPolicy());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SubsetBuilder that = (SubsetBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
