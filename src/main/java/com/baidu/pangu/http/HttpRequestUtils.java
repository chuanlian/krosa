package com.baidu.pangu.http;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangchuanlian on 2016/8/2.
 */
public class HttpRequestUtils {

    public static final String GET_URL = "http://127.0.0.1:8044/api/accept2?username=测试帐号&password=123456";

    public static final String POST_URL = "http://127.0.0.1:8044/api/accept2";

    public static final String POST_URL_1 = "http://127.0.0.1:8044/api/accept1";

    public static String doGet() {
        String content = "";
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(GET_URL);
            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
            try {
                if (httpResponse != null && httpResponse.getStatusLine().getStatusCode() == 200) {
                    System.out.println(httpResponse.getStatusLine());
                    HttpEntity entity = httpResponse.getEntity();
                    content = EntityUtils.toString(entity, "UTF-8");
                }
            } finally {
                httpResponse.close();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return content;
    }

    public static String doPost() {
        String content = "";
        try {
            // 创建默认的httpClient实例
            CloseableHttpClient httpClient = HttpClients.createDefault();
            // 创建HttpResponse
            HttpPost httpPost = new HttpPost(POST_URL);
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("username", "测试用户名"));
            nameValuePairs.add(new BasicNameValuePair("password", "password"));
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
            CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
            try {
                if (httpResponse != null && httpResponse.getStatusLine().getStatusCode() == 200) {
                    System.out.println(httpResponse.getStatusLine());
                    HttpEntity entity = httpResponse.getEntity();
                    if (entity != null) {
                        content = EntityUtils.toString(entity, "UTF-8");
                    }
                }
            } finally {
                httpResponse.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return content;
    }

    /**
     * 发送json
     *
     * @param jsonText
     * @return
     */
    public static String doPost(String jsonText) {
        String content = "";
        // 创建默认的httpClient实例.
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 创建HttpResponse
        HttpPost httpPost = new HttpPost(POST_URL_1);
        try {
            StringEntity ReqEntity = new StringEntity(jsonText);
            ReqEntity.setContentEncoding("UTF-8");
            //发送json数据需要设置contentType
            ReqEntity.setContentType("application/json");
            httpPost.setEntity(ReqEntity);
            HttpResponse res = httpClient.execute(httpPost);
            if (res != null && res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                System.out.println(res.getStatusLine());
                HttpEntity responseEntity = res.getEntity();
                content = EntityUtils.toString(responseEntity, "UTF-8");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return content;
    }
}
