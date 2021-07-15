package com.istio.model.gateway;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class GatewayTLSBuilder extends GatewayTLSFluentImpl<GatewayTLSBuilder> implements VisitableBuilder<GatewayTLS, GatewayTLSBuilder>{

    GatewayTLSFluent<?> fluent;
    Boolean validationEnabled;

    public GatewayTLSBuilder(){
            this(true);
    }
    public GatewayTLSBuilder(Boolean validationEnabled){
        this(new GatewayTLS(), validationEnabled);
    }
    public GatewayTLSBuilder(GatewayTLSFluent<?> fluent){
            this(fluent, true);
    }
    public GatewayTLSBuilder(GatewayTLSFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new GatewayTLS(), validationEnabled);
    }
    public GatewayTLSBuilder(GatewayTLSFluent<?> fluent, GatewayTLS instance){
            this(fluent, instance, true);
    }
    public GatewayTLSBuilder(GatewayTLSFluent<?> fluent, GatewayTLS instance, Boolean validationEnabled){
            this.fluent = fluent;
        fluent.withHttpsRedirect(instance.getHttpsRedirect());
        fluent.withMode(instance.getMode());
        fluent.withServerCertificate(instance.getServerCertificate());
        fluent.withPrivateKey(instance.getPrivateKey());
        fluent.withCaCertificates(instance.getCaCertificates());
        fluent.withCredentialName(instance.getCredentialName());
        fluent.withSubjectAltNames(instance.getSubjectAltNames());
        fluent.withMinProtocolVersion(instance.getMinProtocolVersion());
        fluent.withMaxProtocolVersion(instance.getMaxProtocolVersion());
        fluent.withCipherSuites(instance.getCipherSuites());
            this.validationEnabled = validationEnabled;
    }
    public GatewayTLSBuilder(GatewayTLS instance){
            this(instance,true);
    }
    public GatewayTLSBuilder(GatewayTLS instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withHttpsRedirect(instance.getHttpsRedirect());
            fluent.withMode(instance.getMode());
            fluent.withServerCertificate(instance.getServerCertificate());
            fluent.withPrivateKey(instance.getPrivateKey());
            fluent.withCaCertificates(instance.getCaCertificates());
            fluent.withCredentialName(instance.getCredentialName());
            fluent.withSubjectAltNames(instance.getSubjectAltNames());
            fluent.withMinProtocolVersion(instance.getMinProtocolVersion());
            fluent.withMaxProtocolVersion(instance.getMaxProtocolVersion());
            fluent.withCipherSuites(instance.getCipherSuites());
            this.validationEnabled = validationEnabled;

    }

    @Override
    public GatewayTLS build(){
        GatewayTLS buildable = new GatewayTLS(fluent.getHttpsRedirect(),
                fluent.getMode(),
                fluent.getServerCertificate(),
                fluent.getPrivateKey(),
                fluent.getCaCertificates(),
                fluent.getCredentialName(),
                fluent.getSubjectAltNames(),
                fluent.getMinProtocolVersion(),
                fluent.getMaxProtocolVersion(),
                fluent.getCipherSuites());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GatewayTLSBuilder that = (GatewayTLSBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
