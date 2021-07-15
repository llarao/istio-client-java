package com.istio.model.gateway;


/**
 * @Classname GatewayFluentImpl
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public class GatewayPortFluentImpl<A extends GatewayPortFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GatewayPortFluent<A> {
    /**
     * 端口号
     */
    private Integer number;

    /**
     * 名称
     */
    private String name;

    /**
     * 协议
     */
    private String protocol;

    public GatewayPortFluentImpl(){
    }
    public GatewayPortFluentImpl(GatewayPort instance){
        this.withNumber(instance.getNumber());
        this.withName(instance.getName());
        this.withProtocol(instance.getProtocol());
    }

    @Override
    public A withNumber(Integer number) {
        this.number = number;
        return (A)this;
    }

    @Override
    public Integer getNumber() {
        return this.number;
    }

    @Override
    public A withName(String name) {
        this.name = name;
        return (A)this;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public A withProtocol(String protocol) {
        this.protocol = protocol;
        return (A)this;

    }

    @Override
    public String getProtocol() {
        return this.protocol;
    }
}
