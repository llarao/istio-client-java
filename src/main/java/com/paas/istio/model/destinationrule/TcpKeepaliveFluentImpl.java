package com.paas.istio.model.destinationrule;

import com.paas.istio.model.virtualservice.SpecHttp;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class TcpKeepaliveFluentImpl<A extends TcpKeepaliveFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TcpKeepaliveFluent<A> {

    /**
     * 多少次探测没有应答认为连接断开,linux默认配置为9
     */
    private Integer probes;
    /**
     * 连接空闲多少时间后开始探测,linux默认为2h
     */
    private String time;
    /**
     * 探测间隔时间,linux默认为75s
     */
    private String interval;

    public TcpKeepaliveFluentImpl(){
    }
    public TcpKeepaliveFluentImpl(TcpKeepalive instance){
        this.withProbes(instance.getProbes());
        this.withTime(instance.getTime());
        this.withInterval(instance.getInterval());
    }

    @Override
    public A withProbes(Integer probes) {
        this.probes = probes;
        return (A)this;
    }

    @Override
    public Integer getProbes() {
        return this.probes;
    }

    @Override
    public A withTime(String time) {
        this.time = time;
        return (A)this;

    }

    @Override
    public String getTime() {
        return this.time;
    }

    @Override
    public A withInterval(String interval) {
        this.interval = interval;
        return (A)this;

    }

    @Override
    public String getInterval() {
        return this.interval;
    }
}
