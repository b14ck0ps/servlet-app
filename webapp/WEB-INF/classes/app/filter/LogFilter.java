package app.filter;

import jakarta.servlet.*;
import java.io.IOException;
public class LogFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Log Filter Initialization");
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("User's IP: " + servletRequest.getRemoteAddr());
        filterChain.doFilter(servletRequest, servletResponse);
    }
    @Override
    public void destroy() {
        System.out.println("Log Filter Destruction");
    }
}
