package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Backup {
// Написать функцию, создающую резервную копию всех файлов в директории во вновь созданную папку ./backup

    public static void main(String[] args) throws IOException {
        File directory = new File(new File("."), "backup");
        if (!directory.exists()) {
            directory.mkdir();
        }
        backup(new File("."), directory);
    }

    static void backup(File root, File backup) throws IOException {
        File[] files = root.listFiles();
        if (files == null) return;

        for (int i = 0; i < files.length; i++) {
            File tmp = new File(backup, files[i].getName());
            if (files[i].isDirectory() && !files[i].getName().equalsIgnoreCase("backup")) {
                tmp.mkdir();
                backup(files[i], tmp);
            }
            if (files[i].isFile()) {
                try (FileOutputStream fileOutputStream = new FileOutputStream(tmp + files[i].getName())) {
                    int c;
                    try (FileInputStream fileInputStream = new FileInputStream(files[i])) {
                        while ((c = fileInputStream.read()) != -1) {
                            fileOutputStream.write(c);
                        }
                    }
                }
                backup(files[i], tmp);
            }
        }
    }
}
