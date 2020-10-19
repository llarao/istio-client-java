package com.paas.istio.model.destinationrule;

import com.paas.istio.model.virtualservice.SpecHttpFluent;
import com.paas.istio.model.virtualservice.SpecHttpFluentImpl;
import com.paas.istio.model.virtualservice.SpecHttpRetriesBuilder;
import com.paas.istio.model.virtualservice.SpecHttpRewrite;
import com.paas.istio.model.virtualservice.SpecHttpRewriteBuilder;
import com.paas.istio.model.virtualservice.SpecHttpRewriteFluentImpl;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class ConnectionTCPFluentImpl<A extends ConnectionTCPFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ConnectionTCPFluent<A> {
    /**
     * 最大等待连接数
     */
    private Integer maxConnections;

    /**
     * 超时时间
     */
    private Integer connecTimeout;

    /**
     * 存活性检查探测配置
     */
    private TcpKeepaliveBuilder tcpKeepalive;

    @Override
    public A withMaxConnections(Integer integer) {
        this.maxConnections = integer;
        return (A)this;
    }

    @Override
    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    @Override
    public A withConnecTimeout(Integer integer) {
        this.connecTimeout = integer;
        return (A)this;
    }

    @Override
    public Integer getConnecTimeout() {
        return this.connecTimeout;
    }

    @Override
    public TcpKeepalive getTcpKeepalive() {
        return this.tcpKeepalive!=null?this.tcpKeepalive.build():null;
    }

    @Override
    public TcpKeepalive buildTcpKeepalive() {
        return this.tcpKeepalive!=null?this.tcpKeepalive.build():null;
    }

    @Override
    public A withTcpKeepalive(TcpKeepalive tcpKeepalive) {
        _visitables.get("tcpKeepalive").remove(this.tcpKeepalive);
        if (tcpKeepalive!=null){ this.tcpKeepalive= new TcpKeepaliveBuilder(tcpKeepalive); _visitables.get("tcpKeepalive").add(this.tcpKeepalive);} return (A) this;
    }

    @Override
    public Boolean hasTcpKeepalive() {
        return this.tcpKeepalive!=null;
    }

    @Override
    public TcpKeepaliveNested<A> withNewTcpKeepalive() {
        return new TcpKeepaliveNestedImpl<>();
    }

    @Override
    public TcpKeepaliveNested<A> withNewTcpKeepaliveLike(TcpKeepalive item) {
        return new TcpKeepaliveNestedImpl<>(item);
    }

    @Override
    public TcpKeepaliveNested<A> editTcpKeepalive() {
        return withNewTcpKeepaliveLike(getTcpKeepalive());
    }

    @Override
    public TcpKeepaliveNested<A> editOrNewTcpKeepalive() {
        return withNewTcpKeepaliveLike(getTcpKeepalive() != null ? getTcpKeepalive(): new TcpKeepaliveBuilder().build());
    }

    @Override
    public TcpKeepaliveNested<A> editOrNewTcpKeepaliveLike(TcpKeepalive item) {
        return withNewTcpKeepaliveLike(getTcpKeepalive() != null ? getTcpKeepalive(): item);
    }


    public class TcpKeepaliveNestedImpl<N> extends TcpKeepaliveFluentImpl<TcpKeepaliveNested<N>> implements TcpKeepaliveNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private TcpKeepaliveBuilder builder;

        TcpKeepaliveNestedImpl(TcpKeepalive item){
            this.builder = new TcpKeepaliveBuilder(this, item);
        }
        TcpKeepaliveNestedImpl(){
            this.builder = new TcpKeepaliveBuilder(this);
        }

        @Override
        public N and(){
            return (N) ConnectionTCPFluentImpl.this.withNewTcpKeepaliveLike(builder.build());
        }

        @Override
        public N endTcpKeepalive() {
            return and();
        }
    }
}
