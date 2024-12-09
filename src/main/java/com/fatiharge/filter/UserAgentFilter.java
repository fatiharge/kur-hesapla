package com.fatiharge.filter;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.ext.Provider;
import jakarta.ws.rs.core.Response;

@Provider
public class UserAgentFilter implements ContainerRequestFilter {

    private static final String ALLOWED_USER_AGENT = "kur-hesapla/1.0";

    @Override
    public void filter(ContainerRequestContext requestContext) {
        String userAgent = requestContext.getHeaderString("User-Agent");
        if (userAgent == null || !userAgent.contains(ALLOWED_USER_AGENT)) {
            requestContext.abortWith(Response.status(Response.Status.FORBIDDEN)
                    .entity("Access forbidden: Invalid User-Agent")
                    .build());
        }
    }
}

