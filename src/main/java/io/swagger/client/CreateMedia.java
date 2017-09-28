package io.swagger.client;

import com.squareup.okhttp.*;

import java.io.IOException;

/**
 * Created by isimevsk on 22.3.17.
 */
public class CreateMedia {

  public static void main(String [] args) {
    OkHttpClient client = new OkHttpClient();

    MediaType mediaType = MediaType.parse("multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
    RequestBody body = RequestBody.create(mediaType, "------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"json\"\r\n\r\n{\"origin\":\"file\",\"name\":\"testing\"}\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"file\"\r\n\r\n\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--");
    Request request = new Request.Builder()
        .url("https://api.phone.com/v4/accounts/1315091/media")
        .post(body)
        .addHeader("authorization", "Bearer RYg9fxC1QhAqoSW3Aw3Id0lF0qwD383In4QykeSp")
        .addHeader("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
        .addHeader("cache-control", "no-cache")
        .addHeader("postman-token", "cfa48d69-5ab6-23cd-aee9-9335cf194923")
        .build();

    Response response = null;
    try {
      response = client.newCall(request).execute();
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(response.body());
  }
}
