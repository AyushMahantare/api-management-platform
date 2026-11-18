package com.apimanagement.apikey;

public class ApiKey {

    private int keyId;
    private String keyName;
    private String apiKey;
    private String status;
    private int expirationDays;
    private int userId;

    public ApiKey(int keyId, String keyName, String apiKey,
                  String status, int expirationDays, int userId) {

        this.keyId = keyId;
        this.keyName = keyName;
        this.apiKey = apiKey;
        this.status = status;
        this.expirationDays = expirationDays;
        this.userId = userId;
    }

    public int getKeyId() {
        return keyId;
    }

    public String getKeyName() {
        return keyName;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getStatus() {
        return status;
    }

    public int getExpirationDays() {
        return expirationDays;
    }

    public int getUserId() {
        return userId;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}