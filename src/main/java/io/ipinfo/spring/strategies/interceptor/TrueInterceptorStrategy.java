package io.ipinfo.spring.strategies.interceptor;

import jakarta.servlet.http.HttpServletRequest;

public class TrueInterceptorStrategy implements InterceptorStrategy {
    @Override
    public boolean shouldRun(HttpServletRequest request) {
        return true;
    }
}
