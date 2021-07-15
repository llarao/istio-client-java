package com.istio.model.serviceentry;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class ServiceEntryBuilder extends ServiceEntryFluentImpl<ServiceEntryBuilder> implements VisitableBuilder<ServiceEntry, ServiceEntryBuilder>{

    ServiceEntryFluent<?> fluent;
    Boolean validationEnabled;

    public ServiceEntryBuilder(){
            this(true);
    }
    public ServiceEntryBuilder(Boolean validationEnabled){
        this(new ServiceEntry(), validationEnabled);
    }
    public ServiceEntryBuilder(ServiceEntryFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceEntryBuilder(ServiceEntryFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new ServiceEntry(), validationEnabled);
    }
    public ServiceEntryBuilder(ServiceEntryFluent<?> fluent, ServiceEntry instance){
            this(fluent, instance, true);
    }
    public ServiceEntryBuilder(ServiceEntryFluent<?> fluent, ServiceEntry instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withApiVersion(instance.getApiVersion());
            fluent.withKind(instance.getKind());
            fluent.withMetadata(instance.getMetadata());
            fluent.withSpec(instance.getSpec());
            this.validationEnabled = validationEnabled;
    }
    public ServiceEntryBuilder(ServiceEntry instance){
            this(instance,true);
    }
    public ServiceEntryBuilder(ServiceEntry instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withApiVersion(instance.getApiVersion());
            fluent.withKind(instance.getKind());
            fluent.withMetadata(instance.getMetadata());
            fluent.withSpec(instance.getSpec());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public ServiceEntry build(){
        ServiceEntry buildable = new ServiceEntry(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceEntryBuilder that = (ServiceEntryBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
