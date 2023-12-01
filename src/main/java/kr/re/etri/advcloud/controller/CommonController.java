package kr.re.etri.advcloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

public class CommonController {

    protected Logger logger = LoggerFactory.getLogger(CommonController.class);
    protected Object param = null;

    public ApiResponseMessage responseSuccess() {
        return responseSuccess(null);
    }

    public ApiResponseMessage responseSuccess(Object data) {
        ApiResponseMessage response = new ApiResponseMessage(true);
        response.setData(data);

        writeSuccessLog(response);

        return response;
    }

    public ApiResponseMessage responseError(String errorMessage) {
        ApiResponseMessage response = new ApiResponseMessage(false);
        response.setErrorMessage(errorMessage);

        writeErrorLog(response);

        return response;
    }

    public void writeSuccessLog(ApiResponseMessage responseMessage) {
        this.logger.info(setLogFormat(responseMessage));
    }

    public void writeErrorLog(ApiResponseMessage responseMessage) {
        this.logger.error(setLogFormat(responseMessage));
    }

    public String setLogFormat(ApiResponseMessage responseMessage) {
        return String.format("\napi > %s, request > userId: %s, param: %s \nresponse > %s", ServletUriComponentsBuilder.fromCurrentRequestUri().build().getPath(), getCurrentPrincipalName(), this.param.toString(), responseMessage.toString());
    }

    public String getCurrentPrincipalName() {
        HttpServletRequest req = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();

        return req.getHeader("userId");
    }
}
