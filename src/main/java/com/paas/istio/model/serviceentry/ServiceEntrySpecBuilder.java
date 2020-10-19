package com.paas.istio.model.serviceentry;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

import java.util.List;

public class ServiceEntrySpecBuilder extends ServiceEntrySpecFluentImpl<ServiceEntrySpecBuilder> implements VisitableBuilder<ServiceEntrySpec, ServiceEntrySpecBuilder>{

    ServiceEntrySpecFluent<?> fluent;
    Boolean validationEnabled;

    private List<String> hosts;
    private List<String> addresses;
    private List<ServiceEntryPortBuilder> ports;
    private String location;
    private String resolution;
    private List<String> subjectAltNames;
    private List<ServiceEntryEndpointBuilder> endpoints;
    private String exportTo;

    public ServiceEntrySpecBuilder(){
            this(true);
    }
    public ServiceEntrySpecBuilder(Boolean validationEnabled){
        this(new ServiceEntrySpec(), validationEnabled);
    }
    public ServiceEntrySpecBuilder(ServiceEntrySpecFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceEntrySpecBuilder(ServiceEntrySpecFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new ServiceEntrySpec(), validationEnabled);
    }
    public ServiceEntrySpecBuilder(ServiceEntrySpecFluent<?> fluent, ServiceEntrySpec instance){
            this(fluent, instance, true);
    }
    public ServiceEntrySpecBuilder(ServiceEntrySpecFluent<?> fluent, ServiceEntrySpec instance, Boolean validationEnabled){
            this.fluent = fluent;
        fluent.withHosts(instance.getHosts());
        fluent.withAddresses(instance.getAddresses());
        fluent.withPorts(instance.getPorts());
        fluent.withLocation(instance.getLocation());
        fluent.withResolution(instance.getResolution());
        fluent.withSubjectAltNames(instance.getSubjectAltNames());
        fluent.withEndpoints(instance.getEndpoints());
        fluent.withExportTo(instance.getExportTo());
            this.validationEnabled = validationEnabled;
    }
    public ServiceEntrySpecBuilder(ServiceEntrySpec instance){
            this(instance,true);
    }
    public ServiceEntrySpecBuilder(ServiceEntrySpec instance, Boolean validationEnabled){
            this.fluent = this;
        fluent.withHosts(instance.getHosts());
        fluent.withAddresses(instance.getAddresses());
        fluent.withPorts(instance.getPorts());
        fluent.withLocation(instance.getLocation());
        fluent.withResolution(instance.getResolution());
        fluent.withSubjectAltNames(instance.getSubjectAltNames());
        fluent.withEndpoints(instance.getEndpoints());
        fluent.withExportTo(instance.getExportTo());

        this.validationEnabled = validationEnabled;
    }




    @Override
    public ServiceEntrySpec build(){
        ServiceEntrySpec buildable = new ServiceEntrySpec(fluent.getHosts(),
                fluent.getAddresses(),
                fluent.getPorts(),
                fluent.getLocation(),
                fluent.getResolution(),
                fluent.getSubjectAltNames(),
                fluent.getEndpoints(),
                fluent.getExportTo());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceEntrySpecBuilder that = (ServiceEntrySpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
