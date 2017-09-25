
/**
 * Created by rohan on 1/9/17.
 */


import java.io.IOException;


    public class StringReverse {
        static String str="In codekul java lecture";
        static char[] arr=str.toCharArray();
        static char[] arr1=new char[arr.length];
        static  String str1;
        static int i,j=0;


        public static void main(String[] args) throws IOException {
            for (String string : str.split(" ")) {
                {
                    arr1[j] = arr[i];
                    j++;
                }

                str1 = String.valueOf(arr1);
                System.out.println(str1);

            }


        }}