package com.nanda.java8.workouts;


public class JoinerPopup  {



    static String joinerListItemPath = "//ul[contains(@class,'MuiList-root')]//li[contains(@class,'MuiListItem' ) and " +
            "contains(text(),'%s')]";


    public static String getMenuItem(String joinerIndex, String joinerInorOut) {
        /*return String.format(joinerListItemPath,
                String.format(String.format(ListItem.joiner, joinerIndex), joinerInorOut));*/

        return String.format(joinerListItemPath,String.format(ListItem.joiner, joinerIndex, joinerInorOut));
    }




    public interface ListItem {

        String joiner = "Joiner_%s_%s";

        public interface InItem {

            String in1 = "In1";
            String in2 = "In2";
            String out1 = "Out1";
        }

    }

    public static void main(String args[]){
        System.out.println(getMenuItem("2", ListItem.InItem.in1));
    }
}


