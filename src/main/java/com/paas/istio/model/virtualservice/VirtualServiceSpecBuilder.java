package com.paas.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

import java.lang.Object;
import java.lang.Boolean;

public class VirtualServiceSpecBuilder extends VirtualServiceSpecFluentImpl<VirtualServiceSpecBuilder> implements VisitableBuilder<VirtualServiceSpec, VirtualServiceSpecBuilder>{

    VirtualServiceSpecFluent<?> fluent;
    Boolean validationEnabled;

    public VirtualServiceSpecBuilder(){
            this(true);
    }
    public VirtualServiceSpecBuilder(Boolean validationEnabled){
        this(new VirtualServiceSpec(), validationEnabled);
    }
    public VirtualServiceSpecBuilder(VirtualServiceSpecFluent<?> fluent){
            this(fluent, true);
    }
    public VirtualServiceSpecBuilder(VirtualServiceSpecFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new VirtualServiceSpec(), validationEnabled);
    }
    public VirtualServiceSpecBuilder(VirtualServiceSpecFluent<?> fluent, VirtualServiceSpec instance){
            this(fluent, instance, true);
    }
    public VirtualServiceSpecBuilder(VirtualServiceSpecFluent<?> fluent, VirtualServiceSpec instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withHosts(instance.getHosts());
            fluent.withGateways(instance.getGateways());
            fluent.withHttps(instance.getHttp());
            this.validationEnabled = validationEnabled;
    }
    public VirtualServiceSpecBuilder(VirtualServiceSpec instance){
            this(instance,true);
    }
    public VirtualServiceSpecBuilder(VirtualServiceSpec instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withHosts(instance.getHosts());
            fluent.withGateways(instance.getGateways());
            fluent.withHttps(instance.getHttp());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public VirtualServiceSpec build(){
            VirtualServiceSpec buildable = new VirtualServiceSpec(fluent.getHosts(),fluent.getGateways(),fluent.getHttps());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VirtualServiceSpecBuilder that = (VirtualServiceSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
