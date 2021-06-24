package bio.terra.swagger_oidc;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebFilter(urlPatterns = "/swagger-ui-bundle.js")
public class SwaggerUiFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        SwaggerUiResponseWrapper capturingResponseWrapper = new SwaggerUiResponseWrapper(
                (HttpServletResponse) response);

        chain.doFilter(request, capturingResponseWrapper);

        String modifiedContent = capturingResponseWrapper.getCaptureAsString();

        if(modifiedContent.contains("response_type=token")) {
            modifiedContent = modifiedContent.replace("response_type=token", "response_type=id_token");
        }

        byte[] encoded = modifiedContent.getBytes(response.getCharacterEncoding());

        response.setContentLength(encoded.length);
        response.getOutputStream().write(encoded);

        //System.out.println(modifiedContent);
        System.out.println(response.getContentType());
        System.out.println(response.getCharacterEncoding());
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }
}
