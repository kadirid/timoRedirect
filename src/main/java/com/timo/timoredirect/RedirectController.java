package com.timo.timoredirect;

import okhttp3.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/getCompanyByURL")
public class RedirectController {

    @GetMapping()
    public String getCompanyByURL(String company) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://timo24.de/timoadmin/baseurl?company=" + company).build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

}
