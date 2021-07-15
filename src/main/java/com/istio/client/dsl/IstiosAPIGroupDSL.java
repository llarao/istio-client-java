package com.istio.client.dsl;

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
import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;

public interface IstiosAPIGroupDSL extends Client {

  MixedOperation<VirtualService, VirtualServiceList, DoneableVirtualService, Resource<VirtualService, DoneableVirtualService>> virtualServices();

  MixedOperation<DestinationRule, DestinationRuleList, DoneableDestinationRule, Resource<DestinationRule, DoneableDestinationRule>> destinationRules();

  MixedOperation<Gateway, GatewayList, DoneableGateway, Resource<Gateway, DoneableGateway>> gateways();

  MixedOperation<ServiceEntry, ServiceEntryList, DoneableServiceEntry, Resource<ServiceEntry, DoneableServiceEntry>> serviceEntrys();


}