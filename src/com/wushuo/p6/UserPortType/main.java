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
        //��һ�������������ַ
        URL url = new URL("http://192.168.14.217:8206/p6ws/services/UserService?wsdl");
        //�ڶ�������һ��ͨ������ַ������
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //�����������ò���
        //3.1���ͷ�ʽ���ã�POST�����д
        connection.setRequestMethod("POST");
        //3.2�������ݸ�ʽ��content-type
        connection.setRequestProperty("content-type", "text/xml;charset=utf-8");
        //3.3���������������ΪĬ���´�����connectionû�ж�дȨ�ޣ�
        connection.setDoInput(true);
        connection.setDoOutput(true);

        //���Ĳ�����֯SOAP���ݣ���������
        String soapXML = getXML();
        //����Ϣ�����ķ�ʽ���ͳ�ȥ
        OutputStream os = connection.getOutputStream();
        os.write(soapXML.getBytes());
        //���岽�����շ������Ӧ����ӡ
        int responseCode = connection.getResponseCode();
        if(200 == responseCode){//��ʾ�������Ӧ�ɹ�
            //��ȡ��ǰ�������󷵻ص�������
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            StringBuilder sb = new StringBuilder();
            String temp = null;
            while(null != (temp = br.readLine())){
                sb.append(temp);
            }

            /**
             * ��ӡ���
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


