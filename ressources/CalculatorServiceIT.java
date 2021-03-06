package com.devops.calculator;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

public class CalculatorServiceIT {

    @Test
    public void testAdd() throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("  http://ip:port/calculator/api/calculator/add?x=8&y=26   ");
        HttpResponse response = httpclient.execute(httpGet);
        assertEquals(200, response.getStatusLine().getStatusCode());
        assertThat(EntityUtils.toString(response.getEntity()), containsString("\"result\":34"));
    }
 @Test
    public void testSub() throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("   http://ip:port/calculator/api/calculator/add?x=8&y=26   ");
        HttpResponse response = httpclient.execute(httpGet);
        assertEquals(200, response.getStatusLine().getStatusCode());
        assertThat(EntityUtils.toString(response.getEntity()), containsString("\"result\":34"));
    }
 @Test
    public void testMull() throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("   http://ip:port/calculator/api/calculator/add?x=8&y=26    ");
        HttpResponse response = httpclient.execute(httpGet);
        assertEquals(200, response.getStatusLine().getStatusCode());
        assertThat(EntityUtils.toString(response.getEntity()), containsString("\"result\":34"));
    }
     @Test
    public void testDiv() throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("  http://ip:port/calculator/api/calculator/add?x=8&y=26    ");
        HttpResponse response = httpclient.execute(httpGet);
        assertEquals(200, response.getStatusLine().getStatusCode());
        assertThat(EntityUtils.toString(response.getEntity()), containsString("\"result\":34"));
    }
}


