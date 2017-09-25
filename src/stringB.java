public class stringB {
    public static String concatwithString(){
        String t="Java";
    for(int i=0;i<10000; i++){
        t=t+"Tpoint";}
        return t;
}
public static String concatwithStringBuffer(){
        StringBuffer sb=new StringBuffer("Java");
        for(int i=0;i<10000;i++){
            sb.append("Tpoint");

        }
        return sb.toString();
}
    public static String concatwithStringBuilder(){
        StringBuilder sb=new StringBuilder("Java");
        for(int i=0;i<10000;i++){
            sb.append("Tpoint");

        }
        return sb.toString();
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatwithString();
        System.out.println("time taken by concating with String:"+(System.currentTimeMillis()-startTime)+"ms");
        long startTim=System.currentTimeMillis();
        concatwithStringBuffer();
        System.out.println("Time taken by concating with StringBuffer:"+(System.currentTimeMillis()-startTim)+"ms");
        long startTi=System.currentTimeMillis();
        concatwithStringBuilder();
        System.out.println("Time taken by concating with StringBuilder:"+(System.currentTimeMillis()-startTi)+"ms");

    }
}

