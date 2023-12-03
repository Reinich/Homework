package org.example;

import java.io.File;

// Доработать метод print, необходимо распечатывать директории и файлы
public class Tree {

    public static void main(String[] args) {
        print(new File("."), "", true);
    }

    static void print(File file, String indent, boolean isLastDir) {
        System.out.print(indent);
        if (isLastDir) {
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
                print(files[i], indent, subDirTotal == ++subDirCounter);
            }
            if (files[i].isFile()) {
                print(files[i], indent, (subFileTotal == ++subFileCounter && subDirTotal == subDirCounter));
            }
        }
    }
}
