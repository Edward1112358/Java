package BigData;

import java.io.File;
import java.io.IOException;

/**
 * Created by Edward on 2017-1-16.
 */
public class GetMaxFreqIp {
    public static void main(String[] args) {
    /*
    * 1、第一次生成1亿(实际上最多为16581375)的ip地址，需要时间为3分多钟不到4分钟。
    */
        GenerateBigFile tooMuchIpFile = new GenerateBigFile();
        File ipFile = new File("e:/ipAddr.txt");
        try {
            ipFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        tooMuchIpFile.generateBigFile(ipFile, 100000000);
    }
}

