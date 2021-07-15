package com.istio.model.virtualservice;

/**
 * @Classname VirtualServiceSpecHttpMatchConditionFluent
 * @Description TODO
 * @Date 2020/10/20 0020 17:56
 * @Create by llarao
 */
public class SpecHttpMatchConditionFluentImpl<A extends SpecHttpMatchConditionFluent<A>>
        extends io.fabric8.kubernetes.api.builder.BaseFluent<A>
        implements SpecHttpMatchConditionFluent<A> {
    private String exact;
    private String prefix;
    private String regex;

    public SpecHttpMatchConditionFluentImpl(){}

    public SpecHttpMatchConditionFluentImpl(SpecHttpMatchCondition instence) {
        this.withExact(instence.getExact());
        this.withPrefix(instence.getPrefix());
        this.withRegex(instence.getRegex());
    }

    @Override
    public String getExact() {
        return this.exact;
    }

    @Override
    public A withExact(String item) {
        this.exact = item;
        return (A)this;
    }

    @Override
    public String getPrefix() {
        return this.prefix;
    }

    @Override
    public A withPrefix(String item) {
        this.prefix = item;
        return (A)this;
    }

    @Override
    public String getRegex() {
        return this.regex;
    }

    @Override
    public A withRegex(String item) {
        return (A)this;
    }
}
