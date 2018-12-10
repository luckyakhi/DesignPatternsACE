package ace.java.designpatterns.usecase;

import ace.java.designpatterns.domain.Trade;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TradeFeedProcessor {
    public static void main(String[] args) throws IOException {
        String srcDir  = args[0];
        Files.walk(Paths.get(srcDir)).filter(Files::isDirectory).forEach( file ->     {
            try {
               List<String> trades = FileUtils.readLines(file.toFile(),"UTF-8");
                trades.forEach(trade -> {
                    String[] tradeAtrs = trade.split(",");
                    Trade tr = new Trade(getDate(tradeAtrs[0]),tradeAtrs[1],tradeAtrs[2],tradeAtrs[3]);
                    List<String> validCusipList = Arrays.asList("RIL","SBI","JPMC");
                    if(validCusipList.contains(tr)){
                        //write so success file
                    }else{
                        //write so error file
                    }
                });

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private static Date getDate(String tradeAtr) {
        return  new Date();
    }
}
