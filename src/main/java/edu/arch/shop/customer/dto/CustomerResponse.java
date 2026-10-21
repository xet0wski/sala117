package edu.arch.shop.customer.dto;

public record CustomerResponse(
        Long id,
        String name,
        String email,
        String phone
) {
}