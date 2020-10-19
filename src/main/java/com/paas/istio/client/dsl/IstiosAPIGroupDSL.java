package com.paas.istio.client.dsl;

import com.paas.istio.client.dsl.internal.DestinationRuleOperationsImpl;
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
import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;

public interface IstiosAPIGroupDSL extends Client {

  MixedOperation<VirtualService, VirtualServiceList, DoneableVirtualService, Resource<VirtualService, DoneableVirtualService>> virtualServices();

  MixedOperation<DestinationRule, DestinationRuleList, DoneableDestinationRule, Resource<DestinationRule, DoneableDestinationRule>> destinationRules();

  MixedOperation<Gateway, GatewayList, DoneableGateway, Resource<Gateway, DoneableGateway>> gateways();

  MixedOperation<ServiceEntry, ServiceEntryList, DoneableServiceEntry, Resource<ServiceEntry, DoneableServiceEntry>> serviceEntrys();


}