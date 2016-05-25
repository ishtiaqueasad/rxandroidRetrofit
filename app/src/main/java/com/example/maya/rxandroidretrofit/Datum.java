
package com.example.maya.rxandroidretrofit;

import java.util.HashMap;
import java.util.Map;


public class Datum {

    public Integer id;
    public Integer specialistId;
    public String body;
    public String email;
    public String source;
    public String status;
    public String image;
    public String location;
    public Integer parentId;
    public Integer userId;
    public String gender;
    public String language;
    public String type;
    public Integer mediaId;
    public String questionCreatedAt;
    public String questionUpdatedAt;
    public Integer featured;
    public String referredTo;
    public String referredBy;
    public String referredTime;
    public String questionTime;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
