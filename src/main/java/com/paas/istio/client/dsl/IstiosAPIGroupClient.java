package com.paas.istio.client.dsl;

import com.paas.istio.client.dsl.internal.DestinationRuleOperationsImpl;
import com.paas.istio.client.dsl.internal.GatewayOperationsImpl;
import com.paas.istio.client.dsl.internal.ServiceEntryOperationsImpl;
import com.paas.istio.client.dsl.internal.VirtualServiceOperationsImpl;
import com.paas.istio.model.destinationrule.DestinationRule;
import com.paas.istio.model.destinationrule.DestinationRuleList;
import com.paas.istio.model.destinationrule.DoneableDestinationRule;
import com.paas.istio.model.gateway.DoneableGateway;
import com.paas.istio.model.gateway.Gateway;
import com.paas.istio.model.gateway.GatewayList;
import com.paas.istio.model.serviceentry.DoneableServiceEntry;
import com.paas.istio.model.serviceentry.ServiceEntry;
import com.paas.istio.model.serviceentry.ServiceEntryList;
import com.paas.istio.model.virtualservice.DoneableVirtualService;
import com.paas.istio.model.virtualservice.VirtualService;
import com.paas.istio.model.virtualservice.VirtualServiceList;
import io.fabric8.kubernetes.client.BaseClient;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.KubernetesClientException;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import okhttp3.OkHttpClient;

public class IstiosAPIGroupClient extends BaseClient implements IstiosAPIGroupDSL {

  public IstiosAPIGroupClient() throws KubernetesClientException {
    super();
  }

  public IstiosAPIGroupClient(OkHttpClient httpClient, final Config config) throws KubernetesClientException {
    super(httpClient, config);
  }

  @Override
  public MixedOperation<VirtualService, VirtualServiceList, DoneableVirtualService, Resource<VirtualService, DoneableVirtualService>> virtualServices() {
    return new VirtualServiceOperationsImpl(httpClient,getConfiguration());
  }

  @Override
  public MixedOperation<DestinationRule, DestinationRuleList, DoneableDestinationRule, Resource<DestinationRule, DoneableDestinationRule>> destinationRules() {
    return new DestinationRuleOperationsImpl(httpClient,getConfiguration());
  }

  @Override
  public MixedOperation<Gateway, GatewayList, DoneableGateway, Resource<Gateway, DoneableGateway>> gateways() {
    return new GatewayOperationsImpl(httpClient,getConfiguration());
  }

  @Override
  public MixedOperation<ServiceEntry, ServiceEntryList, DoneableServiceEntry, Resource<ServiceEntry, DoneableServiceEntry>> serviceEntrys() {
    return new ServiceEntryOperationsImpl(httpClient,getConfiguration());
  }
}