//
//import java.util.Stack;
//
//public class StringRev
//{
//    public static void main(String[] args) {
//StringRev gh=new StringRev();
//        String originalString = "abc def ghi";
//        StringBuilder resultBuilder = new StringBuilder();
//        for (String string : originalString.split(" ")) {
//            String revStr = new StringBuilder(string).reverse().toString();
//            revStr = Character.toUpperCase(revStr.charAt(0))
//                    + revStr.substring(1);
//            resultBuilder.append(revStr).append(" ");
//        }
//        System.out.println(resultBuilder.toString());
//
//    }
//
//}