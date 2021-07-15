package com.istio.model.virtualservice;

/**
 * @Classname VirtualServiceSpecHttpMirrorFluent
 * @Description TODO
 * @Date 2020/10/20 0020 16:09
 * @Create by llarao
 */
public class SpecHttpMirrorFluentImpl<A extends SpecHttpMirrorFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SpecHttpMirrorFluent<A> {
    private String host;
    private String subset;

    public SpecHttpMirrorFluentImpl(){
    }
    public SpecHttpMirrorFluentImpl(SpecHttpMirror instance){
        this.setHost(instance.getHost());
        this.setSubset(instance.getSubset());
    }

    @Override
    public String getHost() {
        return this.host;
    }

    @Override
    public A setHost(String host) {
        this.host = host;
        return (A) this;
    }

    @Override
    public String getSubset() {
        return this.subset;
    }

    @Override
    public A setSubset(String subset) {
        this.subset = subset;
        return (A) this;

    }
}
