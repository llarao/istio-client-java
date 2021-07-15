package com.istio.model.virtualservice;

/**
 * @Classname VirtualServiceSpecHttpRewriteFluent
 * @Description TODO
 * @Date 2020/10/20 0020 16:02
 * @Create by llarao
 */
public class SpecHttpRewriteFluentImpl<A extends SpecHttpRewriteFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SpecHttpRewriteFluent<A> {
    private String uri;

    public SpecHttpRewriteFluentImpl() {

    }

    public SpecHttpRewriteFluentImpl(SpecHttpRewrite instence) {
        this.uri = instence.getUri();
    }

    @Override
    public A setUri(String item) {
        this.setUri(item);
        return (A) this;

    }

    @Override
    public String getUri() {
        return this.getUri();

    }
}
