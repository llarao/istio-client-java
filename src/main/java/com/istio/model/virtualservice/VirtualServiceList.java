package com.istio.model.virtualservice;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.ConfigMapList;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.ListMeta;
import io.fabric8.kubernetes.model.annotation.ApiGroup;
import io.fabric8.kubernetes.model.annotation.ApiVersion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname VirtualServiceList
 * @Description TODO
 * @Date 2020/10/17 0017 10:19
 * @Create by llarao
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"apiVersion", "kind", "metadata", "items"})
@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@ApiVersion("v1")
@ApiGroup("")
public class VirtualServiceList implements KubernetesResource, KubernetesResourceList {
    @JsonProperty("apiVersion")
    private String apiVersion = "networking.istio.io/v1alpha3";
    @JsonProperty("items")
    private List<VirtualService> items = new ArrayList();
    @JsonProperty("kind")
    private String kind = "VirtualServiceList";
    @JsonProperty("metadata")
    private ListMeta metadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap();

    public VirtualServiceList() {
    }

    public VirtualServiceList(String apiVersion, List<VirtualService> items, String kind, ListMeta metadata) {
        this.apiVersion = apiVersion;
        this.items = items;
        this.kind = kind;
        this.metadata = metadata;
    }

    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return this.apiVersion;
    }

    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("items")
    @Override
    public List<VirtualService> getItems() {
        return this.items;
    }

    @JsonProperty("items")
    public void setItems(List<VirtualService> items) {
        this.items = items;
    }

    @JsonProperty("kind")
    public String getKind() {
        return this.kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("metadata")
    @Override
    public ListMeta getMetadata() {
        return this.metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(ListMeta metadata) {
        this.metadata = metadata;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "VirtualServiceList(apiVersion=" + this.getApiVersion() + ", items=" + this.getItems() + ", kind=" + this.getKind() + ", metadata=" + this.getMetadata() + ", additionalProperties=" + this.getAdditionalProperties() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof VirtualServiceList)) {
            return false;
        } else {
            VirtualServiceList other = (VirtualServiceList) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71:
                {
                    Object this$apiVersion = this.getApiVersion();
                    Object other$apiVersion = other.getApiVersion();
                    if (this$apiVersion == null) {
                        if (other$apiVersion == null) {
                            break label71;
                        }
                    } else if (this$apiVersion.equals(other$apiVersion)) {
                        break label71;
                    }

                    return false;
                }

                Object this$items = this.getItems();
                Object other$items = other.getItems();
                if (this$items == null) {
                    if (other$items != null) {
                        return false;
                    }
                } else if (!this$items.equals(other$items)) {
                    return false;
                }

                label57:
                {
                    Object this$kind = this.getKind();
                    Object other$kind = other.getKind();
                    if (this$kind == null) {
                        if (other$kind == null) {
                            break label57;
                        }
                    } else if (this$kind.equals(other$kind)) {
                        break label57;
                    }

                    return false;
                }

                Object this$metadata = this.getMetadata();
                Object other$metadata = other.getMetadata();
                if (this$metadata == null) {
                    if (other$metadata != null) {
                        return false;
                    }
                } else if (!this$metadata.equals(other$metadata)) {
                    return false;
                }

                Object this$additionalProperties = this.getAdditionalProperties();
                Object other$additionalProperties = other.getAdditionalProperties();
                if (this$additionalProperties == null) {
                    if (other$additionalProperties == null) {
                        return true;
                    }
                } else if (this$additionalProperties.equals(other$additionalProperties)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ConfigMapList;
    }

}
