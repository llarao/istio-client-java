package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface ConnectionPoolFluent<A extends ConnectionPoolFluent<A>> extends Fluent<A> {

    ConnectionHTTP getHttp();
    ConnectionHTTP buildHttp();
    A withHttp(ConnectionHTTP item);
    Boolean hasHttp();
    ConnectionHTTPNested<A> withNewHttp();
    ConnectionHTTPNested<A> withNewHttpLike(ConnectionHTTP item);
    ConnectionHTTPNested<A> editHttp();
    ConnectionHTTPNested<A> editOrNewHttp();
    ConnectionHTTPNested<A> editOrNewHttpLike(ConnectionHTTP item);

    ConnectionTCP getTcp();
    ConnectionTCP buildTcp();
    A withTcp(ConnectionTCP item);
    Boolean hasTcp();
    ConnectionTCPNested<A> withNewTcp();
    ConnectionTCPNested<A> withNewTcpLike(ConnectionTCP item);
    ConnectionTCPNested<A> editTcp();
    ConnectionTCPNested<A> editOrNewTcp();
    ConnectionTCPNested<A> editOrNewTcpLike(ConnectionTCP item);

    public interface ConnectionHTTPNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, ConnectionHTTPFluent<ConnectionHTTPNested<N>> {
        public N and();    public N endHttp();
    }
    
    public interface ConnectionTCPNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, ConnectionTCPFluent<ConnectionTCPNested<N>> {
        public N and();    public N endTcp();
    }
}
