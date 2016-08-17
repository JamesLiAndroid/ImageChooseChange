package song.image.crop;

import java.io.File;

public class HDApp {
    private static HDApp instance = new HDApp();

    private File singleChooseFile;
    public static HDApp getInstance() {
        return instance;
    }

    public File getSingleChooseFile() {
        return singleChooseFile;
    }

    public void setSingleChooseFile(File singleChooseFile) {
        if(singleChooseFile ==null){//释放并删除已有图片
            if(this.singleChooseFile!=null && this.singleChooseFile.exists()){
                this.singleChooseFile.delete();
            }
        }else{
            this.singleChooseFile = singleChooseFile;
        }
    }
}
