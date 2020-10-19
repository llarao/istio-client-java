package com.paas.istio.model.serviceentry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Classname ServiceEntryFluentImpl
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public class ServiceEntrySpecFluentImpl<A extends ServiceEntrySpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ServiceEntrySpecFluent<A> {

    private List<String> hosts;
    private List<String> addresses;
    private List<ServiceEntryPortBuilder> ports;
    private String location;
    private String resolution;
    private List<String> subjectAltNames;
    private List<ServiceEntryEndpointBuilder> endpoints;
    private String exportTo;

    public ServiceEntrySpecFluentImpl(){
    }
    public ServiceEntrySpecFluentImpl(ServiceEntrySpec instance){
        this.withHosts(instance.getHosts());
        this.withAddresses(instance.getAddresses());
        this.withPorts(instance.getPorts());
        this.withLocation(instance.getLocation());
        this.withResolution(instance.getResolution());
        this.withSubjectAltNames(instance.getSubjectAltNames());
        this.withEndpoints(instance.getEndpoints());
        this.withExportTo(instance.getExportTo());
    }

    @Override
    public List<String> getHosts() {
        return this.hosts==null?new ArrayList<>():this.hosts;
    }

    @Override
    public List<String> buildHosts() {
        return this.hosts==null?new ArrayList<>():this.hosts;
    }

    @Override
    public String buildHosts(int index) {
        return this.hosts.get(index);
    }

    @Override
    public A withHosts(List<String> items) {
        if (items!=null) {
            this.hosts = items;
        }
        return (A)this;
    }

    @Override
    public A withHosts(String... items) {
        if (this.hosts==null) {
            this.hosts = new ArrayList<>();
        }
        if (items!=null) {
            this.hosts.addAll(Arrays.asList(items));
        }
        return (A)this;
    }

    @Override
    public Boolean hasHosts() {
        return this.hosts != null;
    }

    @Override
    public A addNewHost(String specHttp) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        return (A)this;

    }

    @Override
    public A addToHost(int index, String item) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(index, item);
        return (A)this;

    }

    @Override
    public A setToHost(int index, String item) {
        if (this.hosts==null) {
            this.hosts = new ArrayList<>();
        }
        if (this.hosts.size() >= index) {
            this.hosts.set(index, item);
        } else {
            this.hosts.add(item);
        }
        return (A)this;

    }

    @Override
    public A addToHost(String... items) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }

        this.hosts.addAll(Arrays.asList(items));
        return (A)this;
    }

    @Override
    public A addAllToHosts(Collection<String> items) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }

        this.hosts.addAll(items);
        return (A)this;
    }

    @Override
    public A removeFromHost(String... items) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        for (String item : items) {
            this.hosts.remove(item);
        }
        return (A)this;
    }

    @Override
    public A removeAllFromHosts(Collection<String> items) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        for (String item : items) {
            this.hosts.remove(item);
        }
        return (A)this;
    }

    @Override
    public List<String> getAddresses() {
        return this.addresses==null?new ArrayList<>():this.addresses;
    }

    @Override
    public List<String> buildAddresses() {
        return this.addresses==null?new ArrayList<>():this.addresses;
    }

    @Override
    public String buildAddresses(int index) {
        return this.addresses.get(index);
    }

    @Override
    public A withAddresses(List<String> items) {
        if (items!=null) {
            this.addresses = items;
        }
        return (A)this;
    }

    @Override
    public A withAddresses(String... items) {
        if (this.addresses==null) {
            this.addresses = new ArrayList<>();
        }
        if (items!=null) {
            this.addresses.addAll(Arrays.asList(items));
        }
        return (A)this;
    }

    @Override
    public Boolean hasAddresses() {
        return this.addresses != null;
    }

    @Override
    public A addNewAddresse(String specHttp) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        return (A)this;
    }

    @Override
    public A addToAddresse(int index, String item) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(index, item);
        return (A)this;
    }

    @Override
    public A setToAddresse(int index, String item) {
        if (this.addresses==null) {
            this.addresses = new ArrayList<>();
        }
        if (this.addresses.size() >= index) {
            this.addresses.set(index, item);
        } else {
            this.addresses.add(item);
        }
        return (A)this;
    }

    @Override
    public A addToAddresse(String... items) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }

        this.addresses.addAll(Arrays.asList(items));
        return (A)this;
    }

    @Override
    public A addAllToAddresses(Collection<String> items) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }

        this.addresses.addAll(items);
        return (A)this;
    }

    @Override
    public A removeFromAddresse(String... items) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        for (String item : items) {
            this.addresses.remove(item);
        }
        return (A)this;
    }

    @Override
    public A removeAllFromAddresses(Collection<String> items) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        for (String item : items) {
            this.addresses.remove(item);
        }
        return (A)this;
    }

    @Override
    public List<ServiceEntryPort> getPorts() {
        return build(ports);
    }

    @Override
    public ServiceEntryPort buildPorts(int index) {
        return this.ports.get(index).build();
    }

    @Override
    public List<ServiceEntryPort> buildPorts() {
        return build(ports);
    }

    @Override
    public A withPorts(List<ServiceEntryPort> ports) {
        if (this.ports != null) {
            _visitables.get("ports").removeAll(this.ports);
        }
        if (ports != null) {
            this.ports = new ArrayList<>();
            for (ServiceEntryPort item : ports){
                this.addToPorts(item);
            }
        } else {
            this.ports = null;
        }
        return (A) this;
    }

    @Override
    public A withPorts(ServiceEntryPort... ports) {
        if (this.ports != null) {
            this.ports.clear();
        }
        if (ports != null) {
            for (ServiceEntryPort item :ports){
                this.addToPorts(item);
            }
        }
        return (A) this;
    }

    @Override
    public Boolean hasPorts() {
        return ports!=null;
    }

    @Override
    public ServiceEntryPortNested<A> addNewPorts() {
        return new ServiceEntryPortNestedImpl<>();
    }

    @Override
    public ServiceEntryPortNested<A> setNewPortLike(ServiceEntryPort item) {
        return new ServiceEntryPortNestedImpl<>(-1,item);
    }

    @Override
    public ServiceEntryPortNested<A> setNewPortLike(int i, ServiceEntryPort item) {
        return new ServiceEntryPortNestedImpl<>(i,item);
    }

    @Override
    public ServiceEntryPortNested<A> editFirstPorts() {
        if (ports.size() == 0) {
            throw new RuntimeException("Can't edit ports. Index exceeds size.");
        }
        return setNewPortLike(0, buildPorts(0));    }

    @Override
    public ServiceEntryPortNested<A> editLastPorts() {
        int index = ports.size() - 1;
        if (index < 0) {
            throw new RuntimeException("Can't edit ports. Index exceeds size.");
        }
        return setNewPortLike(0, buildPorts(0));
    }

    @Override
    public ServiceEntryPortNested<A> editPorts(int i) {
        if (ports.size() <= 0) {
            throw new RuntimeException("Can't edit ports. Index exceeds size.");
        }
        return setNewPortLike(i, buildPorts(i));    }

    @Override
    public A addNewPorts(ServiceEntryPort specHttp) {
        return this.addToPorts(-1,specHttp);
    }

    @Override
    public A setToPorts(int index, ServiceEntryPort item) {
        if (this.ports == null) {
            this.ports = new ArrayList<ServiceEntryPortBuilder>();
        }
        ServiceEntryPortBuilder builder = new ServiceEntryPortBuilder(item);
        if (index < 0 || index >= _visitables.get("ports").size()) {
            _visitables.get("ports").add(builder);
        } else {
            _visitables.get("ports").set(index, builder);
        }
        if (index < 0 || index >= ports.size()) {
            ports.add(builder);
        } else {
            ports.set(index, builder);
        }
        return (A)this;
    }

    @Override
    public A addToPorts(int index, ServiceEntryPort item) {
        if (this.ports == null) {
            this.ports = new ArrayList<ServiceEntryPortBuilder>();
        }
        ServiceEntryPortBuilder builder = new ServiceEntryPortBuilder(item);
        _visitables.get("ports").add(index >= 0 ? index : _visitables.get("ports").size(), builder);
        this.ports.add(index >= 0 ? index : ports.size(), builder);
        return (A)this;
    }

    @Override
    public A addToPorts(ServiceEntryPort... items) {
        if (this.ports == null) {
            this.ports = new ArrayList<ServiceEntryPortBuilder>();
        }
        for (ServiceEntryPort item : items) {
            ServiceEntryPortBuilder builder = new ServiceEntryPortBuilder(item);
            _visitables.get("ports").add(builder);
            this.ports.add(builder);
        }
        return (A)this;
    }

    @Override
    public A addAllToPorts(Collection<ServiceEntryPort> items) {
        if (this.ports == null) {
            this.ports = new ArrayList<ServiceEntryPortBuilder>();
        }
        for (ServiceEntryPort item : items) {
            ServiceEntryPortBuilder builder = new ServiceEntryPortBuilder(item);
            _visitables.get("ports").add(builder);
            this.ports.add(builder);
        }
        return (A)this;
    }

    @Override
    public A removeFromPorts(ServiceEntryPort... items) {
        for (ServiceEntryPort item : items) {
            ServiceEntryPortBuilder builder = new ServiceEntryPortBuilder(item);
            _visitables.get("ports").remove(builder);
            if (this.ports != null) {
                this.ports.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public A removeAllFromPorts(Collection<ServiceEntryPort> items) {
        for (ServiceEntryPort item : items) {
            ServiceEntryPortBuilder builder = new ServiceEntryPortBuilder(item);
            _visitables.get("ports").remove(builder);
            if (this.ports != null) {
                this.ports.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public A withLocation(String location) {
        this.location = location;
        return (A)this;

    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public A withResolution(String resolution) {
        this.resolution = resolution;
        return (A)this;

    }

    @Override
    public String getResolution() {
        return this.resolution;
    }

    @Override
    public List<String> getSubjectAltNames() {
        return this.subjectAltNames==null?new ArrayList<>():this.subjectAltNames;
    }

    @Override
    public List<String> buildSubjectAltNames() {
        return this.subjectAltNames==null?new ArrayList<>():this.subjectAltNames;
    }

    @Override
    public String buildSubjectAltNames(int index) {
        return this.subjectAltNames.get(index);
    }

    @Override
    public A withSubjectAltNames(List<String> items) {
        if (items!=null) {
            this.subjectAltNames = items;
        }
        return (A)this;
    }

    @Override
    public A withSubjectAltNames(String... items) {
        if (this.subjectAltNames==null) {
            this.subjectAltNames = new ArrayList<>();
        }
        if (items!=null) {
            this.subjectAltNames.addAll(Arrays.asList(items));
        }
        return (A)this;
    }

    @Override
    public Boolean hasSubjectAltNames() {
        return this.subjectAltNames != null;
    }

    @Override
    public A addNewSubjectAltName(String specHttp) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }
        return (A)this;
    }

    @Override
    public A addToSubjectAltName(int index, String item) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }
        this.subjectAltNames.add(index, item);
        return (A)this;
    }

    @Override
    public A setToSubjectAltName(int index, String item) {
        if (this.subjectAltNames==null) {
            this.subjectAltNames = new ArrayList<>();
        }
        if (this.subjectAltNames.size() >= index) {
            this.subjectAltNames.set(index, item);
        } else {
            this.subjectAltNames.add(item);
        }
        return (A)this;
    }

    @Override
    public A addToSubjectAltName(String... items) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }

        this.subjectAltNames.addAll(Arrays.asList(items));
        return (A)this;
    }

    @Override
    public A addAllToSubjectAltNames(Collection<String> items) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }

        this.subjectAltNames.addAll(items);
        return (A)this;
    }

    @Override
    public A removeFromSubjectAltName(String... items) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }
        for (String item : items) {
            this.subjectAltNames.remove(item);
        }
        return (A)this;
    }

    @Override
    public A removeAllFromSubjectAltNames(Collection<String> items) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }
        for (String item : items) {
            this.subjectAltNames.remove(item);
        }
        return (A)this;
    }

    @Override
    public List<ServiceEntryEndpoint> getEndpoints() {
        return build(endpoints);
    }

    @Override
    public ServiceEntryEndpoint buildEndpoints(int index) {
        return this.endpoints.get(index).build();
    }

    @Override
    public List<ServiceEntryEndpoint> buildEndpoints() {
        return build(endpoints);
    }

    @Override
    public A withEndpoints(List<ServiceEntryEndpoint> endpoints) {
        if (this.endpoints != null) {
            _visitables.get("endpoints").removeAll(this.endpoints);
        }
        if (endpoints != null) {
            this.endpoints = new ArrayList<>();
            for (ServiceEntryEndpoint item : endpoints){
                this.addToEndpoints(item);
            }
        } else {
            this.endpoints = null;
        }
        return (A) this;
    }

    @Override
    public A withEndpoints(ServiceEntryEndpoint... endpoints) {
        if (this.endpoints != null) {
            this.endpoints.clear();
        }
        if (endpoints != null) {
            for (ServiceEntryEndpoint item :endpoints){
                this.addToEndpoints(item);
            }
        }
        return (A) this;
    }

    @Override
    public Boolean hasEndpoints() {
        return endpoints!=null;
    }

    @Override
    public ServiceEntryEndpointNested<A> addNewEndpoints() {
        return new ServiceEntryEndpointNestedImpl<>();
    }

    @Override
    public ServiceEntryEndpointNested<A> setNewEndpointLike(ServiceEntryEndpoint item) {
        return new ServiceEntryEndpointNestedImpl<>(-1,item);
    }

    @Override
    public ServiceEntryEndpointNested<A> setNewEndpointLike(int i, ServiceEntryEndpoint item) {
        return new ServiceEntryEndpointNestedImpl<>(i,item);
    }

    @Override
    public ServiceEntryEndpointNested<A> editFirstEndpoints() {
        if (endpoints.size() == 0) {
            throw new RuntimeException("Can't edit endpoints. Index exceeds size.");
        }
        return setNewEndpointLike(0, buildEndpoints(0));
    }

    @Override
    public ServiceEntryEndpointNested<A> editLastEndpoints() {
        int index = endpoints.size() - 1;
        if (index < 0) {
            throw new RuntimeException("Can't edit endpoints. Index exceeds size.");
        }
        return setNewEndpointLike(0, buildEndpoints(0));
    }

    @Override
    public ServiceEntryEndpointNested<A> editEndpoints(int i) {
        if (endpoints.size() <= 0) {
            throw new RuntimeException("Can't edit endpoints. Index exceeds size.");
        }
        return setNewEndpointLike(i, buildEndpoints(i));    }

    @Override
    public A addNewEndpoints(ServiceEntryEndpoint specHttp) {
        return this.addToEndpoints(-1,specHttp);
    }

    @Override
    public A setToEndpoints(int index, ServiceEntryEndpoint item) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<ServiceEntryEndpointBuilder>();
        }
        ServiceEntryEndpointBuilder builder = new ServiceEntryEndpointBuilder(item);
        if (index < 0 || index >= _visitables.get("endpoints").size()) {
            _visitables.get("endpoints").add(builder);
        } else {
            _visitables.get("endpoints").set(index, builder);
        }
        if (index < 0 || index >= endpoints.size()) {
            endpoints.add(builder);
        } else {
            endpoints.set(index, builder);
        }
        return (A)this;
    }

    @Override
    public A addToEndpoints(int index, ServiceEntryEndpoint item) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<ServiceEntryEndpointBuilder>();
        }
        ServiceEntryEndpointBuilder builder = new ServiceEntryEndpointBuilder(item);
        _visitables.get("endpoints").add(index >= 0 ? index : _visitables.get("endpoints").size(), builder);
        this.endpoints.add(index >= 0 ? index : endpoints.size(), builder);
        return (A)this;
    }

    @Override
    public A addToEndpoints(ServiceEntryEndpoint... items) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<ServiceEntryEndpointBuilder>();
        }
        for (ServiceEntryEndpoint item : items) {
            ServiceEntryEndpointBuilder builder = new ServiceEntryEndpointBuilder(item);
            _visitables.get("endpoints").add(builder);
            this.endpoints.add(builder);
        }
        return (A)this;
    }

    @Override
    public A addAllToEndpoints(Collection<ServiceEntryEndpoint> items) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<ServiceEntryEndpointBuilder>();
        }
        for (ServiceEntryEndpoint item : items) {
            ServiceEntryEndpointBuilder builder = new ServiceEntryEndpointBuilder(item);
            _visitables.get("endpoints").add(builder);
            this.endpoints.add(builder);
        }
        return (A)this;
    }

    @Override
    public A removeFromEndpoints(ServiceEntryEndpoint... items) {
        for (ServiceEntryEndpoint item : items) {
            ServiceEntryEndpointBuilder builder = new ServiceEntryEndpointBuilder(item);
            _visitables.get("endpoints").remove(builder);
            if (this.endpoints != null) {
                this.endpoints.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public A removeAllFromEndpoints(Collection<ServiceEntryEndpoint> items) {
        for (ServiceEntryEndpoint item : items) {
            ServiceEntryEndpointBuilder builder = new ServiceEntryEndpointBuilder(item);
            _visitables.get("endpoints").remove(builder);
            if (this.endpoints != null) {
                this.endpoints.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public A withExportTo(String exportTo) {
        this.exportTo = exportTo;
        return (A)this;

    }

    @Override
    public String getExportTo() {
        return this.exportTo;
    }


    public class ServiceEntryPortNestedImpl<N> extends ServiceEntryPortFluentImpl<ServiceEntryPortNested<N>> implements ServiceEntryPortNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private ServiceEntryPortBuilder builder;
        private final int index;

        ServiceEntryPortNestedImpl(int index, ServiceEntryPort item){
            this.index = index;
            this.builder = new ServiceEntryPortBuilder(this, item);
        }
        ServiceEntryPortNestedImpl(){
            this.index = -1;
            this.builder = new ServiceEntryPortBuilder(this);
        }

        @Override
        public N and(){
            return (N) ServiceEntrySpecFluentImpl.this.setToPorts(index,builder.build());
        }

        @Override
        public N endPorts() {
            return and();
        }


    }


    public class ServiceEntryEndpointNestedImpl<N> extends ServiceEntryEndpointFluentImpl<ServiceEntryEndpointNested<N>> implements ServiceEntryEndpointNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private ServiceEntryEndpointBuilder builder;
        private final int index;

        ServiceEntryEndpointNestedImpl(int index, ServiceEntryEndpoint item){
            this.index = index;
            this.builder = new ServiceEntryEndpointBuilder(this, item);
        }
        ServiceEntryEndpointNestedImpl(){
            this.index = -1;
            this.builder = new ServiceEntryEndpointBuilder(this);
        }

        @Override
        public N and(){
            return (N) ServiceEntrySpecFluentImpl.this.setToEndpoints(index,builder.build());
        }

        @Override
        public N endEndpoints() {
            return and();
        }


    }
}
