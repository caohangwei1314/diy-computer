package com.example.demo.utils;

import org.springframework.util.Base64Utils;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.util.UUID;

public class UploadUtil {

    public static final String SERVICE_PRODUCTS_PATH = "E:\\diy-image\\";

    private String dataPrix;

    private String data;

    public String upload(String base64Data){
        if(base64Data == null || "".equals(base64Data)){
            return null;
        }else{
            String [] d = base64Data.split("base64,");
            if(d != null && d.length == 2){
                this.dataPrix = d[0];
                this.data = d[1];
            }else{
                return null;
            }
        }
        String suffix = "";
        if("data:image/jpeg;".equalsIgnoreCase(dataPrix)){//data:image/jpeg;base64,base64编码的jpeg图片数据
            suffix = ".jpg";
        } else if("data:image/x-icon;".equalsIgnoreCase(dataPrix)){//data:image/x-icon;base64,base64编码的icon图片数据
            suffix = ".ico";
        } else if("data:image/gif;".equalsIgnoreCase(dataPrix)){//data:image/gif;base64,base64编码的gif图片数据
            suffix = ".gif";
        } else if("data:image/png;".equalsIgnoreCase(dataPrix)){//data:image/png;base64,base64编码的png图片数据
            suffix = ".png";
        }else{
            return null;
        }
        String fileName;
        try
        {
            //Base64解码
            byte[] b = Base64Utils.decodeFromString(data);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {
                    //调整异常数据
                    b[i]+=256;
                }
            }
            fileName = UUID.randomUUID().toString() + suffix;
            String imgFilePath = this.SERVICE_PRODUCTS_PATH+fileName;
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return fileName;
        }
        catch (Exception e)
        {
            return null;
        }
    }

    public String toBase64(String image){
        InputStream inputStream = null;
        byte[] data = null;
        String imgFile = this.SERVICE_PRODUCTS_PATH+image;
        try {
            inputStream = new FileInputStream(imgFile);
            data = new byte[inputStream.available()];
            inputStream.read(data);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 加密
        BASE64Encoder encoder = new BASE64Encoder();
        String Data = "data:image/png;base64," + encoder.encode(data);
        return Data;
    }

    public Boolean delete(String fileName)
    {
        File oldFile = new File(this.SERVICE_PRODUCTS_PATH+fileName);
        if(oldFile.exists()){
            oldFile.delete();
            return true;
        }else{
            return false;
        }
    }
}
