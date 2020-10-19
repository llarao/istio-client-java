package com.paas.istio.model.destinationrule;

import com.paas.istio.model.virtualservice.SpecHttp;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class ConnectionHTTPFluentImpl<A extends ConnectionHTTPFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ConnectionHTTPFluent<A> {
    /**
     * 最大等待http请求数,默认1024,只支持http/1.1的服务.http/2协议的请求会在到来时立即复用连接不需要等待
     */
    private Integer http1MaxPendingRequests;

    /**
     * 最大http请求数,默认是1024,支持持http/2的服务
     */
    private Integer http2MaxRequests;

    /**
     * 每个连接的最大请求数,如果不配置默认不限制,如果配置了1,则表示每个连接只处理一个请求,也就是禁用了keep-alive
     */
    private Integer maxRequestsPerConnection;

    /**
     * 最大重试次数,默认为3
     */
    private Integer maxRetries;

    /**
     * 空闲时间关闭连接
     */
    private String idleTimeout;

    public ConnectionHTTPFluentImpl(){
    }
    public ConnectionHTTPFluentImpl(ConnectionHTTP instance){
        this.withHttp1MaxPendingRequests(instance.getHttp1MaxPendingRequests());
        this.withHttp2MaxRequests(instance.getHttp2MaxRequests());
        this.withMaxRequestsPerConnection(instance.getMaxRequestsPerConnection());
        this.withMaxRetries(instance.getHttp2MaxRequests());
        this.withIdleTimeout(instance.getIdleTimeout());
    }

    @Override
    public A withHttp1MaxPendingRequests(Integer i) {
        this.http1MaxPendingRequests = i;
        return (A) this;
    }

    @Override
    public Integer getHttp1MaxPendingRequests() {
        return this.http1MaxPendingRequests;
    }

    @Override
    public A withHttp2MaxRequests(Integer i) {
        this.http2MaxRequests = i;
        return (A) this;

    }

    @Override
    public Integer getHttp2MaxRequests() {
        return this.http2MaxRequests;
    }

    @Override
    public A withMaxRequestsPerConnection(Integer i) {
        this.maxRequestsPerConnection = i;
        return (A) this;

    }

    @Override
    public Integer getMaxRequestsPerConnection() {
        return this.maxRequestsPerConnection;
    }

    @Override
    public A withMaxRetries(Integer i) {
        this.maxRetries = i;
        return (A) this;

    }

    @Override
    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    @Override
    public A withIdleTimeout(String i) {
        this.idleTimeout = i;
        return (A) this;

    }

    @Override
    public String getIdleTimeout() {
        return this.idleTimeout;
    }
}
