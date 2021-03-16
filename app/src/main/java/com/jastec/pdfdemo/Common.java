package com.jastec.pdfdemo;

import android.content.Context;
import android.os.Environment;

import java.io.File;

public class Common {
    public static  String getAppPath(Context context)
    {
        File dir = new File( context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS) + File.separator);
        if(!dir.exists())
            dir.mkdir();
        return dir.getPath()+ File.separator ;
    }

}
