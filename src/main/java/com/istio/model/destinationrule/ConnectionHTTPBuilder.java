package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class ConnectionHTTPBuilder extends ConnectionHTTPFluentImpl<ConnectionHTTPBuilder> implements VisitableBuilder<ConnectionHTTP, ConnectionHTTPBuilder>{

    ConnectionHTTPFluent<?> fluent;
    Boolean validationEnabled;

    public ConnectionHTTPBuilder(){
            this(true);
    }
    public ConnectionHTTPBuilder(Boolean validationEnabled){
        this(new ConnectionHTTP(), validationEnabled);
    }
    public ConnectionHTTPBuilder(ConnectionHTTPFluent<?> fluent){
            this(fluent, true);
    }
    public ConnectionHTTPBuilder(ConnectionHTTPFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new ConnectionHTTP(), validationEnabled);
    }
    public ConnectionHTTPBuilder(ConnectionHTTPFluent<?> fluent, ConnectionHTTP instance){
            this(fluent, instance, true);
    }
    public ConnectionHTTPBuilder(ConnectionHTTPFluent<?> fluent, ConnectionHTTP instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.withHttp1MaxPendingRequests(instance.getHttp1MaxPendingRequests());
        fluent.withHttp2MaxRequests(instance.getHttp2MaxRequests());
        fluent.withMaxRequestsPerConnection(instance.getMaxRequestsPerConnection());
        fluent.withMaxRetries(instance.getMaxRetries());
        fluent.withIdleTimeout(instance.getIdleTimeout());
        this.validationEnabled = validationEnabled;
    }
    public ConnectionHTTPBuilder(ConnectionHTTP instance){
            this(instance,true);
    }
    public ConnectionHTTPBuilder(ConnectionHTTP instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.withHttp1MaxPendingRequests(instance.getHttp1MaxPendingRequests());
        fluent.withHttp2MaxRequests(instance.getHttp2MaxRequests());
        fluent.withMaxRequestsPerConnection(instance.getMaxRequestsPerConnection());
        fluent.withMaxRetries(instance.getMaxRetries());
        fluent.withIdleTimeout(instance.getIdleTimeout());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public ConnectionHTTP build(){
        ConnectionHTTP buildable = new ConnectionHTTP(fluent.getHttp1MaxPendingRequests(), fluent.getHttp2MaxRequests(), fluent.getMaxRequestsPerConnection(), fluent.getMaxRetries(), fluent.getIdleTimeout());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConnectionHTTPBuilder that = (ConnectionHTTPBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
