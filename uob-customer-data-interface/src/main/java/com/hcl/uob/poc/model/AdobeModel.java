package com.hcl.uob.poc.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "email",
        "ctx"
})
public class AdobeModel {

    @JsonProperty("email")
    private String email;
    @JsonProperty("ctx")
    private Ctx ctx;

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("ctx")
    public Ctx getCtx() {
        return ctx;
    }

    @JsonProperty("ctx")
    public void setCtx(Ctx ctx) {
        this.ctx = ctx;
    }

    @Override
    public String toString() {
        return "AdobeModel{" +
                "email='" + email + '\'' +
                ", ctx=" + ctx +
                '}';
    }
}