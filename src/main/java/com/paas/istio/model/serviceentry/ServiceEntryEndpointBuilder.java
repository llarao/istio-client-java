package com.paas.istio.model.serviceentry;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class ServiceEntryEndpointBuilder extends ServiceEntryEndpointFluentImpl<ServiceEntryEndpointBuilder> implements VisitableBuilder<ServiceEntryEndpoint, ServiceEntryEndpointBuilder>{

    ServiceEntryEndpointFluent<?> fluent;
    Boolean validationEnabled;

    public ServiceEntryEndpointBuilder(){
            this(true);
    }
    public ServiceEntryEndpointBuilder(Boolean validationEnabled){
        this(new ServiceEntryEndpoint(), validationEnabled);
    }
    public ServiceEntryEndpointBuilder(ServiceEntryEndpointFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceEntryEndpointBuilder(ServiceEntryEndpointFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new ServiceEntryEndpoint(), validationEnabled);
    }
    public ServiceEntryEndpointBuilder(ServiceEntryEndpointFluent<?> fluent, ServiceEntryEndpoint instance){
            this(fluent, instance, true);
    }
    public ServiceEntryEndpointBuilder(ServiceEntryEndpointFluent<?> fluent, ServiceEntryEndpoint instance, Boolean validationEnabled){
            this.fluent = fluent;
        fluent.withAddresss(instance.getAddress());
        fluent.withPort(instance.getPorts());
        fluent.withLabel(instance.getLabels());
        fluent.withNetwork(instance.getNetwork());
        fluent.withLocality(instance.getLocality());
        fluent.withWeight(instance.getWeight());
            this.validationEnabled = validationEnabled;
    }
    public ServiceEntryEndpointBuilder(ServiceEntryEndpoint instance){
            this(instance,true);
    }
    public ServiceEntryEndpointBuilder(ServiceEntryEndpoint instance, Boolean validationEnabled){
            this.fluent = this;
        fluent.withAddresss(instance.getAddress());
        fluent.withPort(instance.getPorts());
        fluent.withLabel(instance.getLabels());
        fluent.withNetwork(instance.getNetwork());
        fluent.withLocality(instance.getLocality());
        fluent.withWeight(instance.getWeight());

        this.validationEnabled = validationEnabled;
    }

    @Override
    public ServiceEntryEndpoint build(){
        ServiceEntryEndpoint buildable = new ServiceEntryEndpoint(fluent.getAddresss(), fluent.getPort(), fluent.getLabel(), fluent.getNetwork(), fluent.getLocality(), fluent.getWeight());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceEntryEndpointBuilder that = (ServiceEntryEndpointBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
