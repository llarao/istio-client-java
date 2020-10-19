package com.paas.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

/**
 * @Classname DoneableDestinationRule
 * @Description TODO
 * @Date 2020/10/17 0017 10:20
 * @Create by llarao
 */
public class DoneableDestinationRule extends DestinationRuleFluentImpl<DoneableDestinationRule> implements Doneable<DestinationRule> {

    private final DestinationRuleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DestinationRule,DestinationRule> function;

    public DoneableDestinationRule(io.fabric8.kubernetes.api.builder.Function<DestinationRule,DestinationRule> function){
        super();this.builder=new DestinationRuleBuilder(this);this.function=function;
    }
    public DoneableDestinationRule(DestinationRule item,io.fabric8.kubernetes.api.builder.Function<DestinationRule,DestinationRule> function){
        super(item);this.builder=new DestinationRuleBuilder(this, item);this.function=function;
    }
    public DoneableDestinationRule(DestinationRule item){
        super(item);this.builder=new DestinationRuleBuilder(this, item);this.function=new Function<DestinationRule, DestinationRule>() {
            @Override
            public DestinationRule apply(DestinationRule item) {
                return item;
            }
        }
        ;
    }

    @Override
    public DestinationRule done(){
        return function.apply(builder.build());
    }

}
