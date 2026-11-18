package com.apimanagement.apikey;

import java.util.ArrayList;
import java.util.List;

public class ApiKeyService {

    private List<ApiKey> apiKeys = new ArrayList<>();

    public void generateApiKey(ApiKey key) {

        apiKeys.add(key);

        System.out.println("API Key generated successfully!");
    }

    public void displayApiKeys() {

        for (ApiKey key : apiKeys) {

            System.out.println("Key ID: " + key.getKeyId());
            System.out.println("Key Name: " + key.getKeyName());
            System.out.println("Status: " + key.getStatus());
            System.out.println("Expiration: " + key.getExpirationDays() + " days");
            System.out.println("User ID: " + key.getUserId());

            System.out.println("-------------------");
        }
        
    }
 // Activate API Key
    public void activateApiKey(int keyId) {

        for (ApiKey key : apiKeys) {

            if (key.getKeyId() == keyId) {
                key.setStatus("ACTIVE");
                System.out.println("API Key activated!");
                return;
            }
            if (key.getStatus().equals("REVOKED")) {
                System.out.println("Revoked keys cannot be activated!");
                return;
            }
        }

        System.out.println("API Key not found!");
    }

    // Deactivate API Key
    public void deactivateApiKey(int keyId) {

        for (ApiKey key : apiKeys) {

            if (key.getKeyId() == keyId) {
                key.setStatus("INACTIVE");
                System.out.println("API Key deactivated!");
                return;
            }
        }

        System.out.println("API Key not found!");
    }

    // Revoke API Key
    public void revokeApiKey(int keyId) {

        for (ApiKey key : apiKeys) {

            if (key.getKeyId() == keyId) {
                key.setStatus("REVOKED");
                System.out.println("API Key revoked!");
                return;
            }
        }

        System.out.println("API Key not found!");
    }
}