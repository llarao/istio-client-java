package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface ConnectionTCPFluent<A extends ConnectionTCPFluent<A>> extends Fluent<A> {



    A withMaxConnections(Integer integer);
    Integer getMaxConnections();

    A withConnecTimeout(Integer integer);
    Integer getConnecTimeout();


    TcpKeepalive getTcpKeepalive();
    TcpKeepalive buildTcpKeepalive();
    A withTcpKeepalive(TcpKeepalive item);
    Boolean hasTcpKeepalive();
    TcpKeepaliveNested<A> withNewTcpKeepalive();
    TcpKeepaliveNested<A> withNewTcpKeepaliveLike(TcpKeepalive item);
    TcpKeepaliveNested<A> editTcpKeepalive();
    TcpKeepaliveNested<A> editOrNewTcpKeepalive();
    TcpKeepaliveNested<A> editOrNewTcpKeepaliveLike(TcpKeepalive item);


    public interface TcpKeepaliveNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, TcpKeepaliveFluent<TcpKeepaliveNested<N>> {
        public N and();    public N endTcpKeepalive();
    }

}
