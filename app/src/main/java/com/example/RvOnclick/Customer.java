package com.example.RvOnclick;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Customer {

    @PrimaryKey
    @NonNull

    private String customer_id;
    private String customer_name;
    private String territory;
    private String customer_group;
    private Boolean customer_disabled;

    @NonNull
    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(@NonNull String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getCustomer_group() {
        return customer_group;
    }

    public void setCustomer_group(String customer_group) {
        this.customer_group = customer_group;
    }

    public Boolean getCustomer_disabled() {
        return customer_disabled;
    }

    public void setCustomer_disabled(Boolean customer_disabled) {
        this.customer_disabled = customer_disabled;
    }
}
