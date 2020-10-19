package com.paas.istio.client.dsl;

import io.fabric8.kubernetes.client.APIGroupExtensionAdapter;
import io.fabric8.kubernetes.client.Client;
import okhttp3.OkHttpClient;

public class IstioAPIGroupExtensionAdapter extends APIGroupExtensionAdapter<IstiosAPIGroupClient> {

  @Override
  protected String getAPIGroupName() {
    return "networking.istio.io";
  }

  @Override
  public Class<IstiosAPIGroupClient> getExtensionType() {
    return IstiosAPIGroupClient.class;
  }

  @Override
  protected IstiosAPIGroupClient newInstance(Client client) {
    return new IstiosAPIGroupClient(client.adapt(OkHttpClient.class), client.getConfiguration());
  }
}

