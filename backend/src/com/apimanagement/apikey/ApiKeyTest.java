package com.apimanagement.apikey;

public class ApiKeyTest {

    public static void main(String[] args) {

        ApiKeyService service = new ApiKeyService();

        ApiKey key1 = new ApiKey(
                101,
                "Payment API",
                "sample-key-123",
                "ACTIVE",
                30,
                1
        );

        service.generateApiKey(key1);

        service.displayApiKeys();
        
        service.generateApiKey(key1);

        service.displayApiKeys();

        service.deactivateApiKey(101);
        service.displayApiKeys();

        service.activateApiKey(101);
        service.displayApiKeys();

        service.revokeApiKey(101);
        service.displayApiKeys();
    }
    
}