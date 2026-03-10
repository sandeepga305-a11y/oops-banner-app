public class UC6_BannerApp {
    public static String[] getOOPSpattern() {
        return new String[]{

                "  ***    ***    *****   ***** ",
                " *   *  *   *   *    *  *     ",
                "*     **     *  *    *  *     ",
                "*     **     *  *****   ***** ",
                "*     **     *  *           * ",
                " *   *  *   *   *           * ",
                "  ***    ***    *       ***** "
        };
    }

    public static void main(String[] args) {
        String[] str=getOOPSpattern();
       for(int i=0;i<str.length;i++){
           System.out.println(str[i]);
       }
    }
}