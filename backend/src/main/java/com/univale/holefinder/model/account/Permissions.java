package com.univale.holefinder.model.account;

public enum  Permissions {
    ADM("Administration permission"),
    COMMON_USER("Standard permission"),
    NOT_REGISTERED("Weak permission");

    private String description;

    Permissions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
