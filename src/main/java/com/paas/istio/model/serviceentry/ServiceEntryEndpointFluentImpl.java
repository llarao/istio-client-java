package com.paas.istio.model.serviceentry;


import com.paas.istio.model.gateway.GatewayServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname ServiceEntryFluentImpl
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public class ServiceEntryEndpointFluentImpl<A extends ServiceEntryEndpointFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ServiceEntryEndpointFluent<A> {
    private List<String> address;
    private Map<String, Integer> ports;
    private Map<String, String> labels;
    private String network;
    private String locality;
    private Integer weight;

    public ServiceEntryEndpointFluentImpl(){
    }
    public ServiceEntryEndpointFluentImpl(ServiceEntryEndpoint instance){
        this.withAddresss(instance.getAddress());
        this.withPort(instance.getPorts());
        this.withLabel(instance.getLabels());
        this.withNetwork(instance.getNetwork());
        this.withLocality(instance.getLocality());
        this.withWeight(instance.getWeight());
    }

    @Override
    public List<String> getAddresss() {
        return this.address==null?new ArrayList<>():this.address;
    }

    @Override
    public List<String> buildAddresss() {
        return this.address==null?new ArrayList<>():this.address;
    }

    @Override
    public String buildAddresss(int index) {
        return this.address.get(index);
    }

    @Override
    public A withAddresss(List<String> items) {
        if (items!=null) {
            this.address = items;
        }
        return (A)this;
    }

    @Override
    public A withAddresss(String... items) {
        if (this.address==null) {
            this.address = new ArrayList<>();
        }
        if (items!=null) {
            this.address.addAll(Arrays.asList(items));
        }
        return (A)this;
    }

    @Override
    public Boolean hasAddresss() {
        return this.address != null;
    }

    @Override
    public A addNewAddress(String specHttp) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        return (A)this;
    }

    @Override
    public A addToAddress(int index, String item) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        this.address.add(index, item);
        return (A)this;    }

    @Override
    public A setToAddress(int index, String item) {
        if (this.address==null) {
            this.address = new ArrayList<>();
        }
        if (this.address.size() >= index) {
            this.address.set(index, item);
        } else {
            this.address.add(item);
        }
        return (A)this;
    }

    @Override
    public A addToAddress(String... items) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }

        this.address.addAll(Arrays.asList(items));
        return (A)this;
    }

    @Override
    public A addAllToAddresss(Collection<String> items) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }

        this.address.addAll(items);
        return (A)this;
    }

    @Override
    public A removeFromAddress(String... items) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        for (String item : items) {
            this.address.remove(item);
        }
        return (A)this;
    }

    @Override
    public A removeAllFromAddresss(Collection<String> items) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        for (String item : items) {
            this.address.remove(item);
        }
        return (A)this;
    }

    @Override
    public Map<String, Integer> getPort() {
        return this.ports==null?new HashMap<>():this.ports;
    }

    @Override
    public Map<String, Integer> buildPort() {
        return this.ports==null?new HashMap<>():this.ports;
    }

    @Override
    public Integer buildPort(String key) {
        return this.ports==null?null:this.ports.get(key);
    }

    @Override
    public A withPort(Map<String, Integer> item) {
        this.ports = item;
        return (A)this;
    }

    @Override
    public Boolean hasPort() {
        return this.ports != null;
    }

    @Override
    public A addNewPort(String key, Integer item) {
        if (this.ports==null) {
            this.ports = new HashMap<>();
        }
        this.ports.put(key, item);
        return (A)this;
    }

    @Override
    public A removeFromPort(String... keys) {
        if (keys!=null) {
            if (this.ports != null) {
                for (String key : keys) {
                    this.ports.remove(key);
                }
            }
        }
        return (A)this;
    }

    @Override
    public Map<String, String> getLabel() {
        return this.labels==null?new HashMap<>():this.labels;
    }

    @Override
    public Map<String, String> buildLabel() {
        return this.labels==null?new HashMap<>():this.labels;
    }

    @Override
    public String buildLabel(String key) {
        return this.labels==null?null:this.labels.get(key);
    }

    @Override
    public A withLabel(Map<String, String> item) {
        this.labels = item;
        return (A)this;
    }

    @Override
    public Boolean hasLabel() {
        return this.labels != null;
    }

    @Override
    public A addNewLabel(String key, String item) {
        if (this.labels==null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, item);
        return (A)this;
    }

    @Override
    public A removeFromLabel(String... keys) {
        if (keys!=null) {
            if (this.labels != null) {
                for (String key : keys) {
                    this.labels.remove(key);
                }
            }
        }
        return (A)this;
    }

    @Override
    public A withNetwork(String network) {
        this.network = network;
        return (A)this;
    }

    @Override
    public String getNetwork() {
        return this.network;
    }

    @Override
    public A withLocality(String locality) {
        this.locality = locality;
        return (A)this;
    }

    @Override
    public String getLocality() {
        return this.locality;
    }

    @Override
    public A withWeight(Integer weight) {
        this.weight = weight;
        return (A) this;
    }

    @Override
    public Integer getWeight() {
        return this.weight;
    }
}
