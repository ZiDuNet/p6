package com.wushuo.p6.UserPortType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

public class main {
    public static void main(String[] args) throws IOException {
        //第一步：创建服务地址
        URL url = new URL("http://192.168.14.217:8206/p6ws/services/UserService?wsdl");
        //第二步：打开一个通向服务地址的连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //第三步：设置参数
        //3.1发送方式设置：POST必须大写
        connection.setRequestMethod("POST");
        //3.2设置数据格式：content-type
        connection.setRequestProperty("content-type", "text/xml;charset=utf-8");
        //3.3设置输入输出，因为默认新创建的connection没有读写权限，
        connection.setDoInput(true);
        connection.setDoOutput(true);

        //第四步：组织SOAP数据，发送请求
        String soapXML = getXML();
        //将信息以流的方式发送出去
        OutputStream os = connection.getOutputStream();
        os.write(soapXML.getBytes());
        //第五步：接收服务端响应，打印
        int responseCode = connection.getResponseCode();
        if(200 == responseCode){//表示服务端响应成功
            //获取当前连接请求返回的数据流
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            StringBuilder sb = new StringBuilder();
            String temp = null;
            while(null != (temp = br.readLine())){
                sb.append(temp);
            }

            /**
             * 打印结果
             */
            System.out.println(sb.toString());

            is.close();
            isr.close();
            br.close();
        }
        os.close();
    }



    public static String getXML() {
        String soapXML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v1=\"http://xmlns.oracle.com/Primavera/P6/WS/User/V1\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <v1:ReadUsers>\n" +
                "         <!--1 or more repetitions:-->\n" +
                "         <v1:Field>?</v1:Field>\n" +
                "         <!--Optional:-->\n" +
                "         <v1:Filter>?</v1:Filter>\n" +
                "         <!--Optional:-->\n" +
                "         <v1:OrderBy>?</v1:OrderBy>\n" +
                "      </v1:ReadUsers>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
        return soapXML;
    }}


