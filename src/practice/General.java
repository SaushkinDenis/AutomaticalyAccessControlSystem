package practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class General {
    
    public static void main (String... ars) throws IOException{
        String file = "XLS.xls";
        String findWord = "";
        /* System.out.println("Создание (субъект, объект, роль)");
        Scanner scan = new Scanner(System.in);
        
        String[] outmas = {};
        int sheet = 0;
        
        CreateXLS.CreateXLS(file);
        
        int action = scan.nextInt();
        switch(action){
        case 1:
        outmas = CreateRecord.createRecord();
        sheet = 0;
        break;
        
        case 2:
        outmas = CreateObject.createObject();
        sheet = 1;
        break;
        
        case 3:
        outmas = CreateRole.createRole();
        sheet = 2;
        break;
        
        }
        
        
        List<String> ls = Arrays.asList(outmas);
        CreateXLS.writeToXLS(file, ls, sheet); */
        
        //System.out.println(ReadXLS.parse(file));
        //ReadXLS.changeCell(file, 0,0,0,"nnnn");
        ReadXLS.find(file,findWord);
        
    }
    
}
