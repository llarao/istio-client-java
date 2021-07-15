package com.istio.model.gateway;

import io.fabric8.kubernetes.api.builder.Fluent;

import java.util.Collection;
import java.util.List;

/**
 * @Classname VirtualServiceFluent
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public interface GatewayServerFluent<A extends GatewayServerFluent<A>> extends Fluent<A> {


    GatewayPort getPort();
    GatewayPort buildPort();
    A withPort(GatewayPort item);
    Boolean hasPort();
    GatewayPortNested<A> withNewPort();
    GatewayPortNested<A> withNewPortLike(GatewayPort item);
    GatewayPortNested<A> editPort();
    GatewayPortNested<A> editOrNewPort();
    GatewayPortNested<A> editOrNewPortLike(GatewayPort item);

    List<String> getHosts();
    List<String> buildHosts();
    String buildHosts(int index);
    A withHosts(List<String> items);
    A withHosts(String... items);
    Boolean hasHosts();
    A addNewHost(String specHttp);
    A addToHost(int index, String item);
    A setToHost(int index, String item);
    A addToHost(String... items);
    A addAllToHosts(Collection<String> items);
    A removeFromHost(String... items);
    A removeAllFromHosts(Collection<String> items);

    A withDefaultEndpoint(String defaultEndpoint);
    String getDefaultEndpoint();

    GatewayTLS getTls();
    GatewayTLS buildTls();
    A withTls(GatewayTLS item);
    Boolean hasTls();
    GatewayTLSNested<A> withNewTls();
    GatewayTLSNested<A> withNewTlsLike(GatewayTLS item);
    GatewayTLSNested<A> editTls();
    GatewayTLSNested<A> editOrNewTls();
    GatewayTLSNested<A> editOrNewTlsLike(GatewayTLS item);

    public interface GatewayPortNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, GatewayPortFluent<GatewayPortNested<N>> {
        public N and();    public N endPort();
    }

    public interface GatewayTLSNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, GatewayTLSFluent<GatewayTLSNested<N>> {
        public N and();    public N endTls();
    }

}
