package practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class General {
    
    public static void main (String... ars) throws IOException{
        System.out.println(PostgreSQL.findRecord("LISTUSERS","NAMEUSER","Петр"));



        //String file = "XLS.xls";
        //String findWord = "qwerty";
        //int sheetNum = 0;
        //String changeTXT = "a,b,c";
        //String[] roleThings = {"qwe","rty","ewq"};
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
        
        //ReadXLS.changeCell(file, 0, 0, 0, "nnnn");
        
        // Поиск в xls, на введеном номере страницы и ячейки, в случае введения замены - проиходит замена, иначе - удаление записи.
        
        //System.out.println(LogisticsRole.setRole(roleThings)); //Поиск роли по должности, отделу и деятельности String post, String activity, String department
    
        //String [] s = changeTXT.split(",");
        //for (String h:s){
        //    System.out.println(h);
        //}        
    }
    
}
