package ru.mirea.trpp_second_6.entity;
import ru.mirea.trpp_second_6.entity;

public class HealthResponse {
    private String status;

    public HealthResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
