
package com.example.maya.rxandroidretrofit.Pojo;

import java.util.HashMap;
import java.util.Map;


public class Data {

    public Integer id;
    public String fName;
    public Object lName;
    public String email;
    public String type;
    public Object birthday;
    public Object age;
    public String gender;
    public Object nickname;
    public String maritalStatus;
    public Object phone;
    public Object occupation;
    public Object organisation;
    public Object designation;
    public Object website;
    public Object about;
    public Integer active;
    public Integer session;
    public Object _private;
    public Object fbId;
    public Object profilePic;
    public Object showNick;
    public Object subscription;
    public Object deletedAt;
    public String createdAt;
    public String updatedAt;
    public String ip;
    public String lat;
    public String _long;
    public String area;
    public String city;
    public String country;
    public String location;
    public String resetCode;
    public String source;
    public String verifications;
    public String status;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
