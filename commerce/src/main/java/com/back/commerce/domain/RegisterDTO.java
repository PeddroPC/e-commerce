package com.back.commerce.domain;

public record RegisterDTO(String login, String password, UserRole role) {
}
