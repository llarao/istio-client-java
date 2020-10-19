package com.paas.istio.model.serviceentry;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class ServiceEntryPortBuilder extends ServiceEntryPortFluentImpl<ServiceEntryPortBuilder> implements VisitableBuilder<ServiceEntryPort, ServiceEntryPortBuilder>{

    ServiceEntryPortFluent<?> fluent;
    Boolean validationEnabled;

    public ServiceEntryPortBuilder(){
            this(true);
    }
    public ServiceEntryPortBuilder(Boolean validationEnabled){
        this(new ServiceEntryPort(), validationEnabled);
    }
    public ServiceEntryPortBuilder(ServiceEntryPortFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceEntryPortBuilder(ServiceEntryPortFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new ServiceEntryPort(), validationEnabled);
    }
    public ServiceEntryPortBuilder(ServiceEntryPortFluent<?> fluent, ServiceEntryPort instance){
            this(fluent, instance, true);
    }
    public ServiceEntryPortBuilder(ServiceEntryPortFluent<?> fluent, ServiceEntryPort instance, Boolean validationEnabled){
            this.fluent = fluent;
        fluent.withNumber(instance.getNumber());
        fluent.withName(instance.getName());
        fluent.withProtocol(instance.getProtocol());
            this.validationEnabled = validationEnabled;
    }
    public ServiceEntryPortBuilder(ServiceEntryPort instance){
            this(instance,true);
    }
    public ServiceEntryPortBuilder(ServiceEntryPort instance, Boolean validationEnabled){
            this.fluent = this;
        fluent.withNumber(instance.getNumber());
        fluent.withName(instance.getName());
        fluent.withProtocol(instance.getProtocol());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public ServiceEntryPort build(){
        ServiceEntryPort buildable = new ServiceEntryPort(fluent.getNumber(),fluent.getName(),fluent.getProtocol());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceEntryPortBuilder that = (ServiceEntryPortBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
