public class StrBuff {

    static String get()
    {
        String str="pooja";
        for (int i=0;i<1000;i++)
        {
            str=str+"bhor";

        }
        return str;
    }

    static void check()
    {
        StringBuilder str=new StringBuilder("pooja");
        for(int i=0;i<1000;i++)
        {
            str=str.append("bhor");
        }
    }

    static void show()
    {
        StringBuffer stringBuffer=new StringBuffer("pooja");
        stringBuffer.replace(1,3,"bhor");
        System.out.println(stringBuffer);
        for (int i=0;i<1000;i++)
        {
            stringBuffer=stringBuffer.append("bhor");
        }
    }

    public static void main(String[] args) {

        show();
      Long strtime=System.currentTimeMillis();
        get();
        System.out.println("String time is "+(System.currentTimeMillis()-strtime));

        Long time=System.currentTimeMillis();
        check();
        System.out.println("StringBuilder time is "+(System.currentTimeMillis()-time));
        Long tim=System.currentTimeMillis();
        show();
        System.out.println("SringBuffer time is "+(System.currentTimeMillis()-tim));
    }
}