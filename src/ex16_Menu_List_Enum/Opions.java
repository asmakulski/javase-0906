package ex16_Menu_List_Enum;

import java.util.EnumSet;

public enum Opions {

    ADD, COPY, EDIT, REMOVE;

    public static void printAllOptions(){
        EnumSet<Opions> allOptions = EnumSet.allOf(Opions.class);
        System.out.println(allOptions);
    }

    public static void getOption(){

    }

}


