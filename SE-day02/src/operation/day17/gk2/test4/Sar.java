package operation.day17.gk2.test4;

import java.io.File;
import java.io.FileFilter;

public class Sar implements FileFilter {

    @Override
    public boolean accept(File pathname) {
            if (pathname.getName().endsWith(".java")) {
                return true;
            } else {
                return false;
            }
    }
}
