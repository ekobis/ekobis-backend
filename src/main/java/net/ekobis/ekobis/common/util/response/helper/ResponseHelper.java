package net.ekobis.ekobis.common.util.response.helper;

import net.ekobis.ekobis.common.util.response.DataResponse;
import net.ekobis.ekobis.common.util.response.ExceptionResponse;

public class ResponseHelper {

    // ---- For Exception ----

    public static ExceptionResponse NOT_FOUND_PRODUCT_ID(){
        return new ExceptionResponse(false,"Not Found Product ID");
    }

    public static ExceptionResponse DELETED_PRODUCT_ID(){
        return new ExceptionResponse(false,"Deleted Product ID");
    }

    // ---- For Database ----

    public static <T>DataResponse<T> POST_DATA(T data){
        return new DataResponse<>(true,data);
    }

    public static <T>DataResponse<T> PUT_DATA(T data){
        return new DataResponse<>(true,data);
    }

    public static <T>DataResponse<T> LIST_DATA(T data){
        return new DataResponse<>(true,data);
    }

    public static <T>DataResponse<T> GET_DATA(T data){
        return new DataResponse<>(true,data);
    }
}
