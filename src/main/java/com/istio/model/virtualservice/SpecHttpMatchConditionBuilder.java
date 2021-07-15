package com.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class SpecHttpMatchConditionBuilder extends SpecHttpMatchConditionFluentImpl<SpecHttpMatchConditionBuilder> implements VisitableBuilder<SpecHttpMatchCondition, SpecHttpMatchConditionBuilder>{

    SpecHttpMatchConditionFluent<?> fluent;
    Boolean validationEnabled;

    public SpecHttpMatchConditionBuilder(){
            this(true);
    }
    public SpecHttpMatchConditionBuilder(Boolean validationEnabled){
        this(new SpecHttpMatchCondition(), validationEnabled);
    }
    public SpecHttpMatchConditionBuilder(SpecHttpMatchConditionFluent<?> fluent){
            this(fluent, true);
    }
    public SpecHttpMatchConditionBuilder(SpecHttpMatchConditionFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new SpecHttpMatchCondition(), validationEnabled);
    }
    public SpecHttpMatchConditionBuilder(SpecHttpMatchConditionFluent<?> fluent, SpecHttpMatchCondition instance){
            this(fluent, instance, true);
    }
    public SpecHttpMatchConditionBuilder(SpecHttpMatchConditionFluent<?> fluent, SpecHttpMatchCondition instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.withExact(instance.getExact());
        fluent.withPrefix(instance.getPrefix());
        fluent.withRegex(instance.getRegex());
        this.validationEnabled = validationEnabled;
    }
    public SpecHttpMatchConditionBuilder(SpecHttpMatchCondition instance){
            this(instance,true);
    }
    public SpecHttpMatchConditionBuilder(SpecHttpMatchCondition instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.withExact(instance.getExact());
        fluent.withPrefix(instance.getPrefix());
        fluent.withRegex(instance.getRegex());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public SpecHttpMatchCondition build(){
        SpecHttpMatchCondition buildable = new SpecHttpMatchCondition(fluent.getExact(), fluent.getPrefix(), fluent.getRegex());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SpecHttpMatchConditionBuilder that = (SpecHttpMatchConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
