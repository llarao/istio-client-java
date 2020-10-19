package com.paas.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class SpecHttpRetriesBuilder extends SpecHttpRetriesFluentImpl<SpecHttpRetriesBuilder> implements VisitableBuilder<SpecHttpRetries, SpecHttpRetriesBuilder>{

    SpecHttpRetriesFluent<?> fluent;
    Boolean validationEnabled;

    public SpecHttpRetriesBuilder(){
            this(true);
    }
    public SpecHttpRetriesBuilder(Boolean validationEnabled){
        this(new SpecHttpRetries(), validationEnabled);
    }
    public SpecHttpRetriesBuilder(SpecHttpRetriesFluent<?> fluent){
            this(fluent, true);
    }
    public SpecHttpRetriesBuilder(SpecHttpRetriesFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new SpecHttpRetries(), validationEnabled);
    }
    public SpecHttpRetriesBuilder(SpecHttpRetriesFluent<?> fluent, SpecHttpRetries instance){
            this(fluent, instance, true);
    }
    public SpecHttpRetriesBuilder(SpecHttpRetriesFluent<?> fluent, SpecHttpRetries instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.setAttempts(instance.getAttempts());
        fluent.setPerTryTimeout(instance.getPerTryTimeout());
        fluent.setRetryOn(instance.getRetryOn());
        this.validationEnabled = validationEnabled;
    }
    public SpecHttpRetriesBuilder(SpecHttpRetries instance){
            this(instance,true);
    }
    public SpecHttpRetriesBuilder(SpecHttpRetries instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.setAttempts(instance.getAttempts());
        fluent.setPerTryTimeout(instance.getPerTryTimeout());
        fluent.setRetryOn(instance.getRetryOn());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public SpecHttpRetries build(){
        SpecHttpRetries buildable = new SpecHttpRetries(fluent.getAttempts(), fluent.getPerTryTimeout(),fluent.getRetryOn());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SpecHttpRetriesBuilder that = (SpecHttpRetriesBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
