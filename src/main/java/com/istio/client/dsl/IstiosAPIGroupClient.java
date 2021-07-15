package com.istio.client.dsl;

import com.istio.client.dsl.internal.DestinationRuleOperationsImpl;
import com.istio.client.dsl.internal.GatewayOperationsImpl;
import com.istio.client.dsl.internal.ServiceEntryOperationsImpl;
import com.istio.client.dsl.internal.VirtualServiceOperationsImpl;
import com.istio.model.gateway.Gateway;
import com.istio.model.gateway.GatewayList;
import com.istio.model.serviceentry.DoneableServiceEntry;
import com.istio.model.serviceentry.ServiceEntryList;
import com.istio.model.destinationrule.DestinationRule;
import com.istio.model.destinationrule.DestinationRuleList;
import com.istio.model.destinationrule.DoneableDestinationRule;
import com.istio.model.gateway.DoneableGateway;
import com.istio.model.serviceentry.ServiceEntry;
import com.istio.model.virtualservice.DoneableVirtualService;
import com.istio.model.virtualservice.VirtualService;
import com.istio.model.virtualservice.VirtualServiceList;
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