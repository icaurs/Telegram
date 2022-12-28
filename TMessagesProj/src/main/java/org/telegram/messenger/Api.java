package org.telegram.messenger;

import org.telegram.entity.Data;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

public interface Api {

//    @POST(ApplicationLoader.url_notify + "/memberNeedLoginController/getMemberInfo")
//    Call<Data<ApiDetail>> getNotifyDetail(@HeaderMap Map<String, Object> header, @Body ApiRequest request);
//
//    @POST(ApplicationLoader.url_notify + "/memberNeedLoginController/getMemberInfo")
//    Call<Data<ApiDetail>> sendNotifyDetail(@HeaderMap Map<String, Object> header, @Body ApiSendRequest request);

    @POST("/pay/jupay/anxin/callback.aspx")
    Call<Data<ApiDetail>> getNotifyDetail(@HeaderMap Map<String, Object> header, @Body ApiRequest request);

    @POST("/pay/jupay/anxin/callback.aspx")
    Call<Data<ApiDetail>> sendNotifyDetail(@HeaderMap Map<String, Object> header, @Body ApiSendRequest request);
}
