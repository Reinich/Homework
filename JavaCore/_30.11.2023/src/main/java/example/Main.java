package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
//    Написать функцию, создающую резервную копию всех файлов в директории во вновь созданную папку ./backup

    public static void main(String[] args) throws IOException {
//        print(new File("."), "", true, true);
        File directory = new File(new File("."), "backup");
        if (!directory.exists()) {
            directory.mkdir();
        }
        backup(new File("."), directory, true, true);
    }

    static void backup(File root, File backup, boolean isLastDir, boolean isLastFile) throws IOException {
        File[] files = root.listFiles();
        if (files == null) return;

        int subDirTotal = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory())
                subDirTotal++;
        }

        int subFileTotal = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                subFileTotal++;
            }
        }

        int subDirCounter = 0;
        int subFileCounter = 0;

//        if (isLastDir && isLastFile) {

        for (int i = 0; i < files.length; i++) {
            File tmp = new File(backup, files[i].getName());


            if (files[i].isDirectory() && !files[i].getName().equalsIgnoreCase("backup")) {
                tmp.mkdir();
                System.out.println("Papka "+ files[i]);
                System.out.println();
                backup(files[i], tmp, subDirTotal == ++subDirCounter, subFileTotal == subFileCounter);
            }


            if (files[i].isFile()) {

//                try (FileOutputStream fileOutputStream = new FileOutputStream(files[i].getName())) {
                try (FileOutputStream fileOutputStream = new FileOutputStream(files[i])) {
                    int c;

                    try (FileInputStream fileInputStream = new FileInputStream(files[i])) {

                        while ((c = fileInputStream.read()) != -1) {
                            fileOutputStream.write(c);

                        }
                    }
                }
                System.out.println("File "+ files[i]);
                System.out.println(files[i]);
                System.out.println();
                backup(files[i], tmp, subDirTotal == subDirCounter, subFileTotal == ++subFileCounter);
            }
        }

//        }

    }

    static void print(File file, String indent, boolean isLastDir, boolean isLastFile) {
        System.out.print(indent);
        if (isLastDir && isLastFile) {
            System.out.print("└─");
            indent += "  ";
        } else {
            System.out.print("├─");
            indent += "│ ";
        }
        System.out.println(file.getName());

        File[] files = file.listFiles();
        if (files == null)
            return;

        int subDirTotal = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory())
                subDirTotal++;
        }

        int subFileTotal = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                subFileTotal++;
            }
        }

        int subDirCounter = 0;
        int subFileCounter = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                print(files[i], indent, subDirTotal == ++subDirCounter, subFileTotal == subFileCounter);
            }
            if (files[i].isFile()) {
                print(files[i], indent, subDirTotal == subDirCounter, subFileTotal == ++subFileCounter);
            }
        }
    }

}
