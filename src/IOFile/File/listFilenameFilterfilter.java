package IOFile.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by rohan on 11/9/17.
 */
public class listFilenameFilterfilter implements FilenameFilter {

        String str;

public listFilenameFilterfilter(String ext) {
        str = "."+ext;
        }

public static void main(String[] args) {
        File f = null;
        String[] paths;

        try {

        f = new File("/home/rohan/Documents/Intelij/idprogram/rajan3aug");

        FilenameFilter filter = new listFilenameFilterfilter("txt");

        paths = f.list(filter);

        for(String path:paths) {

        System.out.println(path);
        }

        } catch(Exception e) {

        e.printStackTrace();
        }
        }

@Override
public boolean accept(File dir, String name) {
        return name.endsWith(str);
        }
}