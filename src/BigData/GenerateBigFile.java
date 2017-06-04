package BigData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.security.SecureRandom;

/**
 * Created by Edward on 2017-1-16.
 */
public class GenerateBigFile {
    /**
     * 生成大文件
     * @param ipFile
     * @param numberOfLine
     */
    public void generateBigFile(File ipFile, long numberOfLine){
        BufferedWriter bw = null;
        FileWriter fw = null;
        long startTime = System.currentTimeMillis();
        try{
            fw = new FileWriter(ipFile,true);
            bw = new BufferedWriter(fw);

            SecureRandom random = new SecureRandom();
            for (int i = 0; i < numberOfLine; i++) {
                bw.write("10."+random.nextInt(255)+"."+random.nextInt(255)+"."+random.nextInt(255)+"\n");
                if((i+1) % 1000 == 0){
                    bw.flush();
                }
            }
            bw.flush();

            long endTime = System.currentTimeMillis();
            /// System.err.println(DateUtil.convertMillsToTime(endTime - startTime));
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(fw != null){
                    fw.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
            try{
                if(bw != null){
                    bw.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
