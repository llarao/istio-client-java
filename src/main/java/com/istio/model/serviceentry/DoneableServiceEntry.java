package com.istio.model.serviceentry;


import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

/**
 * @Classname DoneableServiceEntry
 * @Description TODO
 * @Date 2020/10/17 0017 10:20
 * @Create by llarao
 */
public class DoneableServiceEntry extends ServiceEntryFluentImpl<DoneableServiceEntry> implements Doneable<ServiceEntry> {


    private final ServiceEntryBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ServiceEntry,ServiceEntry> function;

    public DoneableServiceEntry(io.fabric8.kubernetes.api.builder.Function<ServiceEntry,ServiceEntry> function){
        super();this.builder=new ServiceEntryBuilder(this);this.function=function;
    }
    public DoneableServiceEntry(ServiceEntry item,io.fabric8.kubernetes.api.builder.Function<ServiceEntry,ServiceEntry> function){
        super(item);this.builder=new ServiceEntryBuilder(this, item);this.function=function;
    }
    public DoneableServiceEntry(ServiceEntry item){
        super(item);this.builder=new ServiceEntryBuilder(this, item);this.function=new Function<ServiceEntry, ServiceEntry>() {
            @Override
            public ServiceEntry apply(ServiceEntry item) {
                return item;
            }
        }
        ;
    }

    @Override
    public ServiceEntry done(){
        return function.apply(builder.build());
    }

}
